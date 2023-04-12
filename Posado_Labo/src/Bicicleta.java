public class Bicicleta extends Vehiculo {
    public Bicicleta(){
        super();
    }
    public Bicicleta(String marca, String modelo, String color, int velocidad, int cantidadRuedas, Fecha anioProduccion){
        super(marca, modelo, color, velocidad, cantidadRuedas, anioProduccion);
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
    public String getModelo() {
        return super.getModelo();
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
    public void setAnioProduccion(Fecha anioProduccion) {
        super.setAnioProduccion(anioProduccion);
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
}
