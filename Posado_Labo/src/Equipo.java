import java.util.ArrayList;

public class Equipo {
    private ArrayList<Jugador> jugadores;
    private String nombreEquipo;
    private String barrio;
    private String horario;

    public Equipo(){
        this.jugadores=new ArrayList<Jugador>();
        this.nombreEquipo="n/a";
        this.barrio="n/a";
        this.horario="noAsignado";
    }
    public Equipo(ArrayList<Jugador> jugadores, String nombreEquipo, String barrio, String horario){
        this.jugadores=jugadores;
        this.nombreEquipo=nombreEquipo;
        this.barrio=barrio;
        this.horario=horario;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void agregarJugadores(Jugador jugador) {
        boolean verificacion = true;
        for (int i = 0; i < jugadores.size(); i++) {
            if (jugadores.get(i).getNumeroCamiseta() == jugador.getNumeroCamiseta()) {
                verificacion = false;
            }
            if (jugadores.get(i).isCapitan() == true && jugador.isCapitan() == true) {
                jugador.setCapitan(false);
            }
        }
        if (jugadores.size() < 11 && verificacion == true) {
            jugadores.add(jugador);
        }
    }
    public void mostrarEquipo() {
        System.out.println("Nombre del equipo: " + nombreEquipo + "\n" + "Barrio: " + barrio + "\n" + "Horario: " + horario);
        System.out.println("Jugadores: " + "\n");
        for (Jugador jugadores1:jugadores){
            jugadores1.mostrarJugador();
        }
    }
}
