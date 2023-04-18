import java.util.Date;

public class Pedido {
    private Date fechaCreacion;
    private Plato plato;
    private Boolean entregado;
    private Persona cliente;
    private Date horaEntrega;
    public Pedido(){
        this.fechaCreacion=new Date();
        this.plato=new Plato();
        this.entregado=false;
        this.cliente=new Persona();
        this.horaEntrega=new Date();
    }
    public Pedido(Date fechaCreacion, Plato plato, Boolean entregado, Persona cliente, Date horaEntrega){
        this.fechaCreacion=fechaCreacion;
        this.plato=plato;
        this.entregado=entregado;
        this.cliente=cliente;
        this.horaEntrega=horaEntrega;
    }

    public Boolean getEntregado() {
        return entregado;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public Date getHoraEntrega() {
        return horaEntrega;
    }
    public Persona getCliente() {
        return cliente;
    }

    public Plato getPlato() {
        return plato;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    public void setEntregado(Boolean entregado) {
        this.entregado = entregado;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public void setHoraEntrega(Date horaEntrega) {
        this.horaEntrega = horaEntrega;
    }

    public void setPlato(Plato plato) {
        this.plato = plato;
    }

    public void mostrarPedido(){
        double precio2=plato.getPrecio();
        if(cliente instanceof Profesor){
            precio2=precio2-(precio2*((Profesor) cliente).getPorcentajeDescuento()/100);
        }
        System.out.println("Plato: " + plato.getNombre() + "\n" + "Cliente: " + cliente.getNombre() + "\n" + "Precio: " + precio2 + "\n" + "Hora de entrega: " + horaEntrega.getHours() + ":" + horaEntrega.getMinutes());
    }
}
