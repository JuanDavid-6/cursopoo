package Ejercicio3;

public class Main {
    public static void main(String[] args) {

        producto producto1 = new producto("PC", "P001", 10, 2500);
        producto producto2 = new producto("Mouse", "P002", 50, 50);

        producto1.mostrarDatos();

        producto1.anadirStock(5);
        producto1.reducirStock(3);

        System.out.println("Valor total inventario: " + producto1.calcularValorInventario());
    }

}
