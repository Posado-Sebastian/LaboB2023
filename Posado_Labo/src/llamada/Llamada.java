package llamada;

import java.util.Date;

public class Llamada {
    private EmpleadoLlamada origen;
    private EmpleadoLlamada destino;
    private Date fecha;
    private int duracion;

    public Llamada(EmpleadoLlamada origen, EmpleadoLlamada destino, Date fecha, int duracion) {
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
        this.duracion = duracion;
    }
    public Llamada(){
        this.origen = new EmpleadoLlamada();
        this.destino = new EmpleadoLlamada();
        this.fecha = new Date();
        this.duracion = 0;
    }

    public EmpleadoLlamada getOrigen() {
        return origen;
    }

    public void setOrigen(EmpleadoLlamada origen) {
        this.origen = origen;
    }

    public EmpleadoLlamada getDestino() {
        return destino;
    }

    public void setDestino(EmpleadoLlamada destino) {
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
    public void mostrarDatos(){
        System.out.println("Destino: " + destino.getApellido() + " | sistemaVehiculo.Fecha: " + fecha.getDay() + fecha.getMonth() + " | Duracion: " + duracion);
    }
}
