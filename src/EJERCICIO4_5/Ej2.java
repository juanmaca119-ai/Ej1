package EJERCICIO4_5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ej2 {
    static void main() {

        //punto numero 1
        int lineas = 0;

        try {
            BufferedReader lector = new BufferedReader(new FileReader("datos.txt"));

            while (lector.readLine() != null) {
                lineas++;
            }

            System.out.println("El fichero tiene " + lineas + " lineas.");

        } catch (IOException e) {
            System.out.println("Ha ocurrido un error.");
        }
    }
}
