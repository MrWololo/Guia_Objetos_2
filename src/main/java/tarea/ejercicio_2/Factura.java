package tarea.ejercicio_2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.UUID;

public class Factura {

    private UUID id;
    private String fecha;
    private Cliente cliente;

    private ArrayList<ItemVenta> items;

    public Factura(Cliente cliente, ArrayList<ItemVenta> items) {
        this.id = UUID.randomUUID();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        this.fecha = formatter.format(LocalDateTime.now());
        this.cliente = cliente;

        this.items = items;
    }

    public Factura() {
    }

    public double getTotal() {
        double total = 0;
        for (ItemVenta itemVenta : items) {
            total += itemVenta.getPrecio();
        }
        return total;
    }

    public double getDescontado() {
        return getTotal() - ((getCliente().getDescuento() * getTotal()) / 100);
    }

    public UUID getId() {
        return this.id;
    }

    public String getFecha() {
        return this.fecha;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public ArrayList<ItemVenta> getItems() {
        return this.items;
    }

    public void agregarItem(ItemVenta itemVenta) {
        this.items.add(itemVenta);
    }

    public void agregarVariosItems(ArrayList<ItemVenta> items) {
        this.items.addAll(items);
    }

    @Override
    public String toString() {
        return "[" + " id='" + getId() + "'" + ", fecha='" + getFecha() + "'" + ", monto='" + getTotal() + "'"
                + ", montoDesc='" + "'" + getDescontado() + "'" + ", cliente='" + getCliente().toString() + "'" + ", items='" + getItems() + "'" + "]";
    }

    

}