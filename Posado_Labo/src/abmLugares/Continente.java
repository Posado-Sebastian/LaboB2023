package abmLugares;

import java.util.HashSet;

public class Continente extends Lugar{
    private HashSet<Pais> paises;

    public Continente(String nombre, int codigo, HashSet<LatitudLongitud> coordenadas, HashSet<Pais> paises) {
        this.paises = paises;
    }

    public Continente() {
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
    @Override public int calcularPoblacion(){
        int poblacion=0;
        for(Pais pais : paises){
            poblacion=pais.calcularPoblacion()+poblacion;
        }
        return poblacion;
    }
    public int poblacionPais(int codigoP){
        int poblacion=0;
        for (Pais pais : paises){
            if(pais.getCodigo()==codigoP){
                poblacion=pais.calcularPoblacion();
            }
        }
        return poblacion;
    }
}
