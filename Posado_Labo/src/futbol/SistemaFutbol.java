package futbol;

import sistemaEleccion.ProvinciaVoto;

import java.util.HashSet;

public class SistemaFutbol {
    private HashSet<Club> clubes;
    private HashSet<Jugador> jugadores;
    private HashSet<Partido> partidos;

    public SistemaFutbol(HashSet<Club> clubes, HashSet<Jugador> jugadores, HashSet<Partido> partidos) {
        this.clubes = clubes;
        this.jugadores = jugadores;
        this.partidos = partidos;
    }

    public HashSet<Club> getClubes() {
        return clubes;
    }

    public void setClubes(HashSet<Club> clubes) {
        this.clubes = clubes;
    }

    public HashSet<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(HashSet<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public HashSet<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(HashSet<Partido> partidos) {
        this.partidos = partidos;
    }
    public static void main(String[] args) {
        Arquero arquero = new Arquero("jose ", "carlos", 2015, ProvinciaVoto.Chaco, new HashSet<Club>(), new Club(),2, Posicion.ARQUERO, 2, 265  );
        JugadorDeCampo jugadorDeCampo = new JugadorDeCampo("josecampo ", "carlos", 2015, ProvinciaVoto.Chaco, new HashSet<Club>(), new Club(),2, Posicion.MEDIOCAMPISTA, 67, 99  );
        Arquero arquero2 = new Arquero("jose2 ", "carlos", 2015, ProvinciaVoto.Chaco, new HashSet<Club>(), new Club(),2, Posicion.ARQUERO, 60, 2  );
        JugadorDeCampo jugadorDeCampo2 = new JugadorDeCampo("josecampo2 ", "carlos", 2015, ProvinciaVoto.Chaco, new HashSet<Club>(), new Club(),2, Posicion.MEDIOCAMPISTA, 30, 99  );
        System.out.println(arquero.toString());
        Club club1 = new Club("joseclub", new HashSet<>());
        club1.contratar(jugadorDeCampo);
        club1.contratar(arquero);
        club1.contratar(jugadorDeCampo2);
        club1.contratar(arquero2);
    }
}
