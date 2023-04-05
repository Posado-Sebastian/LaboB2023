import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
        Jugador jugador1 = new Jugador("Marcquitos", 99, new Fecha());
        Jugador jugador2 = new Jugador("Nacho", 8, new Fecha());
        jugadores.add(0, jugador1);
        Equipo marcosFC = new Equipo(jugadores, "MacosFc", "Chaco", "Mañana", "Martes", 8);
        Equipo marcos2FC = new Equipo(jugadores, "Marcos2Fc", "Chaco", "Mañana", "jueves",8);
        Equipo jose2FC = new Equipo(jugadores, "jose2Fc", "Chaco", "Tarde", "Viernes",8);
        Equipo jose1FC = new Equipo(jugadores, "jose1Fc", "Chaco", "Tarde", "Domingo", 8);
        Equipo carlos1FC = new Equipo(jugadores, "carlos1Fc", "Chaco", "Noche", "Miercoles",8 );
        Equipo carlos2C = new Equipo(jugadores, "carlos2Fc", "Chaco", "Noche", "Lunes", 8);
        Equipo masdFC = new Equipo(jugadores, "masd1Fc", "Chaco", "Mañana", "Martes",8);
        Equipo msassFC = new Equipo(jugadores, "masd2Fc", "Chaco", "Tarde", "Viernes",8);
        marcosFC.agregarJugadores(jugador2);
        marcosFC.mostrarEquipo();
        Curling torneo = new Curling();
        torneo.agregarEquipo(marcosFC);
        torneo.agregarEquipo(marcos2FC);
        torneo.agregarEquipo(jose2FC);
        torneo.agregarEquipo(jose1FC);
        torneo.agregarEquipo(carlos1FC);
        torneo.agregarEquipo(carlos2C);
        torneo.agregarEquipo(masdFC);
        torneo.agregarEquipo(msassFC);
        torneo.mostrarTorneo();
        torneo.fixture();

    }
}