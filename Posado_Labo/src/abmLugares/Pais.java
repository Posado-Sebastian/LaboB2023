package abmLugares;

import java.util.HashSet;

public class Pais extends Lugar{
    private HashSet<Provincia> provincias;

    public Pais(String nombre, int codigo, HashSet<LatitudLongitud> coordenadas, HashSet<Provincia> provincias) {
        super(nombre, codigo, coordenadas);
        this.provincias = provincias;
    }

    public Pais(HashSet<Provincia> provincias) {
        this.provincias = provincias;
    }

    public HashSet<Provincia> getProvincias() {
        return provincias;
    }

    public void setProvincias(HashSet<Provincia> provincias) {
        this.provincias = provincias;
    }
    public void agregarProvincia(Provincia provincia){
        provincias.add(provincia);
    }
    public void borrarProvincia(Provincia provincia){
        provincias.remove(provincia);
    }
    public void modificarProvincia(Provincia provinciaAmodificar, Provincia provinciaModificado){
        provincias.remove(provinciaAmodificar);
        provincias.add(provinciaModificado);
    }
    public int calcularPoblacionProvincia(){
        int poblacion=0;
        for(Provincia provincia : provincias){
            poblacion=provincia.calcularPoblacionCiudad()+poblacion;
        }
        return poblacion;
    }
    public int poblacionProvincia(int codigoP){
        int poblacion=0;
        for (Provincia provincia : provincias){
            if(provincia.getCodigo()==codigoP){
                poblacion=provincia.calcularPoblacionCiudad();
            }
        }
        return poblacion;
    }
}
