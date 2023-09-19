package centroEducativo;

import java.time.LocalDateTime;
import java.util.Date;

public class ExamenEscrito extends Examen implements Aprobable{
    private int duracion;
    private int nota;

    public ExamenEscrito(LocalDateTime fechaRealizacion, int duracion, int nota) {
        super(fechaRealizacion);
        this.duracion = duracion;
        this.nota = nota;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public boolean aprobado() {
        if(nota>=6 && duracion<90) {
            return true;
        }else {
            return false;
        }
    }
}
