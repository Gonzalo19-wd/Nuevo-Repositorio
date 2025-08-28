package interfas;
import java.util.Scanner;

public class categoriahijos {
    
    public static double bonificacionCAT(int categoria, double sueldoBasic) {
        double bonificacion;
        switch (categoria) {
            case 1:
                bonificacion = 0.12;
                break;
            case 2:
                bonificacion = 0.1;
                break;
            case 3:
                bonificacion = 0.08;
                break;
            default:
                bonificacion = 0.06;
        }
        return (sueldoBasic*bonificacion);
    }
    
    public static double boniHijos(int hijos) {
        double Bono = (hijos > 6) ? 40 : ((hijos > 3) ? 30 : 20);
        return (hijos*Bono);
    }
    
    public static void main(String[] args) {
        System.out.println("Ingresar datos:\n");
        Scanner dato = new Scanner(System.in);
        System.out.println("Ingrese nombre del empleado\n");
        String nombre = dato.next();
        System.out.println("Ingrese sueldo basico\n");
        double sueldoBasic = dato.nextDouble();
        System.out.println("Ingrese categoria de empleado\n");;
        int categoria = dato.nextInt();
        System.out.println("Ingrese cantidad de Hijos:\n");;
        int hijos = dato.nextInt();
        
        //calculo
        double sueldoNeto = sueldoBasic + boniHijos(hijos) + bonificacionCAT(categoria, sueldoBasic);
        //mostrar
        System.out.println("Resumen:");
        System.out.println("Trabajador : " + nombre +
                "\nBono por categoria : " + bonificacionCAT(categoria, sueldoBasic) +
                "\nBono por Numero de hijos : " + boniHijos(hijos) +
                "\nSueldo Total: " + sueldoNeto);
        
    }
    
}
