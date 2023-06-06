package pedidoPlato;

public class Plato {
    private String nombre;
    private int precio;
    private int calorias;
    public Plato(){
        this.nombre="";
        this.precio=0;
    }
    public Plato(String nombre, int calorias){
        this.nombre=nombre;
        this.calorias=calorias;
    }
    public Plato(String nombre, int precio, int calorias){
        this.nombre=nombre;
        this.precio=precio;
        this.calorias=calorias;
    }

    public int getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public void mostrarPlato(){
        System.out.println("Nombre: " + nombre + "\n" + "Precio: " + precio + "$");
    }
}
