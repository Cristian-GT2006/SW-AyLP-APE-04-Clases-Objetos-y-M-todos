// APE 4 - Ejercicio 2: Rectángulo (firmas de métodos con tipo de retorno correcto)

class Rectangulo {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    // Retorna el área (double)
    public double calcularArea() {
        return base * altura;
    }

    // Retorna el perímetro (double)
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    // Retorna true si base y altura son iguales (boolean)
    public boolean esCuadrado() {
        return base == altura;
    }

    // Retorna una descripción (String)
    public String obtenerDescripcion() {
        return "Rectángulo de " + base + " x " + altura;
    }

    // Imprime todos los resultados (void)
    public void mostrar() {
        System.out.println(obtenerDescripcion());
        System.out.println("Área: " + calcularArea());
        System.out.println("Perímetro: " + calcularPerimetro());
        System.out.println("¿Es cuadrado?: " + esCuadrado());
        System.out.println("-------------------------");
    }
}

public class Ejercicio2 {
    public static void main(String[] args) {
        Rectangulo r1 = new Rectangulo(4.0, 6.0);
        Rectangulo r2 = new Rectangulo(5.0, 5.0);
        r1.mostrar();
        r2.mostrar();
    }
}
