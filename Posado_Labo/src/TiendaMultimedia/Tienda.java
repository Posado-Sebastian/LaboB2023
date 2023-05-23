package TiendaMultimedia;

import java.util.ArrayList;

public class Tienda {
    private ArrayList<Producto> productos;

    public Tienda(ArrayList<Producto> productos) {
        this.productos = productos;
    }
    public Tienda(){
        this.productos=new ArrayList<Producto>();
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }
    public void agregarProducto(Producto producto){
        productos.add(producto);
    }
    public void eliminarProducto(Producto producto){
        for (int i=0; i<productos.size(); i++){
            if(producto.equals(productos.get(i))){
                productos.remove(i);
            }
        }
    }
    public void modificarProducto(Producto productoNuevo, Producto productoEliminar){
        for (int i=0; i<productos.size(); i++){
            if(productoEliminar.equals(productos.get(i))){
                productos.set(i, productoNuevo);
            }
        }
    }
    public void calcularStock(){
        Producto productoMayor=null;
        Producto productoMenor=null;
        for (Producto producto:productos){
            if (productoMayor.equals(null)){
                productoMayor=producto;
            } else if (producto.getStock()>productoMayor.getStock()) {
                productoMayor=producto;
            }
            if (productoMenor.equals(null)){
                productoMenor=producto;
            } else if (producto.getStock()>productoMenor.getStock()) {
                productoMenor=producto;
            }
        }
        System.out.println("Mayor: " + productoMayor.toString());
        System.out.println("Menor: " + productoMenor.toString());
    }
}

