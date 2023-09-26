package sistemaEleccion;

import java.time.LocalDateTime;

public class Horario {
    private LocalDateTime inicio;
    private LocalDateTime finalizacion;

    public Horario(LocalDateTime inicio, LocalDateTime finalizacion) {
        this.inicio = inicio;
        this.finalizacion = finalizacion;
    }

    public LocalDateTime getInicio() {
        return inicio;
    }

    public void setInicio(LocalDateTime inicio) {
        this.inicio = inicio;
    }

    public LocalDateTime getFinalizacion() {
        return finalizacion;
    }

    public void setFinalizacion(LocalDateTime finalizacion) {
        this.finalizacion = finalizacion;
    }
}
