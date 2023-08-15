package computadora;

import computadora.Componente;

public class Cpu extends Componente {
    private String socket;
    private int cantidadPines;

    public Cpu(){
        super();
        this.socket="";
        this.cantidadPines=0;
    }

    public Cpu(String socket, int cantidadPines) {
        this.socket = socket;
        this.cantidadPines = cantidadPines;
    }

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }

    public int getCantidadPines() {
        return cantidadPines;
    }

    public void setCantidadPines(int cantidadPines) {
        this.cantidadPines = cantidadPines;
    }
}
