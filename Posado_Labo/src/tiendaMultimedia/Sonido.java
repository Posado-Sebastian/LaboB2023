package tiendaMultimedia;

public class Sonido extends SeccionMultimedia{
    private Boolean bluetooth;

    public Sonido(String nombre, double precio, int stock, Boolean bluetooth) {
        super(nombre, precio, stock);
        this.bluetooth=bluetooth;
    }

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
