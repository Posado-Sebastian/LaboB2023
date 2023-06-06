package familiaCaloria;

import java.util.HashSet;

public class SistemaCaloria {
    private HashSet<Familiar> familia;

    public SistemaCaloria(HashSet<Familiar> familia) {
        this.familia = familia;
    }

    public HashSet<Familiar> getFamilia() {
        return familia;
    }

    public void setFamilia(HashSet<Familiar> familia) {
        this.familia = familia;
    }
    public void promedioCalorias(){
        int calorias=0;
        for (Familiar familiar : familia){
            calorias=familiar.caloriasTotales()+calorias;
        }
        System.out.println("Promedio de calorias de la familia es: " + calorias/familia.size());
    }
    public void masCalorias(){
        int calorias=0;
        Familiar familiar1=null;
        for (Familiar familiar : familia){
            if(familiar.caloriasTotales()>calorias){
                calorias=familiar.caloriasTotales();
                familiar1=familiar;
            }
        }
        System.out.println("El familiar con mas calorias es: " + familiar1.getNombre());
    }
    public void menosCalorias(){
        int calorias=0;
        Familiar familiar1=null;
        for (Familiar familiar : familia){
            if(familiar1==null){
                familiar1=familiar;
            }
            if(familiar.caloriasTotales()<calorias){
                calorias=familiar.caloriasTotales();
                familiar1=familiar;
            }
        }
        System.out.println("El familiar con menos calorias es: " + familiar1.getNombre());
    }
}
