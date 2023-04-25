public class DetectorTemperatura extends Alarma{
    public DetectorTemperatura(Boolean estado, float medida, float umbral, int anio) {
        super(estado, medida, umbral, anio);
    }

    @Override
    public void alarma() {
        System.out.println("¡Cuidado! La temperatura sube");
    }
}
