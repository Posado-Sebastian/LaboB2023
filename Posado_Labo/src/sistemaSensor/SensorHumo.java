package sistemaSensor;

public class SensorHumo extends Alarma {
    public SensorHumo(int nroAlarma, Boolean estado, float medida, float umbral, int anio) {
        super(nroAlarma, estado, medida, umbral, anio);
    }

    @Override
    public void alarma() {
        System.out.println("llamando bomberos");

    }
}
