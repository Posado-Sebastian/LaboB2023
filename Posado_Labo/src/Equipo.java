import java.util.ArrayList;
import java.util.Scanner;

public class Equipo {
    private ArrayList<Jugador> jugadores;
    private String nombreEquipo;
    private String barrio;
    private String horario;
    private String dia;
    private int capitan;

    public Equipo(){
        this.jugadores=new ArrayList<Jugador>();
        this.nombreEquipo="n/a";
        this.barrio="n/a";
        this.horario="noAsignado";
        this.dia="noAsignado";
        this.capitan=-1;
    }
    public Equipo(ArrayList<Jugador> jugadores, String nombreEquipo, String barrio, String horario, String dia, int capitan){
        this.jugadores=jugadores;
        this.nombreEquipo=nombreEquipo;
        this.barrio=barrio;
        this.horario=horario;
        this.dia=dia;
        this.capitan=capitan;
    }

    public int getCapitan() {
        return capitan;
    }

    public void setCapitan(int capitan) {
        this.capitan = capitan;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getDia() {
        return dia;
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
        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < jugadores.size(); i++) {
            if (jugadores.get(i).getNumeroCamiseta() == jugador.getNumeroCamiseta()) {
                verificacion = false;
            }
        }
        if (jugadores.size() < 11 && verificacion == true) {
            jugadores.add(jugador);
            System.out.println("jugador capitan si o no?");
            String sino = entrada.nextLine();
            if (sino.toLowerCase()=="si"){
                capitan==jugador.getNumeroCamiseta();
            }
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
