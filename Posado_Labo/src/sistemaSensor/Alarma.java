package sistemaSensor;

public abstract class Alarma {
    private Boolean estado;
    private float medida;
    private float umbral;
    private int anio;

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
    public abstract void alarma();
}
