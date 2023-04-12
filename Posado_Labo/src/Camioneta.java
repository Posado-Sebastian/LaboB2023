public class Camioneta extends Vehiculo {
    private String patente;
    private int cargaMaxima;
    private int carga;
    public Camioneta(){
        super();
        this.patente="AAA-111";
        this.carga=0;
        this.cargaMaxima=0;
    }
    public Camioneta(String marca, String modelo, String color, int velocidad, int cantidadRuedas, Fecha anioProduccion, String patente, int carga, int cargaMaxima){
        super(marca, modelo, color, velocidad, cantidadRuedas, anioProduccion);
        this.patente=patente;
        this.carga=carga;
        this.cargaMaxima=cargaMaxima;
    }

    public void setCargaMaxima(int cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public int getCargaMaxima() {
        return cargaMaxima;
    }

    @Override
    public void setCantidadRuedas(int cantidadRuedas) {
        super.setCantidadRuedas(cantidadRuedas);
    }

    @Override
    public void setVelocidad(int velocidad) {
        super.setVelocidad(velocidad);
    }

    @Override
    public void setAnioProduccion(Fecha anioProduccion) {
        super.setAnioProduccion(anioProduccion);
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    @Override
    public void setModelo(String modelo) {
        super.setModelo(modelo);
    }

    @Override
    public void setMarca(String marca) {
        super.setMarca(marca);
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public int getCantidadRuedas() {
        return super.getCantidadRuedas();
    }

    @Override
    public Fecha getAnioProduccion() {
        return super.getAnioProduccion();
    }

    @Override
    public String getModelo() {
        return super.getModelo();
    }

    public String getPatente() {
        return patente;
    }

    @Override
    public int getVelocidad() {
        return super.getVelocidad();
    }

    @Override
    public String getMarca() {
        return super.getMarca();
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    public int getCarga() {
        return carga;
    }
    public void mostrarCamioneta(){
        System.out.println("Patente: " + patente + "\n" + "Carga actual: " + carga + "\n" + "Carga maxima: " + cargaMaxima);
    }
}
