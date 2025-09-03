package tiendapantalones;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import javax.management.Descriptor;


public class TiendaPantalones {
    
    static Scanner dato = new Scanner(System.in);
    static List<Double> listaproducto = new ArrayList<>();
    
    private static int menu(){
        int opcion = 0;
        System.out.println("----------------------------------");
        System.out.printf("%-15s %-15s%n", "Tipo", "Precio (S/.)");
        System.out.println("----------------------------------");
        System.out.printf("%-15s %-15.2f%n", "1. Deportivo", 90.0);
        System.out.printf("%-15s %-15.2f%n", "2. Casual", 120.0);
        System.out.printf("%-15s %-15.2f%n", "3. Elegante", 135.0);
        System.out.printf("%-15s %n", "0. Sacar total");
        System.out.println("----------------------------------");
        opcion = dato.nextInt();
        return opcion;
    }
    private static void registrarProducto(int cantidad){
        double producto = 0;
        switch (menu()) {
            case 1:
                producto = 90*cantidad;break;
            case 2:
                producto = 120*cantidad;break;
            case 3:
                producto = 135*cantidad;break;
            default:
                System.out.println("producrto no disponible");
        }
        listaproducto.add(producto);
    }
    
    private static double Subtotal(){
        double subtotal = 0;
        for (Double precio : listaproducto) {
            subtotal += precio;
        }
        return subtotal;
    }
    
    private static double calcularDescuento(int totalcantidad){
        double descuento = 0;
        if (totalcantidad < 6) {
            descuento = Subtotal() * 0.05;
        }else{
            if (totalcantidad < 9) {
                descuento = Subtotal() * 0.09;                        
            }else{
                descuento = Subtotal() * 0.14;
            }
        }
        return descuento;
    }
    
    public static String toString(double Total, int totalcantidad) {
        return "--------------------\nIMPUESTO EMPLEADO\n--------------------" +
               "\nSubtotal de compra" + Subtotal() +
               "\nDescuento por cantidad: " + calcularDescuento(totalcantidad)+
               "\nTotal a pagar: " + Total;
    }
    
    
    public static void main(String[] args) {
        int cantidad;
        int totalcantidad = 0;
        do {            
            menu();
            System.out.println("Ingrese la cantidad que desea comprar");
            cantidad = dato.nextInt();
            totalcantidad += cantidad;
            registrarProducto(cantidad);
        } while (menu()!= 0);
        double Total = Subtotal() + calcularDescuento(totalcantidad);
        System.out.println(toString(Total, totalcantidad));
    }
    
}
