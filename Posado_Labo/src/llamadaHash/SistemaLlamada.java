package llamadaHash;

import empresaYempleado.Empleado;
import llamada.Llamada;

import java.util.HashMap;
import java.util.Map;

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
                    System.out.println(llamada.toString());
                }
            }
        }
    }
    public int timeLlamadaExterior(Empleado empleado){
        int tiempo=0;
        for (Llamada llamada: llamadas.keySet()){
            if(llamadas.get(llamada)==empleado) {
                if (empleado.equals(llamada.getOrigen()) && llamada.getOrigen().getPais() != llamada.getDestino().getPais()) {
                    tiempo += llamada.getDuracion();
                }
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
        for(Map.Entry<Llamada,Empleado> p : llamadas.entrySet()){
            if(duracion1==timeLlamadaExterior(p.getValue())){

            }else if(duracion1<timeLlamadaExterior(p.getValue())){
                duracion3=duracion2;
                n3=n2;
                duracion2=duracion1;
                n2=n1;
                duracion1=timeLlamadaExterior(p.getValue());
                n1=p.getValue();
            }else if(duracion2==timeLlamadaExterior(p.getValue())){

            }else if(duracion2<timeLlamadaExterior(p.getValue())){
                duracion3=duracion2;
                n3=n2;
                duracion2=timeLlamadaExterior(p.getValue());
                n2=p.getValue();
            }else if(duracion3==timeLlamadaExterior(p.getValue())){

            }else if(duracion3<timeLlamadaExterior(p.getValue())){
                duracion3=timeLlamadaExterior(p.getValue());
                n3=p.getValue();
            }
        }
        System.out.println("n1: " + n1.getApellido() + " duracion: " + duracion1);
        System.out.println("n2: " + n2.getApellido() + " duracion: " + duracion2);
        System.out.println("n3: " + n3.getApellido() + " duracion: " + duracion3);
    }
}
