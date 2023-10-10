package futbol;

import abmLugares.Provincia;
import pedidoPlato.Persona;
import sistemaEleccion.ProvinciaVoto;

import java.util.HashSet;

public abstract class Jugador extends Persona {
    private ProvinciaVoto provincia;
    private HashSet<Club> historialEquipos;
    private Club clubActual;
    private int nroCamiseta;
    private Posicion posicion;

    public Jugador(String nombre, String apellido, int dni, ProvinciaVoto provincia, HashSet<Club> historialEquipos, Club clubActual, int nroCamiseta, Posicion posicion) {
        super(nombre, apellido, dni);
        this.provincia = provincia;
        this.historialEquipos = historialEquipos;
        this.clubActual = clubActual;
        this.nroCamiseta = nroCamiseta;
        this.posicion = posicion;
    }
    public Jugador() {
        super();
        this.provincia = null;
        this.historialEquipos = new HashSet<>();
        this.clubActual = null;
        this.nroCamiseta = 0;
        this.posicion = null;
    }

    public ProvinciaVoto getProvincia() {
        return provincia;
    }

    public void setProvincia(ProvinciaVoto provincia) {
        this.provincia = provincia;
    }

    public HashSet<Club> getHistorialEquipos() {
        return historialEquipos;
    }

    public void setHistorialEquipos(HashSet<Club> historialEquipos) {
        this.historialEquipos = historialEquipos;
    }

    public Club getClubActual() {
        return clubActual;
    }

    public void setClubActual(Club clubActual) {
        this.clubActual = clubActual;
    }

    public int getNroCamiseta() {
        return nroCamiseta;
    }

    public void setNroCamiseta(int nroCamiseta) {
        this.nroCamiseta = nroCamiseta;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }
    public abstract void verificarJugador() throws ExceptionJugador;
    public abstract void actualizarDatos(int n, int n2, int n3);

    @Override
    public String toString() {
        return
                "provincia=" + provincia +
                ", historialEquipos=" + historialEquipos +
                ", clubActual=" + clubActual +
                ", nroCamiseta=" + nroCamiseta +
                ", posicion=" + posicion;
    }
}
