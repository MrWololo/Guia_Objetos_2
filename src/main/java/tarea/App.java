package tarea;

//import java.util.ArrayList;
import java.util.Scanner;

import tarea.ejercicio_1.Autor;
import tarea.ejercicio_1.ExecEj1;
import tarea.ejercicio_1.Libro;
import tarea.ejercicio_2.Consumidor;
import tarea.ejercicio_2.ExecEj2;
import tarea.ejercicio_2.Factura;
import tarea.ejercicio_3.Cliente;
import tarea.ejercicio_3.Cuenta;
import tarea.ejercicio_3.ExecEj3;

public final class App {

    public static Scanner scan = new Scanner(System.in);

    public static void main(final String[] args) {
        char repeat = 's';

        Autor autor = new Autor();
        Libro libro = new Libro();

        Consumidor consumidor = new Consumidor();
        Factura factura = new Factura();

        Cliente cliente = new Cliente();
        Cuenta cuenta = new Cuenta(0, null, 0);

        while (repeat == 's') {

            VisualMenu.principal();
            final int ejercicio = scan.nextInt();
            int punto;
            switch (ejercicio) {
                case 1:
                    VisualMenu.ej1();
                    punto = scan.nextInt();
                    switch (punto) {
                        case 1:
                            autor = ExecEj1.a();
                            System.out.println("Joshua inicializado");
                            break;
                        case 2:
                            ExecEj1.b(autor);
                            break;
                        case 3:
                            libro = ExecEj1.c(autor);
                            System.out.println("Inicializado Effective java");
                            break;
                        case 4:
                            ExecEj1.d(libro);
                            break;
                        case 5:
                            libro = ExecEj1.e(libro);
                            System.out.println("modificado precio y stock");
                            break;
                        case 6:
                            ExecEj1.f(libro);
                            break;
                        case 7:
                            ExecEj1.g(libro);
                            break;
                    }
                    break;

                case 2:
                    VisualMenu.ej2();
                    punto = scan.nextInt();
                    switch (punto) {
                        case 1:
                            ExecEj2.a();
                            break;
                        case 2:
                            consumidor = ExecEj2.b();
                            break;
                        case 3:
                            factura = ExecEj2.c(consumidor);
                            break;
                        case 4:
                            ExecEj2.d(factura);
                            break;
                        case 5:
                            ExecEj2.e();
                            break;
                    }
                    break;

                case 3:
                    VisualMenu.ej3();
                    punto = scan.nextInt();
                    switch (punto) {
                        case 1:
                            cliente = ExecEj3.a();
                            break;
                        case 2:
                            cuenta = ExecEj3.b(cliente);
                            break;
                        case 3:
                            cuenta = ExecEj3.c(cuenta);
                            break;
                        case 4:
                            ExecEj3.d(cuenta);
                            break;
                        case 5:
                            ExecEj3.e();
                            break;
                    }
                    break;

            }
        }
        scan.close();
    }
}