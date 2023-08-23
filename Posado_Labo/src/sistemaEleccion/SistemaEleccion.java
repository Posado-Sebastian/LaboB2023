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
    public void votar(Votante votante, Candidato candidato){
        if(!votante.getControlVoto()) {
            for (Partido partido : partidos) {
                if (partido.getCandidato()==candidato) {
                    partido.getCandidato().sumarVoto(votante.getProvinciaVoto());
                    votante.setControlVoto(true);
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
            System.out.println(partido.getCandidato().getNombre() + " tiene " + contarVotos(partido.getCandidato()) + " votos, " + contarVotos(partido.getCandidato())*100/aux + "%");
        }
    }
    public Candidato candidatoGanador(){
        Candidato ganador = null;
        for (Partido partido : partidos){
            if(ganador==null){
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
        System.out.println(cant*100/votantes.size() + "% no votaron");
    }

    public static void main(String[] args) {
        HashMap<ProvinciaVoto, Integer> a2 = new HashMap<ProvinciaVoto, Integer>();
        HashMap<ProvinciaVoto, Integer> a3 = new HashMap<ProvinciaVoto, Integer>();
        HashMap<ProvinciaVoto, Integer> a4 = new HashMap<ProvinciaVoto, Integer>();
        HashMap<ProvinciaVoto, Integer> a5 = new HashMap<ProvinciaVoto, Integer>();
        HashMap<TemaPropuesta, ArrayList<String>> a6 = new HashMap<TemaPropuesta, ArrayList<String>>();
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
        a2.put(Tucumán,0);a3.put(Buenos_Aires,0);
        a3.put(Catamarca,0);
        a3.put(Chaco,0);
        a3.put(Chubut,0);
        a3.put(Córdoba,0);
        a3.put(Corrientes,0);
        a3.put(Entre_Ríos,0);
        a3.put(Formosa,0);
        a3.put(Jujuy,0);
        a3.put(La_Pampa,0);
        a3.put(La_Rioja,0);
        a3.put(Mendoza,0);
        a3.put(Misiones,0);
        a3.put(Neuquén,0);
        a3.put(Río_Negro,0);
        a3.put(Salta,0);
        a3.put(San_Juan,0);
        a3.put(San_Luis,0);
        a3.put(Santa_Cruz,0);
        a3.put(Santa_Fe,0);
        a3.put(Santiago_del_Estero,0);
        a3.put(Tierra_del_Fuego,0);
        a3.put(Tucumán,0);a4.put(Buenos_Aires,0);
        a4.put(Catamarca,0);
        a4.put(Chaco,0);
        a4.put(Chubut,0);
        a4.put(Córdoba,0);
        a4.put(Corrientes,0);
        a4.put(Entre_Ríos,0);
        a4.put(Formosa,0);
        a4.put(Jujuy,0);
        a4.put(La_Pampa,0);
        a4.put(La_Rioja,0);
        a4.put(Mendoza,0);
        a4.put(Misiones,0);
        a4.put(Neuquén,0);
        a4.put(Río_Negro,0);
        a4.put(Salta,0);
        a4.put(San_Juan,0);
        a4.put(San_Luis,0);
        a4.put(Santa_Cruz,0);
        a4.put(Santa_Fe,0);
        a4.put(Santiago_del_Estero,0);
        a4.put(Tierra_del_Fuego,0);
        a4.put(Tucumán,0);a5.put(Buenos_Aires,0);
        a5.put(Catamarca,0);
        a5.put(Chaco,0);
        a5.put(Chubut,0);
        a5.put(Córdoba,0);
        a5.put(Corrientes,0);
        a5.put(Entre_Ríos,0);
        a5.put(Formosa,0);
        a5.put(Jujuy,0);
        a5.put(La_Pampa,0);
        a5.put(La_Rioja,0);
        a5.put(Mendoza,0);
        a5.put(Misiones,0);
        a5.put(Neuquén,0);
        a5.put(Río_Negro,0);
        a5.put(Salta,0);
        a5.put(San_Juan,0);
        a5.put(San_Luis,0);
        a5.put(Santa_Cruz,0);
        a5.put(Santa_Fe,0);
        a5.put(Santiago_del_Estero,0);
        a5.put(Tierra_del_Fuego,0);
        a5.put(Tucumán,0);
        Candidato c1 = new Candidato(0, 0, "jose", "hugo", new Date(), 0, a2, a6,null);
        Candidato c2 = new Candidato(0, 0, "marcos", "hugo", new Date(), 0, a3, a6,null);
        Candidato c3 = new Candidato(0, 0, "tyron", "hugo", new Date(), 0, a4, a6,null);
        Candidato c4 = new Candidato(0, 0, "nacho", "hugo", new Date(), 0, a5, a6,null);
        Partido partido1 = new Partido(El_poli_avanza, c1);
        Partido partido2 = new Partido(Juntos_por_el_poli, c2);
        Partido partido3 = new Partido(Unión_por_la_docencia, c3);
        Partido partido4 = new Partido(Frente_de_Constituyentes, c4);
        partido1.getCandidato().setPartido(partido1);
        partido2.getCandidato().setPartido(partido2);
        partido3.getCandidato().setPartido(partido3);
        partido4.getCandidato().setPartido(partido4);
        Votante votante = new Votante(false, Chaco);
        Votante votante2 = new Votante(false, Chaco);
        Votante votante3 = new Votante(true, Chaco);
        Votante votante4 = new Votante(false, San_Juan);
        Votante votante5 = new Votante(false, La_Pampa);
        Votante votante6 = new Votante(false, La_Rioja);
        Votante votante7 = new Votante(false, San_Luis);
        Votante votante8 = new Votante(false, Salta);
        Votante votante9 = new Votante(false, Santa_Cruz);
        Votante votante10 = new Votante(false, Santa_Cruz);
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
        a1.votar(votante2, partido1.getCandidato());
        a1.votar(votante3, partido1.getCandidato());
        a1.votar(votante4, partido1.getCandidato());
        a1.votar(votante5, partido3.getCandidato());
        a1.votar(votante6, partido1.getCandidato());
        a1.votar(votante7, partido1.getCandidato());
        a1.votar(votante8, partido4.getCandidato());
        a1.votar(votante9, partido2.getCandidato());
        System.out.println(a1.contarVotos(partido3.getCandidato()));
        System.out.println(a1.contarVotos(partido1.getCandidato()));
        System.out.println(a1.contarVotos(partido2.getCandidato()));
        System.out.println(a1.contarVotos(partido4.getCandidato()));
        System.out.println(a1.candidatoGanador().getNombre() + " es el ganador");
        a1.noVotaron();
        a1.mostrarDatosVotos();
    }
}
