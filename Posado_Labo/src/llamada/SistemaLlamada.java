package llamada;

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
    public void agregarLlamda(Llamada llamada){
        llamadas.add(llamada);
    }

    public void listado(){
        for(EmpleadoLlamada empleadoLlamada: empleados){
            System.out.println("Llamadas hechas por " + empleadoLlamada.getNombre() + " " + empleadoLlamada.getApellido() + ":");
            for (Llamada llamada: llamadas){
                if(empleadoLlamada.equals(llamada.getOrigen())){
                    llamada.mostrarDatos();
                }
            }
            System.out.println();
        }
    }
    public int timeLlamadaExterior(EmpleadoLlamada empleado){
        int tiempo=0;
        for (Llamada llamada: llamadas){
            if(empleado.equals(llamada.getOrigen()) && llamada.getOrigen().getPais() != llamada.getDestino().getPais() ){
                tiempo+= llamada.getDuracion();
            }
        }
        return tiempo;
    }
    public void ranking(){
        EmpleadoLlamada n1 = new EmpleadoLlamada("jose","jose", 1, 2);
        int duracion1=0;
        EmpleadoLlamada n2 = new EmpleadoLlamada("jose","jose", 1, 2);
        int duracion2=0;
        EmpleadoLlamada n3 = new EmpleadoLlamada("jose","jose", 1, 2);
        int duracion3=0;
        for (EmpleadoLlamada empleado: empleados){
            if(duracion1<timeLlamadaExterior(empleado)){
                duracion3=duracion2;
                 n3=n2;
                duracion2=duracion1;
                n2=n1;
                duracion1=timeLlamadaExterior(empleado);
                n1=empleado;
            }else if(duracion2<timeLlamadaExterior(empleado)){
                duracion3=duracion2;
                n3=n2;
                duracion2=timeLlamadaExterior(empleado);
                n2=empleado;
            }else if(duracion3<timeLlamadaExterior(empleado)){
                duracion3=timeLlamadaExterior(empleado);
                n3=empleado;
            }
        }
        System.out.println("n1: " + n1.getApellido() + " duracion: " + duracion1);
        System.out.println("n2: " + n2.getApellido() + " duracion: " + duracion2);
        System.out.println("n3: " + n3.getApellido() + " duracion: " + duracion3);
    }
}
