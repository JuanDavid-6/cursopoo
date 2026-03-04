package Clase3.Ejercicios.pag161;

import java.util.Scanner;

public class EjercicioE {
    
        public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

            /* e)  Si distancia es mayor que 20 y menos que 35, leer un valor para tiempo. */

            int d, t ;

            System.out.print("Digite la distancia: ");
            d = sc.nextInt();

            if (d > 20 && d < 35 ) {
                System.out.print("Digite el valor del tiempo: ");
                t = sc.nextInt();
                
            }

        sc.close();
    }
    
}
