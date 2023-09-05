package sistemaSensor;

import java.util.ArrayList;

public class SensorComplejo {
    private ArrayList<Alarma> alarmas;
    private float umbral;

    public SensorComplejo(ArrayList<Alarma> alarmas, float umbral) {
        this.alarmas = alarmas;
        this.umbral = umbral;
    }

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
    public void alarmaNoExiste(int nro) throws ExcepcionAlarma{
        if (nro<0 || nro>alarmas.size()-1){
            throw new ExcepcionAlarma("la alarma no esta entre las almacenadas");
        }
    }
    public static void main(String[] args) {
        int nro = 0;
        SensorComplejo sensorComplejo = new SensorComplejo(new ArrayList<Alarma>(), 0);
        sensorComplejo.alarmas.add(new SensorPresion());
        for (Alarma a: sensorComplejo.alarmas){
            try {
                sensorComplejo.alarmaNoExiste(nro);
                if (a.getNroAlarma() == nro) {
                    System.out.println(a.toString());
                }
            }catch (ExcepcionAlarma e){
                System.out.println(e.getMessage());
            }
        }
    }
}
