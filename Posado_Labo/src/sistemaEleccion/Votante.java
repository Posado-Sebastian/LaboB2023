package sistemaEleccion;

import pedidoPlato.Persona;

import java.util.Date;

public class Votante extends Persona {
    private int dni;
    private Date nacimiento;
    private Boolean controlVoto; //control para saber si voto o no
    private static String nacionalidad = "argentina";
    private ProvinciaVoto provinciaVoto;

    public Votante(int edad, int direccion, String nombre, String apellido, int dni, Date nacimiento, Boolean controlVoto, ProvinciaVoto provinciaVoto) {
        super(edad, direccion, nombre, apellido);
        this.dni = dni;
        this.nacimiento = nacimiento;
        this.controlVoto = controlVoto;
        this.provinciaVoto = provinciaVoto;
    }

    public Votante(Boolean controlVoto, ProvinciaVoto provinciaVoto) {
        this.controlVoto = controlVoto;
        this.provinciaVoto = provinciaVoto;
    }

    public ProvinciaVoto getProvinciaVoto() {
        return provinciaVoto;
    }

    public void setProvinciaVoto(ProvinciaVoto provinciaVoto) {
        this.provinciaVoto = provinciaVoto;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public Boolean getControlVoto() {
        return controlVoto;
    }

    public void setControlVoto(Boolean controlVoto) {
        this.controlVoto = controlVoto;
    }

    public static String getNacionalidad() {
        return nacionalidad;
    }

    public static void setNacionalidad(String nacionalidad) {
        Votante.nacionalidad = nacionalidad;
    }
}
