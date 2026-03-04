package Clase3.Ejercicios.pagi157;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        /*
         * Determinar el precio del billete de ida y vuelta en avión, conociendo la
         * distancia a recorrer y sabiendo que si el número de días de estancia es
         * superior a 7 y la distancia superior a 800 km el billete tiene una reducción
         * del 30 por 100. El precio por km es de 2.5 euros.
         */

        Scanner sc = new Scanner(System.in);

        int e; // duracion en dias
        double d, Pt = 2.5; // El precio por km es de 2.5 euros

        System.out.print("Digite la duracion en dias:  ");
        e = sc.nextInt();

        System.out.println();

        System.out.print("Digite la distancia en Km:  ");
        d = sc.nextDouble();

        Pt = 2.5 * d;

        if (d > 800 & e > 7) {
            Pt = Pt - (Pt * 30 / 100);
        }

        System.out.println("Precio del billete es de:   " + Pt);

        sc.close();
    }

}
