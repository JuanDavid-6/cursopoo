package Ejercicio3;

public class producto {
    private String nombre;
    private String codigo;
    private int cantidadStock;
    private double precio;

    public producto(String nombre, String codigo, int cantidadStock, double precio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.cantidadStock = cantidadStock;
        this.precio = precio;
    }

    public void anadirStock(int cantidad) {
        if (cantidad > 0) {
            cantidadStock += cantidad;
            System.out.println("Stock añadido correctamente.");
        } else {
            System.out.println("Cantidad inválida.");
        }
    }

    public void reducirStock(int cantidad) {
        if (cantidad > 0 && cantidad <= cantidadStock) {
            cantidadStock -= cantidad;
            System.out.println("Stock reducido correctamente.");
        } else {
            System.out.println("No hay suficiente stock o cantidad inválida.");
        }
    }

    public double calcularValorInventario() {
        return cantidadStock * precio;
    }

    public void mostrarDatos() {
        System.out.println("Producto: " + nombre);
        System.out.println("Código: " + codigo);
        System.out.println("Stock: " + cantidadStock);
        System.out.println("Precio: " + precio);
    }

}
