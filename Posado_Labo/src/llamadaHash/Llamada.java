package llamadaHash;

import empresaYempleado.Empleado;

import java.util.Date;

public class Llamada {
    private Empleado origen;
    private Empleado destino;
    private Date fecha;
    private int duracion;

    public Llamada(Empleado origen, Empleado destino, Date fecha, int duracion) {
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
        this.duracion = duracion;
    }

    public Empleado getOrigen() {
        return origen;
    }

    public void setOrigen(Empleado origen) {
        this.origen = origen;
    }

    public Empleado getDestino() {
        return destino;
    }

    public void setDestino(Empleado destino) {
        this.destino = destino;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Llamada{" +
                "origen=" + origen +
                ", destino=" + destino +
                ", fecha=" + fecha +
                ", duracion=" + duracion +
                '}';
    }
}
