package sistemaSensor;

public class SensorPresion extends Alarma {
    public SensorPresion() {
    }

    @Override
    public void alarma() {
        System.out.println("Sensor de presión activado");
    }
}
