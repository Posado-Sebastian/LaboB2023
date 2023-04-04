import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
        Jugador jugador1 = new Jugador("Marcquitos", 99, new Fecha(), false);
        Jugador jugador2 = new Jugador("Nacho", 8, new Fecha(), true);
        jugadores.add(0, jugador1);
        Equipo marcosFC = new Equipo(jugadores, "MacosFc", "Chaco", "Mañana");
        Equipo marcos2FC = new Equipo(jugadores, "MacosFc", "Chaco", "Mañana");
        Equipo jose2FC = new Equipo(jugadores, "MacosFc", "Chaco", "Tarde");
        Equipo jose1FC = new Equipo(jugadores, "MacosFc", "Chaco", "Tarde");
        Equipo carlos1FC = new Equipo(jugadores, "MacosFc", "Chaco", "Noche");
        Equipo carlos2C = new Equipo(jugadores, "MacosFc", "Chaco", "Noche");
        Equipo masdFC = new Equipo(jugadores, "MacosFc", "Chaco", "Mañana");
        Equipo msassFC = new Equipo(jugadores, "MacosFc", "Chaco", "Tarde");
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