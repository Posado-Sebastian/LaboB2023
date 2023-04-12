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
        System.out.println("El porcentaje de autos descapotados es: " + (descapotados+100)/cantidadAutos() + " %");
    }
    public void aniadirCarga(){
        for(int i = 0; i< vehiculos.size(); i++){
            if(vehiculos.get(i) instanceof Camioneta){
                System.out.println("camioneta id: "+i);
                ((Camioneta) vehiculos.get(i)).mostrarCamioneta();
            }
        }
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese el id de camioneta a agregar carga");
        int numero = Integer.parseInt(entrada.nextLine());
        System.out.println("ingrese el peso de la carga a agregar");
        int peso = Integer.parseInt(entrada.nextLine());
        if(vehiculos.get(numero) instanceof Camioneta){
            int peso2= ((Camioneta) vehiculos.get(numero)).getCarga();
            if(peso2+peso<=((Camioneta) vehiculos.get(numero)).getCargaMaxima()){
                ((Camioneta) vehiculos.get(numero)).setCarga(peso+peso2);
                System.out.println("la carga fue agregada de forma exitosa");
            }else{
            System.out.println("la camioneta no puede soportar mas carga");
            }
        }
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
