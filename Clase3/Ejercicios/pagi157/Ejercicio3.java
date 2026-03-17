package Ejercicios.pagi157;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        /*
         * Construir un algoritmo que escriba los nombres de los días de la semana, en
         * función de la entrada correspondiente a la variable DÍA
         */

        Scanner sc = new Scanner(System.in);

        int Dia = 0;

        System.out.print("Digite un numero del 1 al 7: ");
        Dia = sc.nextInt();

        if (Dia == 1) {
            System.out.println("Lunes");

        } else if (Dia == 2) {
            System.out.println("Martes");

        } else if (Dia == 3) {
            System.out.println("Miercoles");

        } else if (Dia == 4) {
            System.out.println("Jueves");

        } else if (Dia == 5) {
            System.out.println("Viernes");

        } else if (Dia == 6) {
            System.out.println("Sabado");

        } else if (Dia == 7) {
            System.out.println("Domingo");

        } else {
            System.out.println("Error\nRango del 1 al 7");

        }

        sc.close();

    }
    
}
