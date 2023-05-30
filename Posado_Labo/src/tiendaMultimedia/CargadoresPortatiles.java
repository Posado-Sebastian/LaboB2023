package tiendaMultimedia;

public class CargadoresPortatiles extends SeccionCargadores{
    private int cantCargas;

    public CargadoresPortatiles(String nombre, double precio, int stock, int cantCargas) {
        super(nombre, precio, stock);
        this.cantCargas = cantCargas;
    }

    public CargadoresPortatiles() {
        this.cantCargas = 0;
    }

    public int getCantCargas() {
        return cantCargas;
    }

    public void setCantCargas(int cantCargas) {
        this.cantCargas = cantCargas;
    }
}
