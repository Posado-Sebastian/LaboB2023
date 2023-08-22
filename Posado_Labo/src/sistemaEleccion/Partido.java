package sistemaEleccion;

public class Partido {
    private NombrePartido nombrePartido;
    private Candidato candidato;

    public Partido(NombrePartido nombrePartido, Candidato candidato) {
        this.nombrePartido = nombrePartido;
        this.candidato = candidato;
    }
    public Partido() {
        this.nombrePartido =null;
        this.candidato = new Candidato();
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

}
