import java.util.ArrayList;
import java.util.Date;

public class Empleado {
    private String nombre;
    private String apellido;
    private int telefono;
    private Date nacimiento;
    private ArrayList<Boolean> diasLaborales;
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public ArrayList<Boolean> getDiasLaborales() {
        return diasLaborales;
    }

    public void setDiasLaborales(ArrayList<Boolean> diasLaborales) {
        this.diasLaborales = diasLaborales;
    }

    public Empleado(String nombre){
        this.nombre=nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public Empleado(String nombre, String apellido, int telefono, Date nacimiento, ArrayList<Boolean> diasLaborales) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.nacimiento = nacimiento;
        this.diasLaborales = diasLaborales;
    }
    public Empleado(){
        this.nombre="";
        this.apellido = "";
        this.telefono = 0;
        this.nacimiento = new Date();
        this.diasLaborales = new ArrayList<Boolean>();
    }

    @Override
    public String toString() {
        return getClass().getCanonicalName() + " -> " + nombre;
    }
}
