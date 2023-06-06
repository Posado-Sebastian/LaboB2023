import pedidoPlato.Persona;
import sistemaVehiculo.Fecha;

public class Jugador extends Persona {
    private int numeroCamiseta;
    private Fecha fechaJugador;

    public Jugador(){
        this.numeroCamiseta=-1;
        this.fechaJugador=new Fecha();

    }
    public Jugador(String nombre, int numeroCamiseta, Fecha fechaJugador){
        super(nombre);
        this.numeroCamiseta=numeroCamiseta;
        this.fechaJugador=fechaJugador;

    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    public Fecha getFechaJugador() {
        return fechaJugador;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setFechaJugador(Fecha fechaJugador) {
        this.fechaJugador = fechaJugador;
    }

    public void setNumeroCamiseta(int numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }
    public void mostrarJugador(){
        System.out.println("Nombre: " + getNombre() + "\n" + "Numero de camiseta: " + numeroCamiseta + "\n" + "sistemaVehiculo.Fecha de nacimiento: " + fechaJugador.larga());
    }
}
