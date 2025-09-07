package Libreria;
/**
 * @author LAB-USR-AREQUIPA
 */
public class Vendedor {
    //ATRIBUTOS
    private String nombre;
    private double sueldoBase;
    private double comision;
    private double sueldoFinal;
    private double montoVenta;
    private double porcentajeComision;
    
    public double getPorcentajeComision() {
        return porcentajeComision;
    }
    
    //CONSTRUCTORES 
    private static int[] conteo = new int[6];

    public Vendedor() {
    }
    
    public Vendedor(String nombre, double sueldoBase, double montoVenta) {
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
        this.montoVenta = montoVenta;
    }
    

    
    
    //MOETODOS GETTER & SETTER

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public double getSueldoBase() {return sueldoBase;}
    public void setSueldoBase(double sueldoBase) {this.sueldoBase = sueldoBase;}
    public double getMontoVenta() {return montoVenta;}
    public void setMontoVenta(double montoVenta) {this.montoVenta = montoVenta;}
    
    //solo letura
    public double getComision() {return comision;}
    public double getSueldoFinal() {return sueldoFinal;}
    
    //metodos publicos
    private void calcularComision(){
        if (this.montoVenta < 2000) {
            this.porcentajeComision = 10;
            this.comision = this.montoVenta * (this.porcentajeComision/100);
            conteo[0]++;
        }else{
            if (this.montoVenta >= 2000 && this.montoVenta <3001) {
                this.porcentajeComision = 12;
                this.comision = this.montoVenta * (this.porcentajeComision/100);
                conteo[1]++;
            }else{
                if (this.montoVenta >= 3001 && this.montoVenta < 4501) {
                    this.porcentajeComision = 15;
                    this.comision = this.montoVenta * (this.porcentajeComision/100);
                    conteo[2]++;
                }else{
                    if (this.montoVenta >= 4501 && this.montoVenta < 6001) {
                    this.porcentajeComision = 18;
                    this.comision = this.montoVenta * (this.porcentajeComision/100);
                    conteo[3]++;
                    }else{
                        if (this.montoVenta >= 6000) {
                            this.porcentajeComision = 25;
                            this.comision = this.montoVenta * (this.porcentajeComision/100);
                            conteo[4]++;
                        }
                    }
                }
            }
        }
    }
    public void calcularSueldoFinal(){
        this.calcularComision();
        this.sueldoFinal = this.sueldoBase + comision;
    }
    
    public String MostrarTrabajadores () {
        this.calcularComision();
        
        for (int i = 0; i < 5; i++) {
            conteo[5] += conteo[i];
        }
        String lista = "LISTA DE TRABAJADORES SEGUN SU COMISION: \n" +
                "\nCOMISION 25% :" + conteo[4] +
                "\nCOMISION 18% :" + conteo[3] +
                "\nCOMISION 15% :" + conteo[2] +
                "\nCOMISION 12% :" + conteo[1] +
                "\nCOMISION 10% :" + conteo[0] +
                "\nTOTAL TRABAJADORES: " + conteo[5];
        
        for (int i : conteo) {
            conteo[i] = 0;
        }
        return lista;
    }
    
    public String ToString(){
        StringBuilder sbMensaje = new StringBuilder("--------------------\nDATOS DEL VENDEDOR\n--------------------");
        sbMensaje.append("\nNombre: " + nombre);
        sbMensaje.append("\nSueldo Baae : " + sueldoBase);
        sbMensaje.append("\nMonto Vneta: " + montoVenta);
        sbMensaje.append("\nComison: " + comision);
        sbMensaje.append("\nSueldo Final " + sueldoFinal);
        return sbMensaje.toString();
    }
    
    
            
    
}
