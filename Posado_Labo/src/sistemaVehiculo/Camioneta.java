package sistemaVehiculo;

import sistemaVehiculo.Vehiculo;

import java.util.Scanner;

public class Camioneta extends Vehiculo {
    private String patente;
    private int cargaMaxima;
    private int carga;
    public Camioneta(){
        super();
        this.patente="AAA-111";
        this.carga=0;
        this.cargaMaxima=0;
    }
    public Camioneta(String marca, String modelo, Color color, int velocidad, int cantidadRuedas, Fecha anioProduccion, String patente, int carga, int cargaMaxima){
        super(marca, modelo, color, velocidad, cantidadRuedas, anioProduccion);
        this.patente=patente;
        this.carga=carga;
        this.cargaMaxima=cargaMaxima;
    }
    public void setCargaMaxima(int cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }
    public int getCargaMaxima() {
        return cargaMaxima;
    }
    public void setCarga(int carga) {
        this.carga = carga;
    }
    public int getCarga() {
        return carga;
    }
    public void mostrarCamioneta(){
        System.out.println("Patente: " + patente + "\n" + "Carga actual: " + carga + "\n" + "Carga maxima: " + cargaMaxima);
    }
    public void aniadirCarga(){
        Scanner entrada = new Scanner(System.in);
        int numero = Integer.parseInt(entrada.nextLine());
        System.out.println("ingrese el peso de la carga a agregar");
        int peso = Integer.parseInt(entrada.nextLine());
        int peso2= carga;
        if(peso2+peso<=cargaMaxima){
            carga=(peso+peso2);
            System.out.println("la carga fue agregada de forma exitosa");
        }else{
            System.out.println("la camioneta no puede soportar mas carga");
        }
    }
}
