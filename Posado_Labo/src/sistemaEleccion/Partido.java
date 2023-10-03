package sistemaEleccion;

import java.util.HashSet;

public class Partido {
    private NombrePartido nombrePartido;
    private Candidato candidato;
    private String direccion;
    private int cantAfiliados;
    private HashSet<Mensajero> mensajeros;

    public Partido(NombrePartido nombrePartido, Candidato candidato) {
        this.nombrePartido = nombrePartido;
        this.candidato = candidato;
    }
    public Partido() {
        this.nombrePartido =null;
        this.candidato = new Candidato();
        this.mensajeros= new HashSet<>();
    }

    public NombrePartido getNombrePartido() {
        return nombrePartido;
    }

    public void setNombrePartido(NombrePartido nombrePartido) {
        this.nombrePartido = nombrePartido;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCantAfiliados() {
        return cantAfiliados;
    }

    public void setCantAfiliados(int cantAfiliados) {
        this.cantAfiliados = cantAfiliados;
    }

    public HashSet<Mensajero> getMensajeros() {
        return mensajeros;
    }

    public void setMensajeros(HashSet<Mensajero> mensajeros) {
        this.mensajeros = mensajeros;
    }

    public void agregarMensajero(Mensajero mensajero){
        mensajeros.add(mensajero);
    }
    public void hacerCampaña(){
        for (Mensajero e: mensajeros){
            try {
                e.lema("Vote por " + nombrePartido + " para un mejor futuro");
            }catch (NoDisponible s){
                System.err.println(s);
            }
        }
    }

}
