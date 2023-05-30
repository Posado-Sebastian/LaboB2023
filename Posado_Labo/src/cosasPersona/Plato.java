package cosasPersona;

public class Plato {
    private String nombre;
    private int precio;
    public Plato(){
        this.nombre="";
        this.precio=0;
    }
    public Plato(String nombre, int precio){
        this.nombre=nombre;
        this.precio=precio;
    }

    public int getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
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
