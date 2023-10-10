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
    public void actualizarJugador(Jugador jugador, Partido partido) {
        for (Jugador j : jugadores) {
            if (jugador.getPosicion().equals(Posicion.ARQUERO) && j.equals(jugador)){
                j.actualizarDatos(partido.cantGolesNoAtajados(jugador), partido.cantJugadasEnArco(j), 0);
            }else if(!jugador.getPosicion().equals(Posicion.ARQUERO) && j.equals(jugador)){
                j.actualizarDatos(partido.cantGoles(jugador), partido.cantIntentosAlArco(jugador), partido.cantAsistencias(jugador));
            }
        }
    }

    public void setPartidos(HashSet<Partido> partidos) {
        this.partidos = partidos;
    }
    public void agregarPartido(Partido partido){
        partidos.add(partido);
        for(Jugador j : partido.getJugadoresClub1()){
            actualizarJugador(j, partido);
        }
        for(Jugador j : partido.getJugadoresClub2()){
            actualizarJugador(j, partido);
        }
    }
    public static void main(String[] args) {
        Arquero arquero = new Arquero("jose ", "carlos", 2015, ProvinciaVoto.Chaco, new HashSet<Club>(), new Club(),2, Posicion.ARQUERO, 9, 100);
        JugadorDeCampo jugadorDeCampo = new JugadorDeCampo("josecampo ", "carlos", 2015, ProvinciaVoto.Chaco, new HashSet<Club>(), new Club(),2, Posicion.MEDIOCAMPISTA, 10, 6,233  );
        Arquero arquero2 = new Arquero("jose2 ", "carlos", 2015, ProvinciaVoto.Chaco, new HashSet<Club>(), new Club(),2, Posicion.ARQUERO, 60, 2  );
        JugadorDeCampo jugadorDeCampo2 = new JugadorDeCampo("josecampo2 ", "carlos", 2015, ProvinciaVoto.Chaco, new HashSet<Club>(), new Club(),2, Posicion.MEDIOCAMPISTA, 30, 99,3  );
        System.out.println(arquero.toString());
        Club club1 = new Club("joseclub", new HashSet<>());
        Club club2 = new Club("marcosClub", new HashSet<>());
        Arquero arquero3 = new Arquero("juan ", "carlos", 2015, ProvinciaVoto.Chaco, new HashSet<Club>(), new Club(),2, Posicion.ARQUERO, 9, 100);
        JugadorDeCampo jugadorDeCampo3 = new JugadorDeCampo("juancampo ", "carlos", 2015, ProvinciaVoto.Chaco, new HashSet<Club>(), new Club(),2, Posicion.MEDIOCAMPISTA, 10, 6,233  );
        club1.contratar(jugadorDeCampo);
        club1.contratar(arquero);
        club1.contratar(jugadorDeCampo2);
        club1.contratar(arquero2);
        club2.contratar(arquero3);
        club2.contratar(jugadorDeCampo3);
        Partido partido = new Partido();
    }
}
