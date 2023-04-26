import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        EmpleadoLlamada emp1 = new EmpleadoLlamada(1, 1, "jose", "jose", "peru", 2015, 1);
        EmpleadoLlamada emp2 = new EmpleadoLlamada(1, 1, "martin", "martin", "china", 2015, 1);
        EmpleadoLlamada emp3 = new EmpleadoLlamada(1, 1, "rafa", "rafa", "china", 2015, 1);
        EmpleadoLlamada emp4 = new EmpleadoLlamada(1, 1, "carlos", "carlos", "iran", 2015, 1);
        Llamada l1 = new Llamada(emp2, emp3, new Date(), 2);
        Llamada l2 = new Llamada(emp1, emp4, new Date(), 5);
        Llamada l3 = new Llamada(emp1, emp3, new Date(), 7);
        Llamada l4 = new Llamada(emp2, emp4, new Date(), 2);
        Llamada l5 = new Llamada(emp4, emp1, new Date(), 1);
        Llamada l6 = new Llamada(emp3, emp1, new Date(), 6);
        ArrayList<Llamada> llamadas = new ArrayList<Llamada>();
        llamadas.add(l1);
        llamadas.add(l2);
        llamadas.add(l3);
        llamadas.add(l4);
        llamadas.add(l5);
        llamadas.add(l6);
        ArrayList<EmpleadoLlamada> empleados =new ArrayList<EmpleadoLlamada>();
        empleados.add(emp1);
        empleados.add(emp2);
        empleados.add(emp3);
        empleados.add(emp4);
        SistemaLlamada sistema = new SistemaLlamada(llamadas,empleados);
        sistema.listado();
        sistema.ranking();
    }
}