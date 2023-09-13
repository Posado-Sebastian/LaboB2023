package bebidas;

import pedidoPlato.Persona;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Bebedor extends Persona {
    private HashMap<Bebida, Integer> bebidas;
    private int dni;

    public Bebedor(String nombre, HashMap<Bebida, Integer> bebidas, int dni) {
        super(nombre);
        this.bebidas = bebidas;
        this.dni = dni;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public HashMap<Bebida, Integer> getBebidas() {
        return bebidas;
    }

    public void setBebidas(HashMap<Bebida, Integer> bebidas) {
        this.bebidas = bebidas;
    }
    public int calcularCoef(){
        int coef=0;
        for (Map.Entry<Bebida,Integer> aux:bebidas.entrySet()){
            coef=aux.getValue()*(aux.getKey().coficientePositividad()-aux.getKey().coficientePositividad());
        }
        return coef;
    }
    public void agregarBebida(Bebida bebida){
        bebidas.replace(bebida,bebidas.get(bebida),bebidas.get(bebida)+1);
    }
}
