package futbol;

import pedidoPlato.Persona;
import sistemaEleccion.ProvinciaVoto;

import java.util.HashSet;

public class Club implements Contrato{
    private String nombre;
    private HashSet<Jugador> jugadores;

    public Club(String nombre, HashSet<Jugador> jugadores) {
        this.nombre = nombre;
        this.jugadores = jugadores;
    }    public Club() {
        this.nombre = "";
        this.jugadores = null;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashSet<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(HashSet<Jugador> jugadores) {
        this.jugadores = jugadores;
    }


    @Override
    public void contratar(Persona jugador){
        try {
            ((Jugador)jugador).verificarJugador();
            jugadores.add((Jugador) jugador);
            System.out.println("El jugador "+ jugador.toString() + " se contrato en el " + nombre);
        }catch (ExceptionJugador s){
            System.err.println(s);
        }
    }
    public void verificarClub(Persona jugador)throws ExceptionJugador{
        if(! ((Jugador)jugador).getClubActual().getNombre().equals(nombre) && jugador.getEdad()<35){
            throw new ExceptionJugador("El jugador no esta en el club para renovar su contrato");
        }else if(jugador.getEdad()>35 && ((Jugador)jugador).getClubActual().getNombre().equals(nombre)){
            throw new ExceptionJugador("El jugador no tiene la edad permitida para renovar su contrato");
        }else {
            throw new ExceptionJugador("El jugador no tiene la edad permitida ni esta en el club para renovar su contrato");
        }
    }

    @Override
    public void renovar(Persona jugador) {
        try {
            verificarClub((Jugador)jugador);
            System.out.println("El jugador "+ jugador.toString() + " renovo su contrato en " + nombre);
        }catch (ExceptionJugador s){
            System.err.println(s);
        }
    }


}
