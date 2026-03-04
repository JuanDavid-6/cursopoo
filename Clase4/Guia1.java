package Clase4;

import java.util.Scanner;

public class Guia1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
         * Se desea realizar una estadística de los pesos de los alumnos de un colegio
         * de acuerdo con la siguiente tabla: Alumnos de menos de 40 kg. Alumnos entre
         * 40 y 50 kg. Alumnos de más de 50 kg y menos de 60 kg. Alumnos de más o igual
         * a 60 kg
         */
        
        int menos40 = 0, entre40y50 = 0, entre50y60 = 0, mayorIgual60 = 0;

        System.out.println("Digite la cantidad de alumnos");
        int cantidad = sc.nextInt();

        for (int c = 1; c <= cantidad; c++) {

            System.out.print("Digite el peso del alumno en KG: ");
            int peso = sc.nextInt();

            if (peso < 40) {
                menos40 = menos40 + 1;

            } else if (peso <= 50) {
                entre40y50 = entre40y50 + 1;

            } else if (peso > 50 && peso < 60) {
                entre50y60 = entre50y60 + 1;

            } else if (peso >= 60) {
                mayorIgual60 = mayorIgual60 + 1;

            }

        }
        System.out.println("Alumnos menores a 40 kg: " + menos40);
        System.out.println("Alumnos entre 40 y 50 kg: " + entre40y50);
        System.out.println("Alumnos entre 50 y 60 kg: " + entre50y60);
        System.out.println("Alumnos de 60 kg o más: " + mayorIgual60);

        sc.close();
    }

}
