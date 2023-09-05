package sistemaSensor;

public class DetectorTemperatura extends Alarma {
    public DetectorTemperatura(int nroAlarma, Boolean estado, float medida, float umbral, int anio) {
        super(nroAlarma, estado, medida, umbral, anio);
    }

    @Override
    public void alarma() {
        System.out.println("¡Cuidado! La temperatura sube");
    }
}
