package ordenararchivosnumeros;
import java.io.*;
import java.util.*;

public class OrdenarArchivosNumeros {

    public static void main(String[] args) {
        // Archivos de entrada y salida
        String[] archivosEntrada = {"C:\\Users\\ASUS\\OneDrive\\Desktop\\listas\\numeros1.txt", 
            "C:\\Users\\ASUS\\OneDrive\\Desktop\\listas\\numeros2.txt", "C:\\Users\\ASUS\\OneDrive\\Desktop\\listas\\numeros3.txt"};
        String[] archivosSalida = {"numeros1_ordenado.txt", "numeros2_ordenado.txt", "numeros3_ordenado.txt"};

        for (int i = 0; i < archivosEntrada.length; i++) {
            ordenarArchivo(archivosEntrada[i], archivosSalida[i]);
        }
    }

    // Método que lee un archivo de números, los ordena y los guarda en otro archivo
    private static void ordenarArchivo(String archivoEntrada, String archivoSalida) {
        List<Integer> numeros = new ArrayList<>();

        // Leer números del archivo
        try (BufferedReader br = new BufferedReader(new FileReader(archivoEntrada))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                numeros.add(Integer.parseInt(linea.trim()));
            }
        } catch (IOException e) {
            System.out.println("❌ Error leyendo el archivo " + archivoEntrada + ": " + e.getMessage());
            return;
        }

        // Ordenar lista
        Collections.sort(numeros);

        // Guardar en archivo de salida
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivoSalida))) {
            for (int num : numeros) {
                bw.write(num + "\n");
            }
            System.out.println("✅ Archivo ordenado guardado en: " + archivoSalida);
        } catch (IOException e) {
            System.out.println("❌ Error escribiendo el archivo " + archivoSalida + ": " + e.getMessage());
        }
    }
}
