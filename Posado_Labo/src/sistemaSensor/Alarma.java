package sistemaSensor;

public class Alarma {
    private Boolean estado;
    private float medida;
    private float umbral;
    private int anio;

    public Alarma(Boolean estado, float medida, float umbral, int anio) {
        this.estado = estado;
        this.medida = medida;
        this.umbral = umbral;
        this.anio = anio;
    }
    public Alarma(){
        this.estado = false;
        this.medida = 1;
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
    public void activarSensor(){
            if(medida> umbral){
                alarma();
            }
    }
    public void alarma(){

    }
}
