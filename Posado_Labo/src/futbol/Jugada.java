package futbol;

public class Jugada {
    private boolean gol;
    private Jugador goleador;
    private Jugador asistencia;
    private Arquero arquero;

    public Jugada(boolean gol, Jugador goleador, Jugador asistencia, Arquero arquero) {
        this.gol = gol;
        this.goleador = goleador;
        this.asistencia = asistencia;
        this.arquero = arquero;
    }
    public Jugada() {
        this.gol = false;
        this.goleador = new JugadorDeCampo();
        this.asistencia = new JugadorDeCampo();
        this.arquero = new Arquero();
    }

    public boolean isGol() {
        return gol;
    }

    public void setGol(boolean gol) {
        this.gol = gol;
    }

    public Jugador getGoleador() {
        return goleador;
    }

    public void setGoleador(Jugador goleador) {
        this.goleador = goleador;
    }

    public Jugador getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(Jugador asistencia) {
        this.asistencia = asistencia;
    }

    public Arquero getArquero() {
        return arquero;
    }

    public void setArquero(Arquero arquero) {
        this.arquero = arquero;
    }
    public boolean enContra(){
        if(goleador.getClubActual().equals(arquero.getClubActual())){
            return true;
        }
        return false;
    }
}
