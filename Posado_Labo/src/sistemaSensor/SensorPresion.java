package sistemaSensor;

public class SensorPresion extends Alarma {
    public SensorPresion(Boolean estado, float medida, float umbral, int anio) {
        super(estado, medida, umbral, anio);
    }
    @Override
    public void alarma() {
        System.out.println("Sensor de presión activado");
    }
}
