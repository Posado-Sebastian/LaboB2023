package abmLugares;

import java.util.HashSet;

public abstract class Lugar {
    private String nombre;
    private int codigo;
    private HashSet<LatitudLongitud> coordenadas;
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public HashSet<LatitudLongitud> getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(HashSet<LatitudLongitud> coordenadas) {
        this.coordenadas = coordenadas;
    }
    abstract int calcularPoblacion();
}
