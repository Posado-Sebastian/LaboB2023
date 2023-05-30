package cosasPersona;

import java.util.HashMap;
import java.util.HashSet;

public class SistemaCaloria {
    HashMap<Personaa, PlatosComido> familia;
    public Float cantCalorias(Personaa persona1){
        Float cant = 0f;
        PlatosComido platosComidos = new PlatosComido();
        if (!familia.isEmpty()){
            for(Personaa personaa : familia.keySet()){
                if (personaa==persona1){
                    platosComidos=familia.get(personaa);
                    for(PlatoCaloria platoCaloria : platosComidos.getPlatoCalorias()){
                        cant = platoCaloria.getCaloria() + cant;
                    }
                }
            }
        }
        return cant;
    }
    public void caloriasFamilia(){
        Float caloria = 0f;
        int cant = 0;
        PlatosComido platosComidos = new PlatosComido();
        if(!familia.isEmpty()){
            for(Personaa personaa : familia.keySet()){
                platosComidos=familia.get(personaa);
                for(PlatoCaloria platoCaloria : platosComidos.getPlatoCalorias()){
                    caloria = platoCaloria.getCaloria() + caloria;
                }
                cant++;
            }
        }
        System.out.println("El promedio es " + caloria/cant*100);
    }
    public void masCalorias(){
        Float caloria = 0f;
        PlatosComido platosComidos = new PlatosComido();
        Personaa persona = new Personaa();
        Float masCaloria = 0f;
        if(!familia.isEmpty()){
            for (Personaa personaa : familia.keySet()){
                platosComidos=familia.get(personaa);
                for(PlatoCaloria platoCaloria : platosComidos.getPlatoCalorias()){
                    caloria = platoCaloria.getCaloria() + caloria;
                }
                if(masCaloria<caloria){
                    persona=personaa;
                    masCaloria=caloria;
                }
            }
            System.out.println("La persona con mas calorias de la familia es: " + persona.toString());
        }
    }
    public void menosCalorias(){
        Float caloria = 0f;
        PlatosComido platosComidos = new PlatosComido();
        Personaa persona = new Personaa();
        Float masCaloria = 0f;
        if(!familia.isEmpty()){
            for (Personaa personaa : familia.keySet()){
                platosComidos=familia.get(personaa);
                for(PlatoCaloria platoCaloria : platosComidos.getPlatoCalorias()){
                    caloria = platoCaloria.getCaloria() + caloria;
                }
                if(masCaloria>caloria){
                    persona=personaa;
                    masCaloria=caloria;
                }
            }
            System.out.println("La persona con menos calorias de la familia es: " + persona.toString());
        }
    }
}
