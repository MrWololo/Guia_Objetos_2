package tarea.ejercicio_3;

import java.util.UUID;

public class Cuenta {

    UUID id;
    double balance;
    Cliente cliente;
    double deuda = 0;

    public Cuenta(double balance, Cliente cliente, double deuda) {
        try {
            if (balance >= 0 && deuda == 0 || balance == 0 && deuda <= 2000) {
                this.id = UUID.randomUUID();
                this.balance = balance;
                this.cliente = cliente;
                this.deuda = deuda;
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("ERROR: Conflicto de constructor, revise su balance y deuda");
        }

    }

    public void depositar(double monto) {

        try {
            if (this.cliente != null) {
                this.balance += monto;
                Almacenamiento.set(cliente.getNombre() + " depositó " + monto);
            } else {
                throw new NullPointerException();
            }

        } catch (NullPointerException e) {
            System.out.println("No existe cliente");
        }

    }

    public void extraer(double monto) {
        try {
            if (this.balance - monto > 0) {
                this.balance -= monto;
                Almacenamiento.set(cliente.getNombre() + " retiró " + monto);
            } else if (monto > this.balance && monto < this.balance + 2000) {
                Almacenamiento.set(cliente.getNombre() + " retiró " + monto);
                monto -= this.balance;
                this.balance = 0;
                deuda += monto;
            } else {
                throw new Exception();
            }

        } catch (Exception e) {
            System.out.println("ERROR: Balance no suficiente para extraccion");
        }

    }

    public String getId() {
        return this.id.toString();
    }

    public double getBalance() {
        return this.balance;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public double getDeuda() {
        return deuda;
    }

    @Override
    public String toString() {
        return "{" + " id='" + getId() + "'" + ", balance='" + getBalance() + "'" + ", cliente='" + getCliente() + "'"
                + ", deuda='" + getDeuda() + "'" + "}";
    }

}
