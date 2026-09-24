package EJERCICIO3_5;

import java.io.File;

public class Ej1 {
    static void main() {
        System.out.println("Evidencia de conexión con GitHub");

        File carpeta = new File("copias");

        if (carpeta.exists()) {
            System.out.println("La carpeta ya existe");
        } else {
            carpeta.mkdir();
            System.out.println("Se ha creado la carpeta");
        }
    }
}
