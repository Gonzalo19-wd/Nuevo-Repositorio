package javaapplication65;
import java.util.Scanner;
/**
 * @author LAB-USR-AREQUIPA
 */
public class JavaApplication65 {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de numero:");
        int cantidad = dato.nextInt();
        int[] numeros = new int[cantidad];
        
        System.out.println("Ingrese los numeros");
        for (int i = 0; i < cantidad; i++) {
            numeros[i] = dato.nextInt();
        }
        
        //ordenacion por insercion
        
        for (int i = 0; i < numeros.length; i++) {
            int temp = numeros[i];
            int j = i - 1;
            
            //mover los elementos del arreglo hacia adelante
            while (j >= 0 && numeros[j] > temp) {                
                numeros[j+1] = numeros[j];
                j = j - 1;
            }
            numeros[j + 1] = temp;
        }
        
        System.out.println("Lista ordenada:");
        for (int numero : numeros) {
            System.out.print(numero + ", ");
        }
    }
    
}
