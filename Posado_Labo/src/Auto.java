public class Auto extends Vehiculo {
    private Boolean descapotado;
    private String patente;
    public Auto(){
        super();
        this.descapotado=false;
        this.patente="AAA-111";
    }
    public Auto(String marca, String modelo, Color color, int velocidad, int cantidadRuedas, Fecha anioProduccion, Boolean descapotado, String patente){
        super(marca, modelo, color, velocidad, cantidadRuedas, anioProduccion);
        this.descapotado=descapotado;
        this.patente=patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getPatente() {
        return patente;
    }

    public Boolean getDescapotado() {
        return descapotado;
    }

    public void setDescapotado(Boolean descapotado) {
        this.descapotado = descapotado;
    }
}
