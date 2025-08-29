package libre;


public class EmpleadosUIT {
    //Atrivutos
    private String nombre;
    private String apellido;
    private double SueldoAnual;
    public static final double UIT = 5.150;
    private double ImpuestoNeto;
    private double porcentajeImpuesto;
    
    //constructor
    public EmpleadosUIT(String nombre, String apellido, double SueldoAnual) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.SueldoAnual = SueldoAnual;
        CalcularImpuesto();
    }
    
    //get set

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public String getApellido() {return apellido;}
    public void setApellido(String apellido) {this.apellido = apellido;}
    public double getSueldoAnual() {return SueldoAnual;}
    public void setSueldoAnual(double SueldoAnual) {this.SueldoAnual = SueldoAnual;}
    public double getPorcentajeImpuesto() {return porcentajeImpuesto;}
    public void setPorcentajeImpuesto(double porcentajeImpuesto) { this.porcentajeImpuesto = porcentajeImpuesto;}
    

    public static double getUIT() {return UIT;}
    public double getImpuestoNeto() {return ImpuestoNeto;}
    
    
    public void CalcularImpuesto(){
        if (this.SueldoAnual > (7*UIT)) {
            this.porcentajeImpuesto = 0.30;
            this.ImpuestoNeto = this.SueldoAnual * this.porcentajeImpuesto;
        }else{
            if (this.SueldoAnual > (21*UIT)) {
                this.porcentajeImpuesto = 0.21;
                this.ImpuestoNeto = this.SueldoAnual * this.porcentajeImpuesto;
            }else{
                if (this.SueldoAnual > (12*UIT)) {
                    this.porcentajeImpuesto = 0.14;
                    this.ImpuestoNeto = this.SueldoAnual * this.porcentajeImpuesto;
                }else{
                    if (this.SueldoAnual > (7*UIT)) {
                        this.porcentajeImpuesto = 0.08;
                        this.ImpuestoNeto = this.SueldoAnual * this.porcentajeImpuesto;
                    }
                }
            }
        }
    }
    
    @Override
    public String toString() {
        return "--------------------\nIMPUESTO EMPLEADO\n--------------------" +
               "\nNombre: " + nombre +
               "\nApellido: " + apellido +
               "\nSueldo Anual: " + SueldoAnual +
               "\n% Impuesto: " + (porcentajeImpuesto * 100) + "%" +
               "\nImpuesto a Pagar: " + ImpuestoNeto;
    }
    
    
    
    
}
