public class Pantalla extends Periferico{
    private String puertoValido;
    public Pantalla(){
        super();
        this.puertoValido="";
    }
    public Pantalla(String marca, double precio, String nombre, Boolean entradaSalida, String puertoValido){
        super(marca, precio, nombre, entradaSalida);
        this.puertoValido=puertoValido;
    }

    public String getPuertoValido() {
        return puertoValido;
    }

    public void setPuertoValido(String puertoValido) {
        this.puertoValido = puertoValido;
    }
}
