import java.util.Date;

public class Pedido {
    private double id;
    private Date fechaCreacion;
    private Plato plato;
    private Boolean entregado;
    private Persona cliente;
    private Date horaEntrega;
    public Pedido(){
        this.id=0;
        this.fechaCreacion=new Date();
        this.plato=new Plato();
        this.entregado=false;
        this.cliente=new Persona();
        this.horaEntrega=new Date();
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

    public double getId() {
        return id;
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

    public void setId(double id) {
        this.id = id;
    }
}
