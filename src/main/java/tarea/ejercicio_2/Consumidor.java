package tarea.ejercicio_2;

import java.util.UUID;

public class Consumidor {

    private UUID id;
    private String nombre;
    private String email;
    private int descuento;

    public Consumidor(String nombre, String email, int descuento) {
        this.id = UUID.randomUUID();
        this.nombre = nombre;
        this.email = email;
        this.descuento = descuento;
    }

    public Consumidor() {
	}

	public UUID getId() {
        return this.id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getEmail() {
        return this.email;
    }

    public int getDescuento() {
        return this.descuento;
    }

    @Override
    public String toString() {
        return "Consumidor[" + " id='" + getId() + "'" + ", nombre='" + getNombre() + "'" + ", email='" + getEmail() + "'"
                + ", descuento='" + getDescuento() + "'" + "]";
    }

}