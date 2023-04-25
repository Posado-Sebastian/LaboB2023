public class Cpu extends Componente{
    private String socket;
    private int cantidadPines;

    public Cpu(){
        super();
        this.socket="";
        this.cantidadPines=0;
    }
    public Cpu(String marca, double precio, String nombre, int stock, String socket, int cantidadPines){
        super(marca, precio, nombre, stock);
        this.socket=socket;
        this.cantidadPines=cantidadPines;
    }

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }

    public int getCantidadPines() {
        return cantidadPines;
    }

    public void setCantidadPines(int cantidadPines) {
        this.cantidadPines = cantidadPines;
    }
}
