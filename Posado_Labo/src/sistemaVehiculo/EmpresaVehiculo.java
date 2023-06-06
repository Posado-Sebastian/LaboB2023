package sistemaVehiculo;

import java.util.ArrayList;
import java.util.Scanner;

public class EmpresaVehiculo {
    private ArrayList<Vehiculo> vehiculos;
    public EmpresaVehiculo(){
        this.vehiculos =new ArrayList<Vehiculo>();
    }
    public EmpresaVehiculo(ArrayList<Vehiculo> vehiculos){
        this.vehiculos = vehiculos;
    }

    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }
    public int cantidadAutos(){
        int cantidad=0;
        for(int i = 0; i< vehiculos.size(); i++){
            if(vehiculos.get(i) instanceof Auto){
                cantidad++;
            }
        }
        return cantidad;
    }
    public void cantidadDescapotables(){
        int descapotados=0;
        for(int i = 0; i< vehiculos.size(); i++){
            if(vehiculos.get(i).equals(true) && vehiculos.get(i) instanceof Auto){
                descapotados++;
            }
        }
        System.out.println("El porcentaje de autos descapotados es: " + (descapotados*100)/cantidadAutos() + " %");
    }
    public void mayorCantidadVehiculos(){
        int contadorCamionetas=0;
        int contadorAutos=0;
        for(int i=0; i<vehiculos.size(); i++){
            if(vehiculos.get(i) instanceof Auto){
                contadorAutos++;
            }else{
                contadorCamionetas++;
            }
        }
        if(contadorAutos>contadorCamionetas){
            System.out.println("hay mas autos q camionetas");
        }else{
            System.out.println("hay mas camionetas que autos");
        }
    }
}
