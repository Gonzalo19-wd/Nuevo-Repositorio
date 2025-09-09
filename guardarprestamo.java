package tiendapantalones;
import java.util.*;
import java.io.*;

public class guardarprestamo {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Ingrese cuántas cuadrillas desea registrar: ");
        int numCuadrillas = scanner.nextInt();

        for (int i = 1; i <= numCuadrillas; i++) {
            registrarCuadrilla(i);
        }

        System.out.println("✅ Todos los sueldos se guardaron correctamente.");
    }

    // Método para registrar una cuadrilla y guardar sus sueldos en archivo
    private static void registrarCuadrilla(int numeroCuadrilla) {
        System.out.print("Ingrese la cantidad de sueldos para la cuadrilla " + numeroCuadrilla + ": ");
        int cantidad = scanner.nextInt();

        List<Double> sueldos = new ArrayList<>();
        for (int i = 1; i <= cantidad; i++) {
            System.out.print("Ingrese sueldo " + i + ": ");
            sueldos.add(scanner.nextDouble());
        }

        String nombreArchivo = "cuadrilla" + numeroCuadrilla + ".txt";
        guardarArchivo(nombreArchivo, sueldos);
    }

    // Método que guarda la lista de sueldos en un archivo de texto
    private static void guardarArchivo(String archivo, List<Double> sueldos) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
            for (double sueldo : sueldos) {
                bw.write(sueldo + "\n");
            }
            System.out.println("💾 Archivo guardado: " + archivo);
        } catch (IOException e) {
            System.out.println("❌ Error al guardar " + archivo + ": " + e.getMessage());
        }
    }
    
}
