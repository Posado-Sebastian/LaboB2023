package futbol;

import sistemaEleccion.ProvinciaVoto;

import java.util.HashSet;

public class JugadorDeCampo extends Jugador{
    private int porcentajeGolesConvertidos;
    private int cantAsistencias;

    public JugadorDeCampo(String nombre, String apellido, int dni, ProvinciaVoto provincia, HashSet<Club> historialEquipos, Club clubActual, int nroCamiseta, Posicion posicion, int porcentajeGolesConvertidos, int cantAsistencias) {
        super(nombre, apellido, dni, provincia, historialEquipos, clubActual, nroCamiseta, posicion);
        this.porcentajeGolesConvertidos = porcentajeGolesConvertidos;
        this.cantAsistencias = cantAsistencias;
    }

    public JugadorDeCampo() {
        super();
        this.porcentajeGolesConvertidos = 0;
        this.cantAsistencias = 0;
    }

    public int getPorcentajeGolesConvertidos() {
        return porcentajeGolesConvertidos;
    }

    public void setPorcentajeGolesConvertidos(int porcentajeGolesConvertidos) {
        this.porcentajeGolesConvertidos = porcentajeGolesConvertidos;
    }

    public int getCantAsistencias() {
        return cantAsistencias;
    }

    public void setCantAsistencias(int cantAsistencias) {
        this.cantAsistencias = cantAsistencias;
    }
    public void verificarJugador() throws ExceptionJugador{
        if (porcentajeGolesConvertidos<=30 || cantAsistencias<=10){
            throw new ExceptionJugador("El jugador no cumple con los requisitos para ser contratado");
        }
    }

    @Override
    public String toString() {
        return super.toString()+
                "porcentajeGolesConvertidos=" + porcentajeGolesConvertidos +
                ", cantAsistencias=" + cantAsistencias ;
    }
}
