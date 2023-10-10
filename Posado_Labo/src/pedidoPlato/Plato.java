package pedidoPlato;

import restaurante.Chef;
import restaurante.TipoPlato;

public class Plato {
    private String nombre;
    private String descripcion;
    private TipoPlato tipo;
    private int precio;
    private int calorias;
    private Chef chef;
    public Plato(){
        this.nombre="";
        this.precio=0;
        this.descripcion = "";
        this.tipo = null;
        this.chef = new Chef();
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

    public Plato(String nombre, String descripcion, TipoPlato tipo, int precio, int calorias, Chef chef) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.precio = precio;
        this.calorias = calorias;
        this.chef = chef;
    }

    public Plato(String nombre, String descripcion, TipoPlato tipo, Chef chef) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.chef = chef;
    }


    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public TipoPlato getTipo() {
        return tipo;
    }

    public void setTipo(TipoPlato tipo) {
        this.tipo = tipo;
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

    public Chef getChef() {
        return chef;
    }

    public void setChef(Chef chef) {
        this.chef = chef;
    }

    public void mostrarPlato(){
        System.out.println("Nombre: " + nombre + "\n" + "Precio: " + precio + "$");
    }
}
