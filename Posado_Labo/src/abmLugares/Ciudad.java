package abmLugares;

import java.util.HashSet;

public class Ciudad extends Lugar {
    private HashSet<Barrio> barrios;

    public Ciudad(String nombre, int codigo, HashSet<LatitudLongitud> coordenadas, HashSet<Barrio> barrios) {
        this.barrios = barrios;
    }

    public Ciudad(HashSet<Barrio> barrios) {
        this.barrios = new HashSet<Barrio>();
    }

    public HashSet<Barrio> getBarrios() {
        return barrios;
    }

    public void setBarrios(HashSet<Barrio> barrios) {
        this.barrios = barrios;
    }
    public void agregarBarrio(Barrio barrio){
        barrios.add(barrio);
    }
    public void borrarBarrio(Barrio barrio){
        barrios.remove(barrio);
    }
    public void modificarBarrio(Barrio barrioAmodificar, Barrio barrioModificado){
        barrios.remove(barrioAmodificar);
        barrios.add(barrioModificado);
    }
    @Override public int calcularPoblacion(){
        int poblacion=0;
        for (Barrio barrio : barrios){
            poblacion=barrio.getPoblacion()+poblacion;
        }
        return poblacion;
    }
    public int poblacionBarrio(int codigoB){
        int poblacion=0;
        for(Barrio barrio : barrios){
            if(barrio.getCodigo()==codigoB){
                poblacion=barrio.getPoblacion();
            }
        }
        return poblacion;
    }
}
