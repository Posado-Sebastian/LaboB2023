package futbol;

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
    public void contratar(Jugador jugador){
        try {
            jugador.verificarJugador();
            jugadores.add(jugador);
            System.out.println("El jugador "+ jugador.toString() + " se contrato en el " + nombre);
        }catch (ExceptionJugador s){
            System.err.println(s);
        }
    }
    public void verificarClub(Jugador jugador)throws ExceptionJugador{
        if(!jugador.getClubActual().getNombre().equals(nombre) && jugador.getEdad()<35){
            throw new ExceptionJugador("El jugador no esta en el club para renovar su contrato");
        }else if(jugador.getEdad()>35 && jugador.getClubActual().getNombre().equals(nombre)){
            throw new ExceptionJugador("El jugador no tiene la edad permitida para renovar su contrato");
        }else {
            throw new ExceptionJugador("El jugador no tiene la edad permitida ni esta en el club para renovar su contrato");
        }
    }

    @Override
    public void renovar(Jugador jugador) {
        try {
            verificarClub(jugador);
            System.out.println("El jugador "+ jugador.toString() + " renovo su contrato en " + nombre);
        }catch (ExceptionJugador s){
            System.err.println(s);
        }
    }


}
