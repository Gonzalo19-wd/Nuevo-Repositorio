package algoritmo;
import java.util.Scanner;
/**
 * @Gerardo
 */
public class OrdenBusqueda {
    public static boolean buscarElemento(int[] numeros, int elemento){
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
        
        //ordenacion por burbuja
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - 1; j++) {
                if (numeros[j] > numeros[j+1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = temp;
                }
            }
        }
        System.out.println("Lista ordenada:");
        for (int numero : numeros) {
            System.out.print(numero + ", ");
        }
        
        System.out.println("\nEscriba que numero desea confirmar en la lista");
        int elemento = dato.nextInt();
        String mensaje = (OrdenBusqueda.buscarElemento(numeros, elemento)) ? "Si esta presente" : "no esta presente";
        
        System.out.println(mensaje);
    }
}
