public class Auto extends Vehiculo {
    private Boolean descapotado;
    private String patente;
    public Auto(){
        super();
        this.descapotado=false;
        this.patente="AAA-111";
    }
    public Auto(String marca, String modelo, String color, int velocidad, int cantidadRuedas, Fecha anioProduccion, Boolean descapotado, String patente){
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

    @Override
    public Fecha getAnioProduccion() {
        return super.getAnioProduccion();
    }

    @Override
    public int getCantidadRuedas() {
        return super.getCantidadRuedas();
    }

    @Override
    public int getVelocidad() {
        return super.getVelocidad();
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public String getMarca() {
        return super.getMarca();
    }

    @Override
    public String getModelo() {
        return super.getModelo();
    }

    public Boolean getDescapotado() {
        return descapotado;
    }

    @Override
    public void setAnioProduccion(Fecha anioProduccion) {
        super.setAnioProduccion(anioProduccion);
    }

    @Override
    public void setCantidadRuedas(int cantidadRuedas) {
        super.setCantidadRuedas(cantidadRuedas);
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public void setMarca(String marca) {
        super.setMarca(marca);
    }

    @Override
    public void setModelo(String modelo) {
        super.setModelo(modelo);
    }

    @Override
    public void setVelocidad(int velocidad) {
        super.setVelocidad(velocidad);
    }

    public void setDescapotado(Boolean descapotado) {
        this.descapotado = descapotado;
    }
}
