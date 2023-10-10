package futbol;

import sistemaEleccion.ProvinciaVoto;

import java.util.HashSet;

public class JugadorDeCampo extends Jugador{
    private int cantIntentosAlArco;
    private int cantGoles;
    private int cantAsistencias;

    public JugadorDeCampo(String nombre, String apellido, int dni, ProvinciaVoto provincia, HashSet<Club> historialEquipos, Club clubActual, int nroCamiseta, Posicion posicion, int cantIntentosAlArco, int cantGoles, int cantAsistencias) {
        super(nombre, apellido, dni, provincia, historialEquipos, clubActual, nroCamiseta, posicion);
        this.cantIntentosAlArco = cantIntentosAlArco;
        this.cantGoles = cantGoles;
        this.cantAsistencias = cantAsistencias;
    }

    public JugadorDeCampo() {
        super();
        this.cantIntentosAlArco = 0;
        this.cantGoles = 0;
        this.cantAsistencias = 0;
    }

    public int getCantIntentosAlArco() {
        return cantIntentosAlArco;
    }

    public void setCantIntentosAlArco(int cantIntentosAlArco) {
        this.cantIntentosAlArco = cantIntentosAlArco;
    }

    public int getCantGoles() {
        return cantGoles;
    }

    public void setCantGoles(int cantGoles) {
        this.cantGoles = cantGoles;
    }
    public float porcentajeGolesConvertidos(){
        return 100/cantIntentosAlArco*cantGoles;
    }
    public int getCantAsistencias() {
        return cantAsistencias;
    }

    public void setCantAsistencias(int cantAsistencias) {
        this.cantAsistencias = cantAsistencias;
    }
    public void verificarJugador() throws ExceptionJugador{
        if (porcentajeGolesConvertidos()<=30 || cantAsistencias<=10){
            throw new ExceptionJugador("El jugador no cumple con los requisitos para ser contratado");
        }
    }

    @Override
    public void actualizarDatos(int n, int n2, int n3) {
        setCantGoles(n);
        setCantIntentosAlArco(n2);
        setCantAsistencias(n3);
    }

    @Override
    public String toString() {
        return super.toString()+
                "porcentajeGolesConvertidos=" + porcentajeGolesConvertidos() +
                ", cantAsistencias=" + cantAsistencias ;
    }
}
