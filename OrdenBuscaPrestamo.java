package javaapplication10;
import java.util.*;

// Clase Prestamo
class Prestamo {
    private String cliente;
    private double monto;

    public Prestamo(String cliente, double monto) {
        this.cliente = cliente;
        this.monto = monto;
    }

    public String getCliente() {
        return cliente;
    }

    public double getMonto() {
        return monto;
    }

    @Override
    public String toString() {
        return "Cliente: " + cliente + " | Monto: " + monto;
    }
}

// Clase Ingreso de prestamos
class IngresoPrestamos {
    private List<Prestamo> prestamos;

    public IngresoPrestamos() {
        prestamos = new ArrayList<>();
    }

    public void registrarPrestamo(String cliente, double monto) {
        prestamos.add(new Prestamo(cliente, monto));
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }
}

// Clase Ordenamiento
class Ordenamiento {
    public static void ordenarDescendente(List<Prestamo> prestamos) {
        prestamos.sort((p1, p2) -> Double.compare(p2.getMonto(), p1.getMonto())); 
    }
}

// Clase Busqueda
class Busqueda {
    public static Prestamo buscarPrestamo(List<Prestamo> prestamos, String cliente) {
        for (Prestamo p : prestamos) {
            if (p.getCliente().equalsIgnoreCase(cliente)) {
                return p;
            }
        }
        return null; // No encontrado
    }
}

// Clase Mostrar Prestamos
class MostrarPrestamos {
    public static void mostrar(List<Prestamo> prestamos) {
        System.out.println("\n-- LISTA DE PRESTAMOS ORDENADA ---");
        for (Prestamo p : prestamos) {
            System.out.println(p);
        }
    }
}

public class OrdenBuscaPrestamo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IngresoPrestamos ingreso = new IngresoPrestamos();

        // Registrar algunos préstamos
        System.out.print("Cuantos préstamos desea registrar?: ");
        int n = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese nombre del cliente: ");
            String cliente = sc.nextLine();
            System.out.print("Ingrese monto del prstamo: ");
            double monto = sc.nextDouble();
            sc.nextLine();
            ingreso.registrarPrestamo(cliente, monto);
        }

        // Ordenar de mayor a menor
        Ordenamiento.ordenarDescendente(ingreso.getPrestamos());

        // Mostrar préstamos
        MostrarPrestamos.mostrar(ingreso.getPrestamos());

        // Buscar un préstamo
        System.out.print("\nIngrese el nombre del cliente a buscar: ");
        String nombreBuscar = sc.nextLine();
        Prestamo encontrado = Busqueda.buscarPrestamo(ingreso.getPrestamos(), nombreBuscar);

        if (encontrado != null) {
            System.out.println(" Prestamo encontrado: " + encontrado);
        } else {
            System.out.println(" No se encontró un préstamo para el cliente: " + nombreBuscar);
        }

        sc.close();
    }
    
}
