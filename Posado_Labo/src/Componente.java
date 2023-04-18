public class Componente {
    private String marca;
    private double precio;
    private String nombre;

    public Componente(){
        this.marca="";
        this.precio=0;
        this.nombre="";
    }
    public Componente(String marca, double precio, String nombre){
        this.marca=marca;
        this.precio=precio;
        this.nombre=nombre;
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
}
