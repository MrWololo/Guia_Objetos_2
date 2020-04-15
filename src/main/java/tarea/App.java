package tarea;

//import java.util.ArrayList;
import java.util.Scanner;

import tarea.ejercicio_1.Autor;
import tarea.ejercicio_1.ExecEj1;
import tarea.ejercicio_1.Libro;
import tarea.ejercicio_2.Cliente;
import tarea.ejercicio_2.ExecEj2;
import tarea.ejercicio_2.Factura;

public final class App {

    public static Scanner scan = new Scanner(System.in);

    public static void main(final String[] args) {
        char repeat = 's';

        Autor autor = new Autor();
        Libro libro = new Libro();

        Cliente cliente = new Cliente();
        Factura factura = new Factura();

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
                            cliente = ExecEj2.b();
                            break;
                        case 3:
                            factura = ExecEj2.c(cliente);
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

                    }
                    break;

            }
        }
        scan.close();
    }
}