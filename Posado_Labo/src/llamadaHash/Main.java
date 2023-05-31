package llamadaHash;

import empresaYempleado.Dia;
import empresaYempleado.Empleado;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Dia> s = new HashSet<Dia>();
        HashMap<Date, Boolean> m =new HashMap<Date, Boolean>();
        Empleado emp1 = new Empleado("juan", "juan", 44, new Date(), "peru", s, m);
        Empleado emp2 = new Empleado("martin", "martin", 22, new Date(), "china", s, m);
        Empleado emp3 = new Empleado("rafa", "rafa", 32, new Date(), "china", s, m);
        Empleado emp4 = new Empleado("carlos", "carlos", 11, new Date(), "iran", s, m);
        Llamada l1 = new Llamada(emp2, emp3, new Date(), 2);
        Llamada l2 = new Llamada(emp1, emp4, new Date(), 5);
        Llamada l3 = new Llamada(emp1, emp3, new Date(), 7);
        Llamada l4 = new Llamada(emp2, emp4, new Date(), 2);
        Llamada l5 = new Llamada(emp4, emp1, new Date(), 1);
        Llamada l6 = new Llamada(emp3, emp1, new Date(), 6);
        HashMap<Llamada, Empleado> llamadas = new HashMap<Llamada, Empleado>();
        llamadas.put(l1, emp2);
        llamadas.put(l2, emp1);
        llamadas.put(l3, emp1);
        llamadas.put(l4, emp2);
        llamadas.put(l5, emp4);
        llamadas.put(l6, emp3);
        SistemaLlamada sys = new SistemaLlamada(llamadas);
        System.out.println(sys.timeLlamadaExterior(emp1));
        System.out.println(sys.timeLlamadaExterior(emp2));
        System.out.println(sys.timeLlamadaExterior(emp3));
        System.out.println(sys.timeLlamadaExterior(emp4));
        sys.ranking();
    }
}
