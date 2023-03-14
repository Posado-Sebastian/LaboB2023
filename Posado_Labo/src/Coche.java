public class Coche {
    String marca;
    String modelo;
    String color;
    public Coche(){
        this.marca="n/a";
        this.modelo="n/a";
        this.color="n/a";
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

    public void setColor(String color) {
        this.color = color;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
