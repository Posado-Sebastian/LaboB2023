package computadora;

import java.util.ArrayList;

public class Sistema {
    private ArrayList<Componente> componentes;
    private ArrayList<PedidoComputadora> compra;

    public Sistema(ArrayList<Componente> componentes, ArrayList<PedidoComputadora> compra) {
        this.componentes = componentes;
        this.compra = compra;
    }public Sistema() {
        this.componentes = new ArrayList<Componente>();
        this.compra = new ArrayList<PedidoComputadora>();
    }

    public ArrayList<Componente> getComponentes() {
        return componentes;
    }

    public void setComponentes(ArrayList<Componente> componentes) {
        this.componentes = componentes;
    }

    public ArrayList<PedidoComputadora> getCompra() {
        return compra;
    }

    public void setCompra(ArrayList<PedidoComputadora> compra) {
        this.compra = compra;
    }
    public void agregarCompra(PedidoComputadora pedido){
        Boolean verificar=true; //boolean para ver si el stock es suficiente
        if(pedido.componentesMinimos().equals(true)){
            for (Componente componente : pedido.getComponentes()) {
                if(componente.getStock()<=0){
                    verificar=false;
                }
            }
        }
        if(verificar.equals(true)){
            compra.add(pedido);
        }else{
            System.out.println("no hay stock suficiente");
        }
    }
    public void stock(PedidoComputadora pedido) throws ExcepcionCompu{
        for (Componente c : pedido.getComponentes()){
            if (c.getStock() == 0){
                throw new ExcepcionCompu("no hay stock de " + c.getNombre());
            }
        }
    }
    public void compraCompleta(PedidoComputadora pedido) throws  ExcepcionCompu{
        for (Componente c : pedido.getComponentes()){
            if (!pedido.componentesMinimos()){
                throw new ExcepcionCompu("no estan los componentes minimos");
            }
        }
    }

    public static void main(String[] args) {
        PedidoComputadora pedido = new PedidoComputadora();
        Sistema sistema = new Sistema();
        pedido.getComponentes().add(0, new Cpu());
        pedido.getComponentes().add(0, new Cpu());
        pedido.getComponentes().add(0, new Cpu());
        try {
            sistema.compraCompleta(pedido);
            sistema.stock(pedido);
        }catch (ExcepcionCompu e){
            System.out.println(e.getMessage());
        }
    }
}
