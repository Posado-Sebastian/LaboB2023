import java.util.ArrayList;

public class SistemaLlamada {
    private ArrayList<Llamada> llamadas;
    private ArrayList<EmpleadoLlamada> empleados;

    public SistemaLlamada(ArrayList<Llamada> llamadas, ArrayList<EmpleadoLlamada> empleados) {
        this.llamadas = llamadas;
        this.empleados = empleados;
    }

    public ArrayList<Llamada> getLlamadas() {
        return llamadas;
    }

    public void setLlamadas(ArrayList<Llamada> llamadas) {
        this.llamadas = llamadas;
    }

    public ArrayList<EmpleadoLlamada> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<EmpleadoLlamada> empleados) {
        this.empleados = empleados;
    }

    public void listado(){
        for(EmpleadoLlamada empleadoLlamada: empleados){
            System.out.println(empleadoLlamada.getNombre() + " " + empleadoLlamada.getApellido());
            for (Llamada llamada: llamadas){
                if(empleadoLlamada.equals(llamada.getOrigen())){
                    llamada.mostrarDatos();
                }
            }
        }
    }
    public void ranking(){

    }
}
