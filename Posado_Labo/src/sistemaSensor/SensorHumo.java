package sistemaSensor;

public class SensorHumo extends Alarma {
    public SensorHumo(Boolean estado, float medida, float umbral, int anio) {
        super(estado, medida, umbral, anio);
    }

    public SensorHumo() {
        super();
    }

    @Override
    public void alarma() {
        System.out.println("llamando bomberos");

    }
}
