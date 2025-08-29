package impuestos;
import libre.EmpleadosUIT;
import java.util.Scanner;

public class Impuestos {
    private static Scanner dato = new Scanner(System.in);
    private static EmpleadosUIT[] ListaEmpleados;
    private static EmpleadosUIT objEmpleadosUIT;
    private static int N;
    private static int posicion = 0;
    private static int menu;
    
    public static void CrearEmpleado(){
        String nombre, apellido;
        double SueldoAnual;
        System.out.println("Ingrese el nombre : ");
        nombre= dato.next();
        System.out.println("Ingrese apellido");
        apellido = dato.next();
        System.out.println("Ingrese el sueldo Anual: ");
        SueldoAnual = dato.nextDouble();
                
        //creamos instancia y pasa los datos
        objEmpleadosUIT = new EmpleadosUIT(nombre, apellido, SueldoAnual);
        
        //Agregamos objeto al arreglo de objetos
        ListaEmpleados[posicion] = objEmpleadosUIT;
        posicion++;
    }
    public static void ImprimirImpuestos() {
        for (int con = 0; con < posicion; con++) {
            System.out.println(ListaEmpleados[con].toString());
        }
    }
    public static void main(String[] args) {
        menu = 0;
        do {            
            System.out.println("Seleccione la accion a realizar: ");
            System.out.println("1) Ingresar empleado");
            System.out.println("2) Mostrar impuestos");
            System.out.println("0) Salir");
            menu = dato.nextInt();
            if (menu == 1) {
                System.out.println("Ingrese cantidad de empleados");
                N = dato.nextInt();
                ListaEmpleados = new EmpleadosUIT[N];
                for (int i = 0; i < N; i++) {
                    CrearEmpleado();
                }
            }else{
                if (menu == 2) {
                    ImprimirImpuestos();
                }else{
                    System.exit(0);
                }
            }
        } while (true);
        
    }
    
}