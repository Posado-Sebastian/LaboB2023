package futbol;

public interface Contrato {
    void contratar(Jugador jugador) throws ExceptionJugador;
    void renovar(Jugador jugador);
}
