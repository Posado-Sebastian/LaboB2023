package abmLugares;

import java.util.HashSet;

public class Continente extends Lugar{
    private HashSet<Pais> paises;

    public Continente(String nombre, int codigo, HashSet<LatitudLongitud> coordenadas, HashSet<Pais> paises) {
        super(nombre, codigo, coordenadas);
        this.paises = paises;
    }

    public Continente() {
        super();
        this.paises = new HashSet<Pais>();
    }

    public HashSet<Pais> getPaises() {
        return paises;
    }

    public void setPaises(HashSet<Pais> paises) {
        this.paises = paises;
    }
    public void agregarPais(Pais pais){
        paises.add(pais);
    }
    public void borrarPais(Pais pais){
        paises.remove(pais);
    }
    public void modificarPais(Pais paisAmodificar, Pais paisModificado){
        paises.remove(paisAmodificar);
        paises.add(paisModificado);
    }
    public int calcularPoblacionPais(){
        int poblacion=0;
        for(Pais pais : paises){
            poblacion=pais.calcularPoblacionProvincia()+poblacion;
        }
        return poblacion;
    }
    public int poblacionPais(int codigoP){
        int poblacion=0;
        for (Pais pais : paises){
            if(pais.getCodigo()==codigoP){
                poblacion=pais.calcularPoblacionProvincia();
            }
        }
        return poblacion;
    }
    public void paisMasPoblacion(){
        int poblacion=0;
        Pais paisMas=null;
        for (Pais pais : paises){
            if(pais.calcularPoblacionProvincia()>poblacion){
                poblacion=pais.calcularPoblacionProvincia();
                paisMas=pais;
            }
        }
        System.out.println("El pais con mas poblacion es: " + paisMas.getNombre() + " con una poblacion de " + poblacion);
    }
    public void paisMenosPoblacion(){
        int poblacion=0;
        Pais paisMenos=null;
        for (Pais pais : paises){
            if(paisMenos==null){
                paisMenos=pais;
            }
            if(pais.calcularPoblacionProvincia()<poblacion){
                poblacion=pais.calcularPoblacionProvincia();
                paisMenos=pais;
            }
        }
        System.out.println("El pais con menos poblacion es: " + paisMenos.getNombre() + " con una poblacion de " + poblacion);
    }
}
