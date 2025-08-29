package javaapplication69;
import java.util.Scanner;
/**
 * @Gerardo
 */
public class ordnearsueldo {
    static Scanner dato = new Scanner(System.in);
    
    
    public static boolean buscarElemento(int[] numeros, int elemento){
        for (int numero : numeros) {
            if (numero == elemento) {
                return true;
            }
        }
        return false;
    }
    
    public static void ordenar(double [] numeros){
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1; j++) {
                if (numeros[j] > numeros[j+1]) {
                    double temp = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = temp;
                }
            }
        }
    }
    
    
    public static void main(String[] args) {
        
        
        System.out.println("Ingrese la cantidad de empleados:");
        int cantidad = dato.nextInt();
        double[] numeros = new double[cantidad];
        
        System.out.println("Ingrese los sueldos");
        for (int i = 0; i < cantidad; i++) {
            numeros[i] = dato.nextInt();
        }
        
        ordenar(numeros);    //ordenacion por burbuja
        
        System.out.println("Lista ordenada:");
        for (double numero : numeros) {
            System.out.print(numero + ", ");
        }
        
        System.out.println("\nEscriba que numero desea confirmar en la lista");
        int elemento = dato.nextInt();
        String mensaje = (ordnearsueldo.buscarElemento(numeros, elemento)) ? "Si esta presente" : "no esta presente";
        
        System.out.println(mensaje);
    }
}
