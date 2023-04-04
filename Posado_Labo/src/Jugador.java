public class Jugador {
    private String nombre;
    private int numeroCamiseta;
    private Fecha fechaJugador;
    private boolean capitan;
    public Jugador(){
        this.nombre="n/a";
        this.numeroCamiseta=-1;
        this.fechaJugador=new Fecha();
        this.capitan=false;
    }
    public Jugador(String nombre, int numeroCamiseta, Fecha fechaJugador, boolean capitan){
        this.nombre=nombre;
        this.numeroCamiseta=numeroCamiseta;
        this.fechaJugador=fechaJugador;
        this.capitan=capitan;
    }

    public boolean isCapitan() {
        return capitan;
    }

    public void setCapitan(boolean capitan) {
        this.capitan = capitan;
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
        String siNo;
        if(capitan==true){
            siNo="Si";
        }else{
            siNo="No";
        }
        System.out.println("Nombre: " + nombre + "\n" + "Numero de camiseta: " + numeroCamiseta + "\n" + "Fecha de nacimiento: " + fechaJugador.larga() + "\n" + "Capitan: " + siNo + "\n");
    }
}
