package empresaYempleado;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;

public class Empleado {
    private String nombre;
    private String apellido;
    private int telefono;
    private Date nacimiento;
    private String pais;
    private HashSet<Dia> diasLaborales;
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

    public HashSet<Dia> getDiasLaborales() {
        return diasLaborales;
    }

    public void setDiasLaborales(HashSet<Dia> diasLaborales) {
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

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public HashMap<Date, Boolean> getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(HashMap<Date, Boolean> asistencia) {
        this.asistencia = asistencia;
    }

    public Empleado(String nombre, String apellido, int telefono, Date nacimiento, HashSet<Dia> diasLaborales, HashMap<Date, Boolean> asistencia, String pais) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.nacimiento = nacimiento;
        this.diasLaborales = diasLaborales;
        this.asistencia=asistencia;
        this.pais=pais;
    }
    public Empleado(){
        this.nombre="";
        this.apellido = "";
        this.telefono = 0;
        this.nacimiento = new Date();
        this.diasLaborales = new HashSet<Dia>();
        this.asistencia= new HashMap<Date,Boolean>();
        this.pais="";
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
