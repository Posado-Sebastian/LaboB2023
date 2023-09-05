package sistemaSensor;

public abstract class Alarma {
    private  int nroAlarma;
    private Boolean estado;
    private float medida;
    private float umbral;
    private int anio;

    public Alarma(int nroAlarma, Boolean estado, float medida, float umbral, int anio) {
        this.nroAlarma = nroAlarma;
        this.estado = estado;
        this.medida = medida;
        this.umbral = umbral;
        this.anio = anio;
    }public Alarma() {
        this.nroAlarma = 0;
        this.estado = false;
        this.medida = 0;
        this.umbral = 0;
        this.anio = 0;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public float getMedida() {
        return medida;
    }

    public void setMedida(float medida) {
        this.medida = medida;
    }

    public float getUmbral() {
        return umbral;
    }

    public void setUmbral(float umbral) {
        this.umbral = umbral;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getNroAlarma() {
        return nroAlarma;
    }

    public void setNroAlarma(int nroAlarma) {
        this.nroAlarma = nroAlarma;
    }

    public abstract void alarma();

    public static void main(String[] args) {

    }
}
