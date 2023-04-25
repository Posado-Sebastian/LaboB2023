import java.util.ArrayList;

public class PedidoComputadora {
    private Persona cliente;
    private ArrayList<Componente> componentes;
    private double precioFinal;
    private MetodoPago metodoPago;

    public PedidoComputadora(Persona cliente, ArrayList<Componente> componentes, double precioFinal, MetodoPago metodoPago) {
        this.cliente = cliente;
        this.componentes = componentes;
        this.precioFinal = precioFinal;
        this.metodoPago = metodoPago;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Componente> getComponentes() {
        return componentes;
    }

    public void setComponentes(ArrayList<Componente> componentes) {
        this.componentes = componentes;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }

    public MetodoPago getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(MetodoPago metodoPago) {
        this.metodoPago = metodoPago;
    }
    public void calcularPrecioFinal(){
        for (Componente componente: componentes) {
            precioFinal=precioFinal+componente.precioStock();
        }
        if(metodoPago instanceof Tarjeta){
            precioFinal=precioFinal+precioFinal/20;
        }
    }
    public Boolean componentesMinimos(){
        Boolean verificar=false;
        ArrayList<Boolean> comp = new ArrayList<Boolean>();
        comp.add(false);
        comp.add(false);
        comp.add(false);
        if(componentes.size()>=3) {
            for (Componente componente:componentes) {
                if(componente instanceof Periferico){
                    if(((Periferico) componente).getEntradaSalida().equals(true)){
                        comp.set(0, true);
                    }else{
                        comp.set(1,true);
                    }
                }else if(componente instanceof Cpu){
                    comp.set(2, true);
                }
            }
            if(comp.get(0).equals(true) && comp.get(1).equals(true) && comp.get(2).equals(true)){
                verificar=true;
            }
        }else{
            return verificar;
        }
        return verificar;
    }
}
