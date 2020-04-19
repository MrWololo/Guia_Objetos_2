package tarea.ejercicio_3;

import java.util.UUID;

public class Cliente {

    UUID id;
    String nombre;
    char genero;

    public Cliente() {
    }

    public Cliente(String nombre, char genero) {
        this.id = UUID.randomUUID();
        this.nombre = nombre;
        this.genero = genero;
    }

    public UUID getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public char getGenero() {
        return this.genero;
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", nombre='" + getNombre() + "'" + ", genero='" + getGenero() + "'"
                + "}";
    }

}