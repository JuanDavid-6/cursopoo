package Clase3.Ejercicios.pag161;

import java.util.Scanner;

public class EjercicioC {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
         * c) Si el número es positivo, sumar el numeral a total de positivos, sino
         * sumar al total de negativos.
         */

        int num, tp = 0, tn = 0;

        System.out.print("Digite un numero: ");
        num = sc.nextInt();

        if (num > 0) {
            tp = tp + num;

        } else {
            tn = tn + num;
        }

        System.out.println("Total numeros positivos: " + tp);
        System.out.println("Total numeros negativos: " + tn);

        sc.close();
    }
}
