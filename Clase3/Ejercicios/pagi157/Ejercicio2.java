package Ejercicios.pagi157;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        /*
         * Los empleados de una fábrica trabajan en dos turnos: diurno y nocturno. Se
         * desea calcular el jornal diario de acuerdo con los siguientes puntos
         */

        Scanner sc = new Scanner(System.in);

        String dia, turno;
        double HT, jornal;

        System.out.print("Digite en que Turno se encuentra:  ");
        turno = sc.nextLine();

        System.out.print("Digite el dia de la semana:  ");
        dia = sc.nextLine();

        System.out.print("Digite las horas trabajadas:   ");
        HT = sc.nextDouble();

        if (!dia.equalsIgnoreCase("Domingo")) {

            if (turno.equalsIgnoreCase("diurno")) {
                jornal = 5 * HT;
            } else {
                jornal = 8 * HT;
            }

        } else {

            if (turno.equalsIgnoreCase("diurno")) {
                jornal = 7 * HT;
            } else {
                jornal = 11 * HT;
            }
        }

        System.out.println("El jornal diario es: " + jornal);

        sc.close();
    }
}
