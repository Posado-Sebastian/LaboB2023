import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Empleado {
    private String nombre;
    private String apellido;
    private int telefono;
    private Date nacimiento;
    private ArrayList<Boolean> diasLaborales;
    private HashMap<Date, Boolean> asistencia;
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

    public Empleado(String nombre, String apellido, int telefono, Date nacimiento, ArrayList<Boolean> diasLaborales, HashMap<Date, Boolean> asistencia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.nacimiento = nacimiento;
        this.diasLaborales = diasLaborales;
        this.asistencia=asistencia;
    }
    public Empleado(){
        this.nombre="";
        this.apellido = "";
        this.telefono = 0;
        this.nacimiento = new Date();
        this.diasLaborales = new ArrayList<Boolean>();
        this.asistencia= new HashMap<Date,Boolean>();
    }

    @Override
    public String toString() {
        return getClass().getCanonicalName() + " -> " + nombre;
    }

    public float porcentajeAsis(int mes){
        int presente = 0;
        float cantidad = 0;
        if(!asistencia.isEmpty()) {
            for (Date fecha : asistencia.keySet()) {
                if (fecha.getMonth() == mes) {
                    cantidad = cantidad + 1;
                    if (asistencia.get(fecha).equals(true)) {
                        presente++;
                    }
                }
            }
            cantidad = presente / (cantidad * 100);
            return cantidad;
        }
        return cantidad;
    }
}
