package javaapplication65;
import java.util.Scanner;
/**
 * @author LAB-USR-AREQUIPA
 */
public class busqueda {
    public boolean buscarElemento(int[] numeros, int elemento){
        for (int numero : numeros) {
            if (numero == elemento) {
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de numero:");
        int cantidad = dato.nextInt();
        int[] numeros = new int[cantidad];
        
        System.out.println("Ingrese los numeros");
        for (int i = 0; i < cantidad; i++) {
            numeros[i] = dato.nextInt();
        }
        
        System.out.println("Escriba que numero desea confirmar en la lista");
        int elemento = dato.nextInt();
        busqueda buscar = new busqueda();
        String mensaje = (buscar.buscarElemento(numeros, elemento)) ? "Si esta presente" : "no esta presente";
        
        System.out.println(mensaje);
    }
    
}
