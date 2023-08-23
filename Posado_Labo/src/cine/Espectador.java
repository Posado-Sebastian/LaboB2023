package cine;

import pedidoPlato.Persona;

import java.util.Date;
import java.util.HashSet;

public class Espectador extends Persona {
    private Date nacimiento;
    private int identificador;
    private String mail;
    private HashSet<Funcion> funciones;

    public Espectador() {
        super();
        this.nacimiento = new Date();
        this.identificador = 0;
        this.mail = "";
        this.funciones = new HashSet<Funcion>();
    }

    public Espectador(String nombre, Date nacimiento, int identificador, String mail, HashSet<Funcion> funciones) {
        super(nombre);
        this.nacimiento = nacimiento;
        this.identificador = identificador;
        this.mail = mail;
        this.funciones = funciones;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public HashSet<Funcion> getFunciones() {
        return funciones;
    }

    public void setFunciones(HashSet<Funcion> funciones) {
        this.funciones = funciones;
    }
}
