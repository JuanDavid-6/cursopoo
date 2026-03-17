package Ejercicio4;

public class Perfume {

    private String nombre;
    private String marca;
    private double capacidad;
    private double precio;

    public Perfume(String nombre, String marca, double capacidad, double precio) {
        this.nombre = nombre;
        this.marca = marca;
        this.capacidad = capacidad;
        this.precio = precio;
    }

    public void aplicarPerfume(double cantidad) {
        if (cantidad > 0 && cantidad <= capacidad) {
            capacidad -= cantidad;
            System.out.println("Perfume aplicado.");
        } else {
            System.out.println("Cantidad inválida o insuficiente.");
        }
    }

    public double consultarCantidadRestante() {
        return capacidad;
    }

    public void ajustarPrecio(double nuevoPrecio) {
        if (nuevoPrecio > 0) {
            precio = nuevoPrecio;
            System.out.println("Precio actualizado.");
        } else {
            System.out.println("Precio inválido.");
        }
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Marca: " + marca);
        System.out.println("Capacidad: " + capacidad + " ml");
        System.out.println("Precio: " + precio);
    }

}
