package abmLugares;

import java.util.HashSet;

public class Lugar {
    private String nombre;
    private int codigo;
    private HashSet<LatitudLongitud> coordenadas;

    public Lugar(String nombre, int codigo, HashSet<LatitudLongitud> coordenadas) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.coordenadas = coordenadas;
    }
    public Lugar(){
        this.nombre = "";
        this.codigo = 0;
        this.coordenadas = null;
    }

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

}
