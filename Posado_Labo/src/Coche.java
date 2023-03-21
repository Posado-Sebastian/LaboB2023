public class Coche {
    private String marca;
    private String modelo;
    private String color;
    private int velocidad;
    public Coche(){
        this.marca="n/a";
        this.modelo="n/a";
        this.color="n/a";
        this.velocidad=0;
    }
    public Coche(String marca, String modelo, String color, int velocidad){
        this.marca=marca;
        this.modelo=modelo;
        this.color=color;
        this.velocidad=velocidad;
    }
    public String getColor() {
        return color;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getVelocidad() { return velocidad; }

    public void setColor(String color) {
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
