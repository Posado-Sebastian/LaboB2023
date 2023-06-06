package abmLugares;

import java.util.HashSet;

public class Provincia extends Lugar {
    private HashSet<Ciudad> ciudades;

    public Provincia(String nombre, int codigo, HashSet<LatitudLongitud> coordenadas, HashSet<Ciudad> ciudades) {
        super(nombre, codigo, coordenadas);
        this.ciudades = ciudades;
    }

    public Provincia(HashSet<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }

    public HashSet<Ciudad> getCiudades() {
        return ciudades;
    }

    public void setCiudades(HashSet<Ciudad> ciudades) {
        this.ciudades = ciudades;
    }
    public void agregarCiudad(Ciudad ciudad){
        ciudades.add(ciudad);
    }
    public void borrarCiudad(Ciudad ciudad){
        ciudades.remove(ciudad);
    }
    public void modificarCiudad(Ciudad ciudadAmodificar, Ciudad ciudadModificado){
        ciudades.remove(ciudadAmodificar);
        ciudades.add(ciudadModificado);
    }
    public int calcularPoblacionCiudad(){
        int poblacion=0;
        for(Ciudad ciudad : ciudades){
            poblacion=ciudad.calcularPoblacionBarrios()+poblacion;
        }
        return poblacion;
    }
    public int poblacionCiudad(int codigoC){
        int poblacion=0;
        for (Ciudad ciudad : ciudades){
            if(ciudad.getCodigo()==codigoC){
                poblacion=ciudad.calcularPoblacionBarrios();
            }
        }
        return poblacion;
    }
}
