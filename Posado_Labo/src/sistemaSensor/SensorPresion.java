package sistemaSensor;

public class SensorPresion extends Alarma {
    public SensorPresion(int nroAlarma, Boolean estado, float medida, float umbral, int anio) {
        super(nroAlarma, estado, medida, umbral, anio);
    }public SensorPresion() {
        super();
    }

    @Override
    public void alarma() {
        System.out.println("Sensor de presión activado");
    }
}
