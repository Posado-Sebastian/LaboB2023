package sistemaSensor;

public class SensorHumo extends Alarma {
    public SensorHumo() {
    }

    @Override
    public void alarma() {
        System.out.println("llamando bomberos");

    }
}
