package abmLugares;

import java.util.HashSet;

public class Barrio extends Lugar{
    private int poblacion;

    public Barrio(String nombre, int codigo, HashSet<LatitudLongitud> coordenadas, int poblacion) {
        super(nombre, codigo, coordenadas);
        this.poblacion = poblacion;
    }

    public Barrio() {
        super();
        this.poblacion = 0;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }
}
