package tiendaMultimedia;

public class Sonido extends SeccionMultimedia{
    private Boolean bluetooth;


    public Sonido() {
        super();
        this.bluetooth=false;
    }

    public Boolean getBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(Boolean bluetooth) {
        this.bluetooth = bluetooth;
    }
}
