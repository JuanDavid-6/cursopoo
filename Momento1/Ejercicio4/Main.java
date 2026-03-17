package Ejercicio4;

public class Main {

     public static void main(String[] args) {

        Perfume perfume1 = new Perfume("Aqua", "Dior", 100, 300);

        perfume1.mostrarDatos();

        perfume1.aplicarPerfume(10);
        System.out.println("Cantidad restante: " + perfume1.consultarCantidadRestante());

        perfume1.ajustarPrecio(350);
        perfume1.mostrarDatos();
    }

}
