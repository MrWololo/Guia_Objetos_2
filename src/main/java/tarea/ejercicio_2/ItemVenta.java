package tarea.ejercicio_2;

import java.util.UUID;

public class ItemVenta {

    private UUID id;
    private String nombre;
    private String descripcion;
    private double precio;

    public ItemVenta() {
    }

    public ItemVenta(String nombre, String descripcion, double precio) {
        this.id = UUID.randomUUID();
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public UUID getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public double getPrecio() {
        return this.precio;
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", nombre='" + getNombre() + "'" + ", descripcion='" + getDescripcion()
                + "'" + ", precio='" + getPrecio() + "'" + "}";
    }

}