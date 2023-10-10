package futbol;

import sistemaEleccion.ProvinciaVoto;

import java.util.HashSet;

public class Arquero extends Jugador{
        private int cantGolesRecibidos;
        private int cantAtajadas;

    public Arquero(String nombre, String apellido, int dni, ProvinciaVoto provincia, HashSet<Club> historialEquipos, Club clubActual, int nroCamiseta, Posicion posicion, int cantGolesRecibidos, int cantAtajadas) {
        super(nombre, apellido, dni, provincia, historialEquipos, clubActual, nroCamiseta, posicion);
        this.cantGolesRecibidos = cantGolesRecibidos;
        this.cantAtajadas = cantAtajadas;
    }
    public Arquero() {
        super();
        this.cantGolesRecibidos = 0;
        this.cantAtajadas = 0;
    }

    public int getCantGolesRecibidos() {
        return cantGolesRecibidos;
    }

    public void setCantGolesRecibidos(int cantGolesRecibidos) {
        this.cantGolesRecibidos = cantGolesRecibidos;
    }

    public int getCantAtajadas() {
        return cantAtajadas;
    }

    public void setCantAtajadas(int cantAtajadas) {
        this.cantAtajadas = cantAtajadas;
    }
    public float porcentajeAtajadas(){
        return 100/cantGolesRecibidos*cantAtajadas;
    }
    public void verificarJugador() throws ExceptionJugador{
        if (porcentajeAtajadas()<=60 || cantGolesRecibidos>=10){
            throw new ExceptionJugador("El jugador no cumple con los requisitos para ser contratado");
        }
    }


    @Override
    public String toString() {
        return super.toString()+ "cantGolesRecibidos=" + cantGolesRecibidos +
                ", porcentajeAtajadas=" + porcentajeAtajadas();
    }

    @Override
    public void actualizarDatos(int n, int n2, int n3) {
        setCantAtajadas(n);
        setCantGolesRecibidos(n2);
    }
}
