package Clase3.Ejercicios.pag161;

import java.util.Scanner;

public class Ejerci2 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1, num2;

        System.out.print("Digite el primer numero: ");
        num1 = sc.nextInt();

        System.out.print("Digite el segundo numero: ");
        num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("El primer numero es el mayor");
        } else if (num1 < num2) {
            System.out.println("El primer numero es el mas pequeño");
        } else {
            System.out.println("Ambos numeros tienen el mismo valor");
        }

        sc.close();
    }
}
