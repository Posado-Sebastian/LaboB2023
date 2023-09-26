package sistemaEleccion;

import pedidoPlato.Persona;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.HashMap;

public class Trabajador extends Persona implements Partidario{
    private int cuil;
    private int sueldo;
    private HashMap<DayOfWeek, Horario> horarioLaboral;

    public Trabajador(String nombre, String apellido, int dni) {
        super(nombre, apellido, dni);
    }

    public HashMap<DayOfWeek, Horario> getHorarioLaboral() {
        return horarioLaboral;
    }

    public void setHorarioLaboral(HashMap<DayOfWeek, Horario> horarioLaboral) {
        this.horarioLaboral = horarioLaboral;
    }

    public int getCuil() {
        return cuil;
    }

    public void setCuil(int cuil) {
        this.cuil = cuil;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    public boolean verificarHorario(){
        Horario h = horarioLaboral.get(LocalDateTime.now().getDayOfWeek());
        if(h.getInicio().getHour()<LocalDateTime.now().getHour() && h.getFinalizacion().getHour()>LocalDateTime.now().getHour()){
            return true;
        }
        return false;
    }

    @Override
    public void lema(String mensaje) {
        if (verificarHorario()){
            System.out.println("Yo, "+getNombre()+" te invito a que…"+ mensaje);
        }
    }
}
