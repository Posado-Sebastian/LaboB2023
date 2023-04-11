import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Camioneta camioneta1 = new Camioneta("jose", "modelo1", "rojo", 0, 4, new Fecha(), "DDD-111", 2, 6);
        Auto auto1 = new Auto("jose", "modelo1", "rojo", 0, 4, new Fecha(), true, "AAA-222");
        Auto auto2 = new Auto("jose", "modelo1", "rojo", 0, 4, new Fecha(), false, "AAA-222");
        ArrayList<Coche> vehiculos = new ArrayList<Coche>();
        vehiculos.add(camioneta1);
        vehiculos.add(auto1);
        vehiculos.add(auto2);
        EmpresaVehiculo empresa1 = new EmpresaVehiculo(vehiculos);
        empresa1.cantidadAutos();
        empresa1.cantidadDescapotables();
        empresa1.aniadirCarga();
    }
}