package abmLugares;

import java.util.HashSet;

public class SysLugar {
    private HashSet<Continente> continentes;

    public SysLugar(HashSet<Continente> continentes) {
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
    public void agregarLugar(Lugar lugar, int codigo){//lugar y codigo del lugar al que pertenece
        if(lugar instanceof Continente){
            continentes.add((Continente) lugar);
        }else if(lugar instanceof Pais){
            for (Continente continente: continentes){
                if(continente.getCodigo()==codigo){
                    continente.agregarPais((Pais) lugar);
                }
            }
        }else if(lugar instanceof Provincia){
            for (Continente continente : continentes){
                for(Pais pais : continente.getPaises()){
                    if(pais.getCodigo()==codigo){
                        pais.agregarProvincia((Provincia) lugar);
                    }
                }
            }
        } else if (lugar instanceof Ciudad) {
            for (Continente continente : continentes){
                for(Pais pais : continente.getPaises()){
                    for(Provincia provincia : pais.getProvincias()) {
                        if (provincia.getCodigo() == codigo) {
                            provincia.agregarCiudad((Ciudad) lugar);
                        }
                    }
                }
            }
        } else if (lugar instanceof Barrio) {
            for (Continente continente : continentes){
                for(Pais pais : continente.getPaises()){
                    for(Provincia provincia : pais.getProvincias()) {
                        for(Ciudad ciudad : provincia.getCiudades()) {
                            if (ciudad.getCodigo() == codigo) {
                                ciudad.agregarBarrio((Barrio) lugar);
                            }
                        }
                    }
                }
            }
        }
    }
    public void eliminarLugar(Lugar lugar, int codigo){//lugar y codigo del lugar al que pertenece
        if(lugar instanceof Continente){
            continentes.add((Continente) lugar);
        }else if(lugar instanceof Pais){
            for (Continente continente: continentes){
                if(continente.getCodigo()==codigo){
                    continente.borrarPais((Pais) lugar);
                }
            }
        }else if(lugar instanceof Provincia){
            for (Continente continente : continentes){
                for(Pais pais : continente.getPaises()){
                    if(pais.getCodigo()==codigo){
                        pais.borrarProvincia((Provincia) lugar);
                    }
                }
            }
        } else if (lugar instanceof Ciudad) {
            for (Continente continente : continentes){
                for(Pais pais : continente.getPaises()){
                    for(Provincia provincia : pais.getProvincias()) {
                        if (provincia.getCodigo() == codigo) {
                            provincia.borrarCiudad((Ciudad) lugar);
                        }
                    }
                }
            }
        } else if (lugar instanceof Barrio) {
            for (Continente continente : continentes){
                for(Pais pais : continente.getPaises()){
                    for(Provincia provincia : pais.getProvincias()) {
                        for(Ciudad ciudad : provincia.getCiudades()) {
                            if (ciudad.getCodigo() == codigo) {
                                ciudad.borrarBarrio((Barrio) lugar);
                            }
                        }
                    }
                }
            }
        }
    }
    public void modificarLugar(Lugar lugar, Lugar lugarModificado,int codigo){//lugar, lugar modificado y codigo del lugar al que pertenece
        if(lugar instanceof Continente){
            continentes.add((Continente) lugar);
        }else if(lugar instanceof Pais){
            for (Continente continente: continentes){
                if(continente.getCodigo()==codigo){
                    continente.modificarPais((Pais) lugar, (Pais) lugarModificado);
                }
            }
        }else if(lugar instanceof Provincia){
            for (Continente continente : continentes){
                for(Pais pais : continente.getPaises()){
                    if(pais.getCodigo()==codigo){
                        pais.modificarProvincia((Provincia) lugar, (Provincia) lugarModificado);
                    }
                }
            }
        } else if (lugar instanceof Ciudad) {
            for (Continente continente : continentes){
                for(Pais pais : continente.getPaises()){
                    for(Provincia provincia : pais.getProvincias()) {
                        if (provincia.getCodigo() == codigo) {
                            provincia.modificarCiudad((Ciudad) lugar, (Ciudad) lugarModificado);
                        }
                    }
                }
            }
        } else if (lugar instanceof Barrio) {
            for (Continente continente : continentes){
                for(Pais pais : continente.getPaises()){
                    for(Provincia provincia : pais.getProvincias()) {
                        for(Ciudad ciudad : provincia.getCiudades()) {
                            if (ciudad.getCodigo() == codigo) {
                                ciudad.modificarBarrio((Barrio) lugar, (Barrio) lugarModificado);
                            }
                        }
                    }
                }
            }
        }
    }
}
