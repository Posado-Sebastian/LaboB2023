package sistemaEleccion;

import abmLugares.Provincia;
import mascotas.Pez;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;

import static sistemaEleccion.NombrePartido.*;
import static sistemaEleccion.ProvinciaVoto.*;

public class SistemaEleccion {
    private HashSet<Votante> votantes;
    private HashSet<Partido> partidos;

    public SistemaEleccion(HashSet<Votante> votantes, HashSet<Partido> partidos) {
        this.votantes = votantes;
        this.partidos = partidos;
    }
    public SistemaEleccion() {
        this.votantes = new HashSet<Votante>();
        this.partidos = new HashSet<Partido>();
    }

    public HashSet<Votante> getVotantes() {
        return votantes;
    }

    public void setVotantes(HashSet<Votante> votantes) {
        this.votantes = votantes;
    }

    public HashSet<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(HashSet<Partido> partidos) {
        this.partidos = partidos;
    }
    public void votar(Votante votante, ProvinciaVoto provincia, Candidato candidato){
        if(!votante.getControlVoto()) {
            for (Partido partido : partidos) {
                if (partido.getCandidato().equals(candidato)) {
                    candidato.getVotosProvincia().replace(provincia, candidato.getVotosProvincia().get(provincia)+1);
                }
            }
        }else{
            System.out.println("ya voto");
        }
    }
    public int contarVotos(Candidato candidato){
        int cant=0;
        for (int votos: candidato.getVotosProvincia().values()) {
            cant+=votos;
        }
        return cant;
    }
    public void mostrarDatosVotos(){
        int aux=0;
        for (Votante votante : votantes){
            if(votante.getControlVoto()){
                aux+=1;
            }
        }
        for (Partido partido : partidos){
            System.out.println(partido.getCandidato() + " tiene " + contarVotos(partido.getCandidato()) + " votos, " + contarVotos(partido.getCandidato())*100/aux + "%");
        }
    }
    public Candidato candidatoGanador(){
        Candidato ganador = null;
        for (Partido partido : partidos){
            if(ganador.equals(null)){
                ganador=partido.getCandidato();
            }
            if(contarVotos(ganador)<contarVotos(partido.getCandidato())){
                ganador=partido.getCandidato();
            }
        }
        return ganador;
    }
    public void noVotaron(){
        int cant=0;
        for(Votante votante : votantes){
            if(!votante.getControlVoto()){
                cant+=1;
            }
        }
        System.out.println(cant*100/votantes.size());
    }

    public static void main(String[] args) {
        HashMap<ProvinciaVoto, Integer> a2 = new HashMap<ProvinciaVoto, Integer>();
        HashMap<TemaPropuesta, ArrayList<String>> a3 = new HashMap<TemaPropuesta, ArrayList<String>>();
        a2.put(Buenos_Aires,0);
        a2.put(Catamarca,0);
        a2.put(Chaco,0);
        a2.put(Chubut,0);
        a2.put(Córdoba,0);
        a2.put(Corrientes,0);
        a2.put(Entre_Ríos,0);
        a2.put(Formosa,0);
        a2.put(Jujuy,0);
        a2.put(La_Pampa,0);
        a2.put(La_Rioja,0);
        a2.put(Mendoza,0);
        a2.put(Misiones,0);
        a2.put(Neuquén,0);
        a2.put(Río_Negro,0);
        a2.put(Salta,0);
        a2.put(San_Juan,0);
        a2.put(San_Luis,0);
        a2.put(Santa_Cruz,0);
        a2.put(Santa_Fe,0);
        a2.put(Santiago_del_Estero,0);
        a2.put(Tierra_del_Fuego,0);
        a2.put(Tucumán,0);
        Partido partido1 = new Partido(El_poli_avanza, new Candidato("jose",null,0,a2,a3,null));
        Partido partido2 = new Partido(Juntos_por_el_poli, new Candidato("nico",null,0,a2,a3,null));
        Partido partido3 = new Partido(Unión_por_la_docencia, new Candidato("marcos",null,0,a2,a3,null));
        Partido partido4 = new Partido(Frente_de_Constituyentes, new Candidato("nacho",null,0,a2,a3,null));
        Votante votante = new Votante(1, new Date(), false);
        Votante votante2 = new Votante(1, new Date(), false);
        Votante votante3 = new Votante(1, new Date(), true);
        Votante votante4 = new Votante(1, new Date(), false);
        Votante votante5 = new Votante(1, new Date(), false);
        Votante votante6 = new Votante(1, new Date(), false);
        Votante votante7 = new Votante(1, new Date(), false);
        Votante votante8 = new Votante(1, new Date(), false);
        Votante votante9 = new Votante(1, new Date(), false);
        Votante votante10 = new Votante(1, new Date(), false);
        SistemaEleccion a1 = new SistemaEleccion();
        a1.partidos.add(partido1);
        a1.partidos.add(partido2);
        a1.partidos.add(partido3);
        a1.partidos.add(partido4);
        a1.votantes.add(votante);
        a1.votantes.add(votante2);
        a1.votantes.add(votante3);
        a1.votantes.add(votante4);
        a1.votantes.add(votante5);
        a1.votantes.add(votante6);
        a1.votantes.add(votante7);
        a1.votantes.add(votante8);
        a1.votantes.add(votante9);
        a1.votantes.add(votante10);
        a1.votar(votante2, Chaco, partido1.getCandidato());
        a1.votar(votante3, Chaco, partido1.getCandidato());
        a1.votar(votante4, Chaco, partido4.getCandidato());
        a1.votar(votante5, Chaco, partido3.getCandidato());
        a1.votar(votante6, Chaco, partido1.getCandidato());
        a1.votar(votante7, Chaco, partido3.getCandidato());
        a1.votar(votante8, Chaco, partido4.getCandidato());
        a1.votar(votante9, Chaco, partido2.getCandidato());
        a1.contarVotos(partido3.getCandidato());
        System.out.println(a1.candidatoGanador());
        a1.noVotaron();
        a1.mostrarDatosVotos();
    }
}
