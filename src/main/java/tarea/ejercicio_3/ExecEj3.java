package tarea.ejercicio_3;

public class ExecEj3 {

    public static Cliente a() {
        final Cliente cliente = new Cliente("John Dou", 'M');
        System.out.println(cliente.toString());
        return cliente;
    }

    public static Cuenta b(final Cliente cliente) {
        final Cuenta cuenta = new Cuenta(10000, cliente, 0);
        System.out.println(cuenta.toString());
        return cuenta;
    }

    public static Cuenta c(Cuenta cuenta) {
        final double deposito = 4000;
        final double extraccion = 2500;

        cuenta.depositar(deposito);
        System.out.println(cuenta.toString());

        cuenta.extraer(extraccion);
        System.out.println(cuenta.toString());

        return cuenta;
    }

    public static void d(Cuenta cuenta) {
        cuenta.extraer(10000);
        System.out.println(cuenta.toString());
        cuenta.extraer(2000);
    }

    public static void e() {

        for (String string : Almacenamiento.get()) {
            System.out.println(string);
        }
    }

}