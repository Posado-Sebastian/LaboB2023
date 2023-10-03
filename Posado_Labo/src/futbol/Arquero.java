package futbol;

import sistemaEleccion.ProvinciaVoto;

import java.util.HashSet;

public class Arquero extends Jugador{
        private int cantGolesRecibidos;
        private int porcentajeAtajadas;

    public Arquero(String nombre, String apellido, int dni, ProvinciaVoto provincia, HashSet<Club> historialEquipos, Club clubActual, int nroCamiseta, Posicion posicion, int cantGolesRecibidos, int porcentajeAtajadas) {
        super(nombre, apellido, dni, provincia, historialEquipos, clubActual, nroCamiseta, posicion);
        this.cantGolesRecibidos = cantGolesRecibidos;
        this.porcentajeAtajadas = porcentajeAtajadas;
    }
    public Arquero() {
        super();
        this.cantGolesRecibidos = 0;
        this.porcentajeAtajadas = 0;
    }

    public int getCantGolesRecibidos() {
        return cantGolesRecibidos;
    }

    public void setCantGolesRecibidos(int cantGolesRecibidos) {
        this.cantGolesRecibidos = cantGolesRecibidos;
    }

    public int getPorcentajeAtajadas() {
        return porcentajeAtajadas;
    }

    public void setPorcentajeAtajadas(int porcentajeAtajadas) {
        this.porcentajeAtajadas = porcentajeAtajadas;
    }
    public void verificarJugador() throws ExceptionJugador{
        if (porcentajeAtajadas<=60 || cantGolesRecibidos>=10){
            throw new ExceptionJugador("El jugador no cumple con los requisitos para ser contratado");
        }
    }

    @Override
    public String toString() {
        return super.toString()+ "cantGolesRecibidos=" + cantGolesRecibidos +
                ", porcentajeAtajadas=" + porcentajeAtajadas;
    }
}
