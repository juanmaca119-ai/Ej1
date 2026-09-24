package EJERCICIO3_5;

import java.io.File;
import java.io.IOException;

public class Ej1 {
    static void main() throws IOException {
        System.out.println("Evidencia de conexión con GitHub");

        File carpeta = new File("copias");

        if (carpeta.exists()) {
            System.out.println("La carpeta ya existe");
        } else {
            carpeta.mkdir();
            System.out.println("Se ha creado la carpeta");
        }

        //Creación de Ficheros
        File fichero1 = new File( carpeta, "config.txt");

        if (fichero1.createNewFile()) {
            System.out.println("Se ha creado el fichero");
        } else {
            System.out.println("El fichero config.txt ya existe");
        }

        //comprobacion
        File [] elementos = carpeta.listFiles(); //lo usamos para obtener lo q hay dentro

        for (File elemento : elementos){
            if (elemento.isFile()){
                System.out.println(elemento.getName() + " es un fichero");
            } else if (elemento.isDirectory()) {
                System.out.println(elemento.getName() +  " es un directorio ");
            }
        }

        //sección de Eliminación
        if (fichero1.exists()) {
            fichero1.delete();
            System.out.println("El fichero config.txt ha sido eliminado");
        } else {
            System.out.println("El fichero no ha podido ser eliminado");
        }

        //eliminación de carpeta
        if (carpeta.delete()) {
            System.out.println("La carpeta ha sido eliminada correctametne");
        } else {
            System.out.println("No se ha podido eliminar");
        }
    }
}
