package Ejercicios.pag161;

import java.util.Scanner;

public class EjercicioA {
    
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
         * a) Si un ángulo es igual a 90, imprimir el mensaje ''El ángulo
         * es recto'' sino imprimir el mensaje ''El ángulo no es recto''.
         */

        int Angulo;

        System.out.print("Digite el valor del angulo:  ");
        Angulo = sc.nextInt();

        if (Angulo == 900) {
            System.out.println("El angulo es recto");

        } else {
            System.out.println("El angulo no es recto");
        }

        sc.close();
    }
}
