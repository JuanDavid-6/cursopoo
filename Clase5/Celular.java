package Clase5;

public class Celular {

    // Atributos
    String marca;
    String Modelo;
    int bateria = 100;

    // Metodo

    /*
     * Firma del metodo
     * publico
     * void ---> no retorna
     * el metodo tiene como nombre llamar
     * tiene un parametro y es de tipo entero
     */

    public void llamar(String numero) {
        System.out.println("Llamando al " + numero + "......");
        this.bateria -= 5;
    }
}
