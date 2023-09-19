package centroEducativo;

import java.time.LocalDateTime;

public abstract class Examen implements Aprobable {
    public LocalDateTime fechaRealizacion;

    public Examen(LocalDateTime fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }

    public LocalDateTime getFechaRealizacion() {
        return fechaRealizacion;
    }

    public void setFechaRealizacion(LocalDateTime fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }

    @Override
    public boolean aprobado() {
        return true;
    }
}
