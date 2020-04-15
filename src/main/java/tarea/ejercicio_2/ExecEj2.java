package tarea.ejercicio_2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.UUID;

public class ExecEj2 {

    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    public static void a() {
        System.out.println("UUID.randomUUID: " + UUID.randomUUID());
        System.out.println("LocalDateTime.now: " + formatter.format(LocalDateTime.now()));
    }

    public static Cliente b() {
        Cliente cliente = new Cliente("John", "JohnDoe@gmail.com", 25);
        System.out.println(cliente.toString());
        return cliente;
    }

    public static Factura c(Cliente cliente) {
        ItemVenta jugo = new ItemVenta("jugo", "Baggio", 35);
        //ArrayList<ItemVenta> items = new ArrayList<>();
        //items.add(jugo);

        Factura factura = new Factura(cliente, null);
        factura.agregarItem(jugo);
        System.out.println("Total: " + factura.getTotal());
        System.out.println("Descontado " + factura.getCliente().getDescuento() + "%: ");
        System.out.println(factura.getDescontado());
        return factura;
    }

    public static void d(Factura factura) {
        System.out.println(factura.toString());
    }

    public static void e() {

        Cliente clienteTest = new Cliente("test", "test@test.com", 10);

        ArrayList<ItemVenta> items = new ArrayList<>();
        items.add(new ItemVenta("producto", "descripcion", 200));
        items.add(new ItemVenta("producto 2", "descripcion", 100));

        Factura factura = new Factura(clienteTest, items);

        System.out.println(factura.toString());

    }

}