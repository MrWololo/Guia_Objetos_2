package tarea.ejercicio_1;

import java.util.ArrayList;

/**
 * Libro
 */
public class Libro {

    String titulo;
    double precio;
    int stock;
    ArrayList<Autor> autores = new ArrayList<>();

    public Libro() {
    }

    public Libro(String titulo, double precio, int stock, ArrayList<Autor> autores) {
        this.titulo = titulo;
        this.precio = precio;
        this.stock = stock;
        this.autores = autores;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public double getPrecio() {
        return this.precio;
    }

    public int getStock() {
        return this.stock;
    }

    public ArrayList<Autor> getAutores() {
        return this.autores;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void agregarStock(int nStock) {
        this.stock += nStock;
    }

    @Override
    public String toString() {
        return "{" + " titulo='" + getTitulo() + "'" + ", precio='" + getPrecio() + "'" + ", stock='" + getStock() + "'"
                + ", autor='" + getAutores().toString() + "'" + "}";
    }

    public String toMensaje() {

        StringBuffer buffer = new StringBuffer();
        buffer.append("El libro, ");
        buffer.append(titulo);
        buffer.append(" de ");

        for (Autor autor : autores) {
            buffer.append(autor.nombre);
            buffer.append(" ");
            buffer.append(autor.apellido);
            buffer.append("; ");
        }

        buffer.append(" Se vende a ");
        buffer.append(precio);
        buffer.append(" pesos");

        return buffer.toString();
    }
}