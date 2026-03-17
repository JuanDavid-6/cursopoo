package Ejercicio2;

public class libro {

    private String titulo;
    private String autor;
    private String ISBN;
    private int numeroPaginas;
    private boolean disponible;

    public libro(String titulo, String autor, String ISBN, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.numeroPaginas = numeroPaginas;
        this.disponible = true;
    }

    public void prestar() {
        if (disponible) {
            disponible = false;
            System.out.println("El libro fue prestado.");
        } else {
            System.out.println("El libro no está disponible.");
        }
    }

    public void devolver() {
        if (!disponible) {
            disponible = true;
            System.out.println("El libro fue devuelto.");
        } else {
            System.out.println("El libro ya estaba disponible.");
        }
    }

    public boolean estaDisponible() {
        return disponible;
    }

    public void mostrarDatos() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Páginas: " + numeroPaginas);
        System.out.println("Disponible: " + disponible);
    }
}
