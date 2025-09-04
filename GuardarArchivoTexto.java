
package guardararchivotexto;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

public class GuardarArchivoTexto {

    public static void main(String[] args) {

        Scanner dato = new Scanner(System.in);

        System.out.print("Escribe el nombre del archivo (ej: datos.txt): ");
        String nombreArchivo = dato.nextLine();

        System.out.print("Escribe el contenido que quieres guardar: ");
        String contenido = dato.nextLine();

        // Guardar archivo
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            writer.write(contenido);
            System.out.println("Archivo guardado correctamente en: " + nombreArchivo);
        } catch (IOException e) {
            System.out.println("Error al guardar el archivo: " + e.getMessage());
        }
    }
}
