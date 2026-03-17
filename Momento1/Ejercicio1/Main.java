package Ejercicio1;

public class Main {

    public static void main(String[] args) {

        CuentaBancaria cuenta1 = new CuentaBancaria("111AB52DF", "Juan David", 1000);

        cuenta1.mostrarDatos();
        cuenta1.depositar(500);
        cuenta1.retirar(300);

        System.out.println("Saldo final: " + cuenta1.consultarSaldo());
    }

}
