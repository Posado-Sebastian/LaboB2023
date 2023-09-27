package sistemaEleccion;

import pedidoPlato.Color;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Partido partido = new Partido();
        partido.setNombrePartido(NombrePartido.El_poli_avanza);

        Horario horario = new Horario(LocalDateTime.of(1,1,1,1,0), LocalDateTime.of(1,1,1,23,0));
        Horario horario2 = new Horario(LocalDateTime.of(1,1,1,16,0), LocalDateTime.of(1,1,1,22,0));
        HashMap<DayOfWeek, Horario> horarioHashMap = new HashMap<>();
        HashMap<DayOfWeek, Horario> horarioHashMap2 = new HashMap<>();
        horarioHashMap.put(DayOfWeek.TUESDAY,horario);
        horarioHashMap2.put(DayOfWeek.TUESDAY,horario2);
        horarioHashMap.put(DayOfWeek.MONDAY,horario);
        horarioHashMap2.put(DayOfWeek.MONDAY,horario2);
        horarioHashMap.put(DayOfWeek.WEDNESDAY,horario);
        horarioHashMap2.put(DayOfWeek.WEDNESDAY,horario2);
        horarioHashMap.put(DayOfWeek.THURSDAY,horario);
        horarioHashMap2.put(DayOfWeek.THURSDAY,horario2);
        Trabajador trabajador1 = new Trabajador("jose", "3", 2015, horarioHashMap);
        Trabajador trabajador2 = new Trabajador("juan", "manuel", 2015, horarioHashMap2);
        PalomaMensajera palomaMensajera1= new PalomaMensajera(Color.NEGRO,"pajaro", "paloma", true);
        PalomaMensajera palomaMensajera2= new PalomaMensajera(Color.NEGRO,"noosabevolar", "paloma", false);
        TelefonoMovil telefonoMovil1=new TelefonoMovil(true, 5);
        TelefonoMovil telefonoMovil2=new TelefonoMovil(true, 0);
        TelefonoMovil telefonoMovil3=new TelefonoMovil(false, 5);
        partido.agregarMensajero(telefonoMovil1);
        partido.agregarMensajero(telefonoMovil2);
        partido.agregarMensajero(telefonoMovil3);
        partido.agregarMensajero(trabajador1);
        partido.agregarMensajero(trabajador2);
        partido.agregarMensajero(palomaMensajera1);
        partido.agregarMensajero(palomaMensajera2);
        partido.hacerCampaña();
    }
}
