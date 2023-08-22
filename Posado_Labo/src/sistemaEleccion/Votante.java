package sistemaEleccion;

import pedidoPlato.Persona;

import java.util.Date;

public class Votante extends Persona {
    private int dni;
    private Date nacimiento;
    private Boolean controlVoto; //control para saber si voto o no
    private static String nacionalidad = "argentina";

    public Votante(int dni, Date nacimiento, Boolean controlVoto) {
        this.dni = dni;
        this.nacimiento = nacimiento;
        this.controlVoto = controlVoto;
    }

    public Votante(String nombre, int dni, Date nacimiento, Boolean controlVoto) {
        super(nombre);
        this.dni = dni;
        this.nacimiento = nacimiento;
        this.controlVoto = controlVoto;
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
