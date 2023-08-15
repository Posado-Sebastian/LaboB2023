package tiendaMultimedia;

public class TV extends SeccionMultimedia{
    private TecnologiaTv tecnologia;
    private int respx;

    public TV(TecnologiaTv tecnologia, int respx) {
        this.tecnologia = tecnologia;
        this.respx = respx;
    }

    public void setTecnologia(TecnologiaTv tecnologia) {
        this.tecnologia = tecnologia;
    }

    public void setRespx(int respx) {
        this.respx = respx;
    }

    public TecnologiaTv getTecnologia() {
        return tecnologia;
    }

    public int getRespx() {
        return respx;
    }
}
