package Ejercicios.pag161;

import java.util.Scanner;

public class EjercicioB {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
         * b) Si la temperatura es superior a 100 C, visua-lizar el mensaje “por encima
         * del punto de ebullición del agua” sino visualizar el mensaje “por debajo del
         * punto de ebullición del agua”.
         */

        int tem;

        System.out.print("Digite la temperatura en grados °C: ");
        tem = sc.nextInt();

        if (tem > 100) {
            System.out.println("Por emcima del punto de ebullicion del agua");

        } else {
            System.out.println("Por debajo del punto de ebullicion del agua");
        }

        sc.close();

    }
}
