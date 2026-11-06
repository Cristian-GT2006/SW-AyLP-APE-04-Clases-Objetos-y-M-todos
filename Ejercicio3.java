// APE 4 - Ejercicio 3: Producto y Venta (objeto como parámetro)

class Producto {
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public double getPrecio() { return precio; }
    public int getStock() { return stock; }

    // Solo reduce el stock si hay suficiente
    public void reducirStock(int cantidad) {
        if (cantidad <= stock) {
            stock -= cantidad;
        } else {
            System.out.println("Stock insuficiente.");
        }
    }

    public void mostrarProducto() {
        System.out.println("Producto: " + nombre + " | Precio: $" + precio + " | Stock: " + stock);
    }
}

class Venta {
    private int cantidad;

    public Venta(int cantidad) {
        this.cantidad = cantidad;
    }

    // Recibe un Producto como parámetro, reduce el stock y muestra el total
    public void aplicar(Producto producto) {
        int stockAntes = producto.getStock();
        producto.reducirStock(cantidad);
        if (producto.getStock() == stockAntes - cantidad) { // la venta se realizó
            double total = cantidad * producto.getPrecio();
            System.out.println("Total a pagar: $" + total);
        }
    }
}

public class Ejercicio3 {
    public static void main(String[] args) {
        Producto p = new Producto("Laptop", 750.0, 5);
        p.mostrarProducto();

        Venta v1 = new Venta(2);   // válida
        v1.aplicar(p);
        p.mostrarProducto();

        Venta v2 = new Venta(10);  // stock insuficiente
        v2.aplicar(p);
        p.mostrarProducto();
    }
}
