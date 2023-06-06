package abmLugares;

import java.util.HashSet;

public class SysLugares {
    private HashSet<Continente> continentes;

    public SysLugares(HashSet<Continente> continentes) {
        this.continentes = continentes;
    }

    public HashSet<Continente> getContinentes() {
        return continentes;
    }

    public void setContinentes(HashSet<Continente> continentes) {
        this.continentes = continentes;
    }
    public void agregarContinente(Continente continente){
        continentes.add(continente);
    }
    public void borrarContinente(Continente continente){
        continentes.remove(continente);
    }
    public void modificarContinente(Continente continenteAmodificar, Continente continenteModificado){
        continentes.remove(continenteAmodificar);
        continentes.add(continenteModificado);
    }
    public void continenteMasPoblacion(){
        int poblacion=0;
        Continente continenteMas=null;
        for (Continente continente : continentes){
            if(continente.calcularPoblacionPais()>poblacion){
                poblacion=continente.calcularPoblacionPais();
                continenteMas=continente;
            }
        }
        System.out.println("El continente con mas poblacion es: " + continenteMas.getNombre() + " con una poblacion de " + poblacion);
    }
    public void continenteMenosPoblacion(){
        int poblacion=0;
        Continente continenteMenos=null;
        for (Continente continente : continentes){
            if(continenteMenos==null){
                continenteMenos=continente;
            }
            if(continente.calcularPoblacionPais()<poblacion){
                poblacion=continente.calcularPoblacionPais();
                continenteMenos=continente;
            }
        }
        System.out.println("El continente con menos poblacion es: " + continenteMenos.getNombre() + " con una poblacion de " + poblacion);
    }
}
