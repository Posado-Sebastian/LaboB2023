package sistemaPrestamo;

import java.time.LocalDateTime;
import java.util.Date;

public class Revista extends Lectura implements Prestable{
    private Date fechaPublicacion;

    public Revista(int codigo, String titulo, int fechaPublicacion, Date fechaPublicacion1) {
        super(codigo, titulo, fechaPublicacion);
        this.fechaPublicacion = fechaPublicacion1;
    }
    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
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
        Date hoy= new Date();
        boolean ver=false;
        if (fechaPublicacion.getYear()==hoy.getYear()){
            if (fechaPublicacion.getMonth()>=1 && fechaPublicacion.getMonth()<=3){
                if (hoy.getMonth()>3){
                    ver=true;
                }
            }else if(fechaPublicacion.getMonth()>=3 && fechaPublicacion.getMonth()<=6){
                if (hoy.getMonth()<3 || hoy.getMonth()>6) {
                    ver=true;
                }
            } else if (fechaPublicacion.getMonth()>=6 && fechaPublicacion.getMonth()<=9) {
                if (hoy.getMonth()<6 || hoy.getMonth()>9){
                    ver=true;
                }
            }
        }else {
            ver=true;
        }
        if (ver){
            System.out.println("La revista se dará prestado");
            return true;
        }else {
            System.out.println("La revista no se dará prestado");
            return false;
        }
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
