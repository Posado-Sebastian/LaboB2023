package tiendaMultimedia;

public class CargadoresPortatiles extends SeccionCargadores{
    private int cantCargas;

    public CargadoresPortatiles(int cantCargas) {
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
