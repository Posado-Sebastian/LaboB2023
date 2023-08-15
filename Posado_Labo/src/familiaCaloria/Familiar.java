package familiaCaloria;

import pedidoPlato.Persona;
import pedidoPlato.Plato;

import java.util.ArrayList;

public class Familiar extends Persona {
    private ArrayList<Plato> platos;
    public Familiar(String nombre, ArrayList<Plato> platos) {
        super(nombre);
        this.platos = platos;
    }

    public ArrayList<Plato> getPlatos() {
        return platos;
    }

    public void setPlatos(ArrayList<Plato> platos) {
        this.platos = platos;
    }
    public int caloriasTotales(){
        int calorias=0;
        for (Plato plato : platos){
            calorias=plato.getCalorias()+calorias;
        }
        return calorias;
    }
}
