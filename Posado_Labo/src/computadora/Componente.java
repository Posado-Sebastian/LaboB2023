package computadora;

public abstract class Componente {
    private String marca;
    private double precio;
    private String nombre;
    private int stock;

    public Componente(String marca, double precio, String nombre, int stock) {
        this.marca = marca;
        this.precio = precio;
        this.nombre = nombre;
        this.stock = stock;
    }

    public Componente() {
        this.marca = "";
        this.precio = 0;
        this.nombre = "";
        this.stock = 0;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double precioStock(){
        double precioActualizado=0;
        if(stock<10 && stock>5){
            precioActualizado=precio+precio/4;
        }else if(stock<5){
            precioActualizado=precio+precio/2;
        }
        return precioActualizado;
    }
}
