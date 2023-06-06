package abmLugares;

public class LatitudLongitud {
    private int longitud;
    private int latitud;

    public LatitudLongitud(int longitud, int latitud) {
        this.longitud = longitud;
        this.latitud = latitud;
    }
    public LatitudLongitud(){
        this.longitud = 0;
        this.latitud = 0;
    }
    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public int getLatitud() {
        return latitud;
    }

    public void setLatitud(int latitud) {
        this.latitud = latitud;
    }
}
