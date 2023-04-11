import java.util.ArrayList;
import java.util.Scanner;

public class EmpresaVehiculo {
    private ArrayList<Coche> coches;
    public EmpresaVehiculo(){
        this.coches=new ArrayList<Coche>();
    }
    public EmpresaVehiculo(ArrayList<Coche> coches){
        this.coches=coches;
    }

    public void setCoches(ArrayList<Coche> coches) {
        this.coches = coches;
    }

    public ArrayList<Coche> getCoches() {
        return coches;
    }
    public int cantidadAutos(){
        int cantidad=0;
        for(int i=0; i<coches.size(); i++){
            if(coches.get(i) instanceof Auto){
                cantidad++;
            }
        }
        return cantidad;
    }
    public void cantidadDescapotables(){
        int descapotados=0;
        for(int i=0; i<coches.size(); i++){
            if(coches.get(i).equals(true) && coches.get(i) instanceof Auto){
                descapotados++;
            }
        }
        System.out.println("El porcentaje de autos descapotados es: " + (descapotados+100)/cantidadAutos() + " %");
    }
    public void aniadirCarga(){
        for(int i=0; i<coches.size(); i++){
            if(coches.get(i) instanceof Camioneta){
                System.out.println("camioneta id: "+i);
                ((Camioneta) coches.get(i)).mostrarCamioneta();
            }
        }
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingrese el id de camioneta a agregar carga");
        int numero = Integer.parseInt(entrada.nextLine());
        System.out.println("ingrese el peso de la carga a agregar");
        int peso = Integer.parseInt(entrada.nextLine());
        if(coches.get(numero) instanceof Camioneta){
            int peso2= ((Camioneta) coches.get(numero)).getCarga();
            if(peso2+peso<=((Camioneta) coches.get(numero)).getCargaMaxima()){
                ((Camioneta) coches.get(numero)).setCarga(peso+peso2);
                System.out.println("la carga fue agregada de forma exitosa");
            }else{
            System.out.println("la camioneta no puede soportar mas carga");
            }
        }
    }
}
