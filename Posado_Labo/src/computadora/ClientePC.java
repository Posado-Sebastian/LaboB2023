package computadora;

import pedidoPlato.Persona;

public class ClientePC extends Persona {
    private int nroTarjeta;
    private int telefono;

    public ClientePC (){
        super();
        this.nroTarjeta=0;
        this.telefono=0;
    }
    public ClientePC(int edad, int direccion, String nombre, String apellido, int nroTarjeta, int telefono){
        super(edad, direccion, nombre, apellido);
        this.nroTarjeta=nroTarjeta;
        this.telefono=telefono;
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
