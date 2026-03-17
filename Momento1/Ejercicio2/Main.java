package Ejercicio2;

public class Main {

     public static void main(String[] args) {

        libro libro1 = new libro("El principito", "Antoine de Saint-Exupéry", "123", 96);
        libro libro2 = new libro("1984", "George Orwell", "456", 328);

        libro1.mostrarDatos();

        libro1.prestar();
        libro1.prestar();
        libro1.devolver();

        System.out.println("¿Está disponible? " + libro1.estaDisponible());
    }



}
