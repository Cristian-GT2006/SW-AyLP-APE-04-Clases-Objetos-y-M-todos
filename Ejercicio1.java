// APE 4 - Ejercicio 1: Libro y Autor (objeto como atributo)

// Clase Autor: guarda los datos del autor
class Autor {
    private String nombre;
    private String nacionalidad;

    public Autor(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() { return nombre; }
    public String getNacionalidad() { return nacionalidad; }
}

// Clase Libro: tiene un objeto Autor como atributo
class Libro {
    private String titulo;
    private int anio;
    private Autor autor; // objeto como atributo

    public Libro(String titulo, int anio, Autor autor) {
        this.titulo = titulo;
        this.anio = anio;
        this.autor = autor;
    }

    // Imprime título, año y nombre del autor
    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Año: " + anio);
        System.out.println("Autor: " + autor.getNombre());
        System.out.println("-------------------------");
    }
}

public class Ejercicio1 {
    public static void main(String[] args) {
        Autor a1 = new Autor("Gabriel García Márquez", "Colombiana");
        Autor a2 = new Autor("Jorge Icaza", "Ecuatoriana");

        Libro l1 = new Libro("Cien años de soledad", 1967, a1);
        Libro l2 = new Libro("Huasipungo", 1934, a2);

        l1.mostrarInformacion();
        l2.mostrarInformacion();
    }
}
