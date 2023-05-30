package cosasPersona;

public class PlatoCaloria extends Plato{
    private Float caloria;

    public PlatoCaloria(Float caloria) {
        this.caloria = caloria;
    }

    public PlatoCaloria(String nombre, int precio, Float caloria) {
        super(nombre, precio);
        this.caloria = caloria;
    }

    public Float getCaloria() {
        return caloria;
    }

    public void setCaloria(Float caloria) {
        this.caloria = caloria;
    }
}
