package abmLugares;

import java.util.HashSet;

public class Barrio extends Lugar{
    private int poblacion;

    public Barrio(String nombre, int codigo, HashSet<LatitudLongitud> coordenadas, int poblacion) {
        this.poblacion = poblacion;
    }

    public Barrio() {
        this.poblacion = 0;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }
    @Override public int calcularPoblacion(){
        return poblacion;
    }
}
