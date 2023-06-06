package pedidoPlato;

import pedidoPlato.Pedido;
import pedidoPlato.Persona;
import pedidoPlato.Plato;
import pedidoPlato.Profesor;

import java.util.ArrayList;
import java.util.Date;

public class MenuPedido {
    private ArrayList<Pedido> pedidos;
    private ArrayList<Plato> platos;
    public MenuPedido(){
        this.pedidos=new ArrayList<Pedido>();
        this.platos=new ArrayList<Plato>();
    }
    public MenuPedido(ArrayList<Pedido> pedidos, ArrayList<Plato> platos){
        this.pedidos=pedidos;
        this.platos=platos;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public ArrayList<Plato> getPlatos() {
        return platos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public void setPlatos(ArrayList<Plato> platos) {
        this.platos = platos;
    }
    public void agregarPlato(String nombre, int precio){
        platos.add(new Plato(nombre,precio,0));
    }
    public void eliminarPlato(String nombre){
        for (int i=0; i<platos.size(); i++) {
            if(platos.get(i).getNombre()==nombre){
                for(int j=0; j<pedidos.size(); j++){
                    if(pedidos.get(j).getPlato().getNombre()==nombre){
                        pedidos.get(j).setPlato(new Plato());
                    }
                }
                platos.remove(i);
            }
        }
    }
    public void modificarPlato(String nombre, String nuevoNombre, int nuevoPrecio){
        for (int i=0; i<platos.size(); i++) {
            if(platos.get(i).getNombre()==nombre){
                platos.get(i).setNombre(nuevoNombre);
                platos.get(i).setPrecio(nuevoPrecio);
                for(int j=0; j<pedidos.size(); j++){
                    if(pedidos.get(j).getPlato().getNombre()==nombre){
                        pedidos.get(j).setPlato(new Plato(nuevoNombre,nuevoPrecio,0));
                    }
                }
            }
        }
    }
    public void agregarPedido(Plato plato, Persona cliente, Date fechacreacion, Date horaEntrega, Boolean entregado){
        pedidos.add(new Pedido(fechacreacion, plato, entregado, cliente, horaEntrega));
    }
    public void eliminarPedido(Pedido pedido){
        for (int i=0; i<pedidos.size(); i++){
            if(pedidos.get(i).equals(pedido)){
                pedidos.remove(i);
            }
        }
    }
    public void modificarPedido(Pedido pedidoViejo, Pedido pedidoModificado) {
        for(int i=0; i< pedidos.size(); i++){
            if(pedidos.get(i).equals(pedidoViejo)){
                pedidos.set(i, pedidoModificado);
            }
        }
    }
    public void platosHoy(){
        Date hoy = new Date();
        for(int i=0; i<pedidos.size(); i++){
            if(pedidos.get(i).getHoraEntrega().getDay()==hoy.getDay() && pedidos.get(i).getHoraEntrega().getMonth()==hoy.getMonth()){
                double precio=pedidos.get(i).getPlato().getPrecio();
                if(pedidos.get(i).getCliente() instanceof Profesor){
                    precio=(precio*100)/((Profesor) pedidos.get(i).getCliente()).getPorcentajeDescuento();
                }
                System.out.println("plato.Pedido: " + platos.get(i).getNombre() + " Precio: " + precio);
            }
        }
    }
}
