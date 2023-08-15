package computadora;

import pedidoPlato.Persona;

public class ClientePC extends Persona {
    private int nroTarjeta;
    private int telefono;

    public ClientePC(String nombre, int nroTarjeta, int telefono) {
        super(nombre);
        this.nroTarjeta = nroTarjeta;
        this.telefono = telefono;
    }

    public int getNroTarjeta() {
        return nroTarjeta;
    }

    public void setNroTarjeta(int nroTarjeta) {
        this.nroTarjeta = nroTarjeta;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "computadora.ClientePC{" +
                "nroTarjeta=" + nroTarjeta +
                ", telefono=" + telefono +
                '}';
    }
}
