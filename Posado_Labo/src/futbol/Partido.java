package futbol;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Partido {
    private Club club1;

    private HashSet<Jugador> jugadoresClub1;
    private HashSet<Jugada> jugadas;
    private Club club2;

    private HashSet<Jugador> jugadoresClub2;

    private int duracion;
    private Date fecha;

    public Partido(Club club1, HashSet<Jugador> jugadoresClub1, Club club2, HashSet<Jugador> jugadoresClub2, int duracion, Date fecha, HashSet<Jugada> jugadas) {
        this.club1 = club1;
        this.jugadoresClub1 = jugadoresClub1;

        this.club2 = club2;
        this.jugadoresClub2 = jugadoresClub2;
        this.duracion = duracion;
        this.fecha = fecha;
        this.jugadas = jugadas;
    }
    public Partido(){
        this.jugadoresClub1 = new HashSet<>();
        this.club2 = new Club();
        this.jugadoresClub2 = new HashSet<>();
        this.duracion = 0;
        this.fecha = new Date();
        this.jugadas = new HashSet<>();
    }
    public Club getClub1() {
        return club1;
    }

    public void setClub1(Club club1) {
        this.club1 = club1;
    }

    public HashSet<Jugador> getJugadoresClub1() {
        return jugadoresClub1;
    }

    public void setJugadoresClub1(HashSet<Jugador> jugadoresClub1) {
        this.jugadoresClub1 = jugadoresClub1;
    }

    public Club getClub2() {
        return club2;
    }

    public void setClub2(Club club2) {
        this.club2 = club2;
    }

    public HashSet<Jugador> getJugadoresClub2() {
        return jugadoresClub2;
    }

    public void setJugadoresClub2(HashSet<Jugador> jugadoresClub2) {
        this.jugadoresClub2 = jugadoresClub2;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Date getFecha() {
        return fecha;
    }

    public HashSet<Jugada> getJugadas() {
        return jugadas;
    }

    public void setJugadas(HashSet<Jugada> jugadas) {
        this.jugadas = jugadas;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public int cantGolesNoAtajados(Jugador jugador){
        int cant = 0;
        for (Jugada jugada: jugadas){
            if(jugada.getArquero().equals(jugador) && jugada.isGol()){
                cant+=1;
            }
        }
        return cant;
    }
    public int cantJugadasEnArco(Jugador jugador){
        int cant=0;
        for (Jugada jugada: jugadas){
            if(jugada.getArquero().equals(jugador)) {
                cant+=1;
            }
        }
        return cant;
    }
    public int cantIntentosAlArco(Jugador jugador){
        int cant=0;
        for(Jugada jugada : jugadas){
            if(jugada.getGoleador().equals(jugador)){
                cant+=1;
            }
        }
        return cant;
    }

    public float porcentajeAtajadas(Jugador jugador){
        int cant = 0;
        for(Jugada jugada : jugadas){
            if(jugada.getArquero().equals(jugador) && !jugada.isGol()){
                cant+=1;
            }
        }
        return 100/cantJugadasEnArco(jugador)*cant;
    }
    public int cantGolesEncontra(Jugador jugador){
        int cant=0;
        for(Jugada jugada : jugadas){
            if(jugada.getArquero().getClubActual().equals(jugada.getGoleador().getClubActual())){
                cant+=1;
            }
        }
        return cant;
    }
    public int cantAsistencias(Jugador jugador){
        int cant=0;
        for (Jugada jugada:jugadas){
            if(jugada.isGol() && jugada.getAsistencia().equals(jugador)){
                cant+=1;
            }
        }
        return cant;
    }
    public float porcentajeGolesConvertidos(Jugador jugador){
        int cant=0;
        for(Jugada jugada : jugadas) {
            if(jugada.isGol() && jugada.getGoleador().equals(jugador)){
                cant+=1;
            }
        }
        return 100/cantIntentosAlArco(jugador)*cant;
    }
    public int cantGoles(Jugador jugador){
        int cant=0;
        for(Jugada jugada : jugadas) {
            if(jugada.isGol() && jugada.getGoleador().equals(jugador)){
                cant+=1;
            }
        }
        return cant;
    }
}
