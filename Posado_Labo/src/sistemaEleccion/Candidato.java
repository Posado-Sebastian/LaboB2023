package sistemaEleccion;

import pedidoPlato.Persona;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Candidato extends Persona {
    private Date nacimiento;
    private int dni;
    private HashMap<ProvinciaVoto, Integer> votosProvincia;
    private HashMap<TemaPropuesta, ArrayList<String>> propuestas;
    private Partido partido;
    public Candidato(String nombre, Date nacimiento, int dni, HashMap<ProvinciaVoto, Integer> votosProvincia, HashMap<TemaPropuesta, ArrayList<String>> propuestas, Partido partido) {
        super(nombre);
        this.nacimiento = nacimiento;
        this.dni = dni;
        this.votosProvincia = votosProvincia;
        this.propuestas = propuestas;
        this.partido = partido;
    }

    public Candidato(){
        super();
        this.nacimiento = new Date();
        this.dni = 0;
        this.votosProvincia = null;
        this.propuestas = new HashMap<>();
        this.partido = null;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public HashMap<ProvinciaVoto, Integer> getVotosProvincia() {
        return votosProvincia;
    }

    public void setVotosProvincia(HashMap<ProvinciaVoto, Integer> votosProvincia) {
        this.votosProvincia = votosProvincia;
    }

    public HashMap<TemaPropuesta, ArrayList<String>> getPropuestas() {
        return propuestas;
    }

    public void setPropuestas(HashMap<TemaPropuesta, ArrayList<String>> propuestas) {
        this.propuestas = propuestas;
    }

    public Partido getPartido() {
        return partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }
}
