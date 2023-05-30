package empresaYempleado;

import java.util.HashSet;

public class EmpresaEmpleado {
    private HashSet<Empleado> empleados;
    private String nombreEmpresa;

    public EmpresaEmpleado(HashSet<Empleado> empleados, String nombreEmpresa) {
        this.empleados = empleados;
        this.nombreEmpresa = nombreEmpresa;
    }
    public EmpresaEmpleado(){
        this.empleados = new HashSet<Empleado>();
        this.nombreEmpresa = "";
    }

    public HashSet<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(HashSet<Empleado> empleados) {
        this.empleados = empleados;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }
    public void asistenciaTotal(int mes){
        float presente = 0;
        if(!empleados.isEmpty()){
            for(Empleado empleado : empleados){
                presente=presente+empleado.porcentajeAsis(mes);
            }
            System.out.println("El porcentaje de presentes en ese mes es: " + presente/empleados.size()*100);
        }
    }
}
