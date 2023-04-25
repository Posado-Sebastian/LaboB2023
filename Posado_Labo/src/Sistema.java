import java.util.ArrayList;

public class Sistema {
    private ArrayList<Componente> componentes;
    private ArrayList<PedidoComputadora> compra;

    public Sistema(ArrayList<Componente> componentes, ArrayList<PedidoComputadora> compra) {
        this.componentes = componentes;
        this.compra = compra;
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
}
