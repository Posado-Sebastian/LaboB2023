package llamada;

import pedidoPlato.Persona;

public class EmpleadoLlamada extends Persona {
    private String pais;
    private int anio;
    private int DNI;

    public EmpleadoLlamada(String nombre, String pais, int anio, int DNI) {
        super(nombre);
        this.pais = pais;
        this.anio = anio;
        this.DNI = DNI;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }
}
