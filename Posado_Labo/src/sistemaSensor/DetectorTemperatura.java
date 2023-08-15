package sistemaSensor;

public class DetectorTemperatura extends Alarma {
    public DetectorTemperatura() {
    }

    @Override
    public void alarma() {
        System.out.println("¡Cuidado! La temperatura sube");
    }
}
