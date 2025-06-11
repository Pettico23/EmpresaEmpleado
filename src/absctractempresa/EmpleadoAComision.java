
package absctractempresa;


public class EmpleadoAComision extends Empleado{
    private double salarioMinimo;
    private int cantClientesCaptados;
    private double montoPorCliente;

    public EmpleadoAComision(String DNI, String nombre, String apellido, int anioIngreso,double salarioMinimo, int cantClientesCaptados, double montoPorCliente) {
        super(DNI, nombre, apellido, anioIngreso);
        this.salarioMinimo = salarioMinimo;
        this.cantClientesCaptados = cantClientesCaptados;
        this.montoPorCliente = montoPorCliente;
    }

    public int getCantClientesCaptados() {
        return cantClientesCaptados;
    }
    

    
    @Override
    public double getSalario(){
        double sal = montoPorCliente * cantClientesCaptados;
        if(sal < salarioMinimo){
            sal = salarioMinimo;
        }
        return sal;
    }
    
}
