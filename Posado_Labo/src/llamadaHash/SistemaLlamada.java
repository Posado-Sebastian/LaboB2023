package llamadaHash;

import empresaYempleado.Empleado;

import java.util.HashMap;

public class SistemaLlamada {
    HashMap<Llamada, Empleado> llamadas;

    public SistemaLlamada(HashMap<Llamada, Empleado> llamadas) {
        this.llamadas = llamadas;
    }

    public HashMap<Llamada, Empleado> getLlamadas() {
        return llamadas;
    }

    public void setLlamadas(HashMap<Llamada, Empleado> llamadas) {
        this.llamadas = llamadas;
    }
    public void llamadasRealizadas(Empleado empleadoListado){
        if(!llamadas.isEmpty()){
            for(Llamada llamada : llamadas.keySet()){
                if(llamadas.get(llamada)==empleadoListado){
                    llamada.toString();
                }
            }
        }
    }
    public int timeLlamadaExterior(Empleado empleado){
        int tiempo=0;
        for (Llamada llamada: llamadas.keySet()){
            if(empleado.equals(llamada.getOrigen()) && llamada.getOrigen().getPais() != llamada.getDestino().getPais() ){
                tiempo+= llamada.getDuracion();
            }
        }
        return tiempo;
    }
    public void ranking(){
        Empleado n1 = new Empleado();
        int duracion1=0;
        Empleado n2 = new Empleado();
        int duracion2=0;
        Empleado n3 = new Empleado();
        int duracion3=0;
        /*for (Empleado empleado: empleados.){
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
            }else if(duracion2<timeLlamadaExterior(empleado)){
                duracion3=timeLlamadaExterior(empleado);
                n3=empleado;
            }
        }*/
        System.out.println("n1: " + n1.getApellido() + " duracion: " + duracion1);
        System.out.println("n2: " + n2.getApellido() + " duracion: " + duracion2);
        System.out.println("n3: " + n3.getApellido() + " duracion: " + duracion3);
    }
}
