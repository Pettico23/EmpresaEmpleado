
package absctractempresa;


public class Principal {

    
    public static void main(String[] args) {
        
        Empresa emp = new Empresa();
        
        emp.agregarEmpleado(new EmpleadoSalarioFijo("123","Ana","Lopez",2024,45000));
        emp.agregarEmpleado(new EmpleadoAComision("1234","Pepe","Gomez",2022,35000,100,500));
        emp.agregarEmpleado(new EmpleadoSalarioFijo("123","Luis","Gamez",2021,45000));
        emp.agregarEmpleado(new EmpleadoAComision("123","Leo","Torres",2017,30000,200,100));
        emp.agregarEmpleado(new EmpleadoSalarioFijo("123","Maria","Perez",2014,45000));
        
        emp.mostrarSalarios();
        System.out.println(emp.empleadosConMasCientes().nombreCompleto());
    }
    
}
