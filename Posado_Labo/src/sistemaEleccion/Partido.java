package sistemaEleccion;

import java.util.HashSet;

public class Partido {
    private NombrePartido nombrePartido;
    private Candidato candidato;
    private String direccion;
    private int cantAfiliados;
    private HashSet<Partidario> enviadores;

    public Partido(NombrePartido nombrePartido, Candidato candidato) {
        this.nombrePartido = nombrePartido;
        this.candidato = candidato;
    }
    public Partido() {
        this.nombrePartido =null;
        this.candidato = new Candidato();
        this.enviadores= new HashSet<>();
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
    public void agregarMensajero(Partidario partidario){
        enviadores.add(partidario);
    }
    public void hacerCampaña(){
        for (Partidario e: enviadores){
            try {
                e.lema("Vote por " + nombrePartido + " para un mejor futuro");
            }catch (NoDisponible s){
                System.err.println(s);
            }
        }
    }

}
