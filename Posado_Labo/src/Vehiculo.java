public class Vehiculo {
    private String marca;
    private String modelo;
    private Color color;
    private int velocidad;
    private int cantidadRuedas;
    private Fecha anioProduccion;
    public Vehiculo(){
        this.marca="n/a";
        this.modelo="n/a";
        this.color=null;
        this.velocidad=0;
        this.cantidadRuedas=4;
        this.anioProduccion=new Fecha();
    }
    public Vehiculo(String marca, String modelo, Color color, int velocidad, int cantidadRuedas, Fecha anioProduccion){
        this.marca=marca;
        this.modelo=modelo;
        this.color=color;
        this.velocidad=velocidad;
        this.cantidadRuedas=cantidadRuedas;
        this.anioProduccion=anioProduccion;
    }

    public void setAnioProduccion(Fecha anioProduccion) {
        this.anioProduccion = anioProduccion;
    }

    public Fecha getAnioProduccion() {
        return anioProduccion;
    }

    public void setCantidadRuedas(int cantidadRuedas) {
        this.cantidadRuedas = cantidadRuedas;
    }

    public int getCantidadRuedas() {
        return cantidadRuedas;
    }
    public Color getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getVelocidad() { return velocidad; }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setVelocidad(int velocidad) { this.velocidad = velocidad; }

    public int acelerar(int velocidad){
        velocidad = velocidad + 2;
        return velocidad;
    }
    public int frenar(int velocidad){
        velocidad = 0;
        return velocidad;
    }
    public void mostrarVelocidad(){
        System.out.println("la velocidad del auto es: " + velocidad);
    }
}
