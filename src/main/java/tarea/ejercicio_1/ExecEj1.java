package tarea.ejercicio_1;

import java.util.ArrayList;

/**
 * ExecEj1
 */
public class ExecEj1 {

    public static Autor a() {
        return new Autor("Joshua", "Bloch", "joshua@email.com", 'M');
    }

    public static void b(Autor autor) {
        System.out.println(autor.toString());
    }

    public static Libro c(Autor autor) {
        ArrayList<Autor> autores = new ArrayList<>();
        autores.add(autor);

        return new Libro("Effective Java", 450, 150, autores);
    }

    public static void d(Libro libro) {
        System.out.println(libro.toString());
    }

    public static Libro e(Libro libro) {
        libro.setPrecio(500);
        libro.agregarStock(50);
        return libro;
    }

    public static void f(Libro libro) {
        try {
            System.out.println(libro.getAutores().get(0).toString());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("No existen autores");
        }

    }

    public static void g(Libro libro) {
        System.out.println(libro.toMensaje());
    }

}