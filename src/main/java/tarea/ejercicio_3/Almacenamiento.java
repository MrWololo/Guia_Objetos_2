package tarea.ejercicio_3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Almacenamiento {

    static ArrayList<String> mensajes = new ArrayList<String>();

    public static void set(final String mensaje) {
        try {
            final FileOutputStream file = new FileOutputStream("File.txt");
            final ObjectOutputStream output = new ObjectOutputStream(file);

            mensajes.add(mensaje);

            if (mensajes.size() < 10) {
                output.writeObject(mensajes);
            } else if (mensajes.size() == 10) {
                mensajes.remove(0);
                output.writeObject(mensajes);
            }

            output.close();
            file.close();
        } catch (final FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        } catch (final IOException e) {
            System.out.println("Error: " + e.toString());
        }
    }

    public static ArrayList<String> get() {
        try {
            final FileInputStream file = new FileInputStream("File.txt");
            final ObjectInputStream input = new ObjectInputStream(file);

            Object obj = input.readObject();
            if (obj instanceof ArrayList) {
                ArrayList<?> array = (ArrayList<?>) obj;
                if (array.size() > 0 && array.get(0) instanceof String) {
                    mensajes.clear();
                    for (int i = 0; i < array.size(); i++) {
                        mensajes.add((String) array.get(i));
                    }
                }
            }
            input.close();
            file.close();

        } catch (final FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        } catch (final IOException e) {
            System.out.println("Error: " + e.toString());
        } catch (final ClassNotFoundException e) {
            e.printStackTrace();
        }
        return mensajes;
    }

}