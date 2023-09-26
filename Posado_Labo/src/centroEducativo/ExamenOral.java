package centroEducativo;

import java.time.LocalDateTime;

public class ExamenOral extends Examen {
    private NivelSatisfaccion nivelSatisfaccion;

    public ExamenOral(LocalDateTime fechaRealizacion, NivelSatisfaccion nivelSatisfaccion) {
        super(fechaRealizacion);
        this.nivelSatisfaccion = nivelSatisfaccion;
    }

    public NivelSatisfaccion getNivelSatisfaccion() {
        return nivelSatisfaccion;
    }

    public void setNivelSatisfaccion(NivelSatisfaccion nivelSatisfaccion) {
        this.nivelSatisfaccion = nivelSatisfaccion;
    }

    @Override
    public boolean aprobado() {
        if(nivelSatisfaccion==NivelSatisfaccion.SUFICIENTE || nivelSatisfaccion==NivelSatisfaccion.EXCELENTE){
            return true;
        }else {
            return false;
        }
    }
}
