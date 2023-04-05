public class Jugador {
    private String nombre;
    private int numeroCamiseta;
    private Fecha fechaJugador;

    public Jugador(){
        this.nombre="n/a";
        this.numeroCamiseta=-1;
        this.fechaJugador=new Fecha();

    }
    public Jugador(String nombre, int numeroCamiseta, Fecha fechaJugador){
        this.nombre=nombre;
        this.numeroCamiseta=numeroCamiseta;
        this.fechaJugador=fechaJugador;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        System.out.println("Nombre: " + nombre + "\n" + "Numero de camiseta: " + numeroCamiseta + "\n" + "Fecha de nacimiento: " + fechaJugador.larga());
    }
}
