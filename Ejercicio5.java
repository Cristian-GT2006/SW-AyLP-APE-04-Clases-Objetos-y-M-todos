// APE 4 - Ejercicio 5: Biblioteca (colaboración entre clases)

class Usuario {
    private String nombre;
    private String cedula;

    public Usuario(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public String getNombre() { return nombre; }
    public String getCedula() { return cedula; }
}

class Libro {
    private String titulo;
    private boolean disponible;

    public Libro(String titulo, boolean disponible) {
        this.titulo = titulo;
        this.disponible = disponible;
    }

    public String getTitulo() { return titulo; }

    // Si está disponible lo presta y retorna true; si no, retorna false
    public boolean prestar() {
        if (disponible) {
            disponible = false;
            return true;
        }
        return false;
    }

    public void devolver() {
        disponible = true;
    }
}

class Prestamo {
    private Usuario usuario;
    private Libro libro;

    public Prestamo(Usuario usuario, Libro libro) {
        this.usuario = usuario;
        this.libro = libro;
    }

    // Intenta prestar el libro y muestra un mensaje según el resultado
    public void registrar() {
        if (libro.prestar()) {
            System.out.println("Préstamo exitoso: " + usuario.getNombre() + " tiene el libro \"" + libro.getTitulo() + "\".");
        } else {
            System.out.println("No disponible: " + usuario.getNombre() + " no pudo prestar \"" + libro.getTitulo() + "\".");
        }
    }
}

public class Ejercicio5 {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("María", "1801234567");
        Usuario u2 = new Usuario("Pedro", "1807654321");
        Libro libro = new Libro("Java programación: teoría y ejemplos", true);

        new Prestamo(u1, libro).registrar(); // éxito
        new Prestamo(u2, libro).registrar(); // falla: ya está prestado
    }
}
