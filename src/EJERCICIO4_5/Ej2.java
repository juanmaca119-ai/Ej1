package EJERCICIO4_5;

import java.io.*;
import java.util.Scanner;

public class Ej2 {

    //metodo para llamar a la ruta del archivo desde el directorio y poder leerlo
    private static final String rutaFichero = "src/EJERCICIO4_5/Contenido/datos.txt";

    //nombre del archivo que se va a leer
    private static final String nombreArchvio ="datos.txt";


    static void main() throws IOException {

        //punto numero 1
        File directorio = new File("src/EJERCICIO4_5/Contenido");
        if (directorio.mkdir()) {
            System.out.println("Directorio creado");
        } else {
            System.out.println("El directorio no ha sido creado");
        }

        //creamos el fichero dentro de Contenido
        File fichero1 = new File(directorio, "datos.txt");

        if (fichero1.createNewFile()) {
            System.out.println("Se ha creado el fichero");
        } else {
            System.out.println("El fichero datos.txt ya existe");
        }


        /*if (directorio.delete()) {
            System.out.println("La carpeta ha sido eliminada correctametne");
        } else {
            System.out.println("No se ha podido eliminar");
        }*/

        //sección de escritura dentro del fichero
        Scanner teclado = new Scanner (System.in); //se crea el scanner
        try {
            BufferedWriter escribir = new BufferedWriter(new FileWriter(rutaFichero));

            System.out.println("Escribe una linea: ");
            String linea = teclado.nextLine(); //se crea el String usando el nombre del scanner

            escribir.write(linea); //se usa el metodo write y se pone el nombre del String dentro
            escribir.newLine(); //esto es para crear una nueva linea (+1)

            System.out.println("Escribe otra linea: ");
            linea = teclado.nextLine();

            escribir.write(linea);
            escribir.newLine();

            System.out.println("Escribe la tercera linea: ");
            linea = teclado.nextLine();

            escribir.write(linea);
            escribir.newLine();

            // cerramos el escritor
            escribir.close();


        } catch (IOException e) {
            System.out.println("Error al escribir");
        }


        //seccion de contabilidad de lineas
        int lineas = 0;

       try {
            BufferedReader lector = new BufferedReader(new FileReader(rutaFichero));

            while (lector.readLine() != null) {
                lineas++;
            }

            System.out.println("El fichero tiene " + lineas + " lineas.");

        } catch (IOException e) {
            System.out.println("Ha ocurrido un error.");
        }
    }
}
