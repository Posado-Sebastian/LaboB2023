package sistemaPrestamo;

import java.time.LocalDateTime;
import java.util.Date;

public class Revista extends Lectura{
    private LocalDateTime fechaPublicacion;

    public Revista(int codigo, String titulo, int añoPublicacion, LocalDateTime fechaPublicacion) {
        super(codigo, titulo, añoPublicacion);
        this.fechaPublicacion = fechaPublicacion;
    }

    public LocalDateTime getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDateTime fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    @Override
    public String toString() {
        return "Revista{" +
                "fechaPublicacion=" + fechaPublicacion +", codigo"+getCodigo()+
                '}';
    }

    @Override
    public boolean prestar() {
        if(fechaPublicacion.isBefore(LocalDateTime.now().minusMonths(3))){
            return true;
        }
        return false;
    }

    @Override
    public void agregarElemento() {
        if (prestar()){
            System.out.println("El artículo ingresado puede ingresar al circuito de préstamos");
        }else {
            System.out.println("El artículo ingresado no podra ingresar al circuito de préstamos");
        }
    }
}
