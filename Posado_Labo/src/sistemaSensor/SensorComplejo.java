package sistemaSensor;

import java.util.ArrayList;

public class SensorComplejo {
    private ArrayList<Alarma> alarmas;
    private float umbral;

    public ArrayList<Alarma> getAlarmas() {
        return alarmas;
    }

    public void setAlarmas(ArrayList<Alarma> alarmas) {
        this.alarmas = alarmas;
    }

    public float getUmbral() {
        return umbral;
    }

    public void setUmbral(float umbral) {
        this.umbral = umbral;
    }

    public SensorComplejo(ArrayList<Alarma> alarmas, float umbral) {
        this.alarmas = alarmas;
        this.umbral = umbral;
    }
    public float calcularPromedio(){
        float promedio=0f;
        for (Alarma alarma : alarmas) {
            promedio=+alarma.getMedida();
        }
        return promedio/alarmas.size();
    }
    public void alarma(){
        System.out.println("los valores medidos superaron el umbral");
    }
    public void activarsensor(){
        if (calcularPromedio()>umbral){
            alarma();
        }
    }
}
