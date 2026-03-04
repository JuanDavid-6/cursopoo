package Clase3.Ejercicios.pag161;

import java.util.Scanner;

public class EjercicioD {
    
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            /* d) Si x es mayor que y, y z es menor que 20, leer un valor para p. */

            int x, y, z, p;

            System.out.print("Digite el valor de x: ");
            x = sc.nextInt();

            System.out.print("Digite el valor de y: ");
            y = sc.nextInt();

            System.out.print("Digite el valor de z: ");
            z = sc.nextInt();

            if (x > y && z < 20) {
                System.out.print("Digite el valor de p: ");
                p = sc.nextInt(); 
                
            }
            
            sc.close();
        }

}
