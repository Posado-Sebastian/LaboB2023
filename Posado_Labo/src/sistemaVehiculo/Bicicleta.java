package sistemaVehiculo;

import sistemaVehiculo.Vehiculo;

public class Bicicleta extends Vehiculo {
    public Bicicleta(){
        super();
    }
    public Bicicleta(String marca, String modelo, Color color, int velocidad, int cantidadRuedas, Fecha anioProduccion){
        super(marca, modelo, color, velocidad, cantidadRuedas, anioProduccion);
    }
}
