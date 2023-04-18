public class Teclado extends Periferico {
    private String tipoConector;
    private String puertoValido;
    public Teclado(){
        super();
        this.tipoConector="";
        this.puertoValido="";
    }
    public Teclado(String marca, double precio, String nombre, Boolean entradaSalida, String tipoConector, String puertoValido){
        super(marca, precio, nombre, entradaSalida);
        this.tipoConector=tipoConector;
        this.puertoValido=puertoValido;
    }

    public String getTipoConector() {
        return tipoConector;
    }

    public void setTipoConector(String tipoConector) {
        this.tipoConector = tipoConector;
    }

    public String getPuertoValido() {
        return puertoValido;
    }

    public void setPuertoValido(String puertoValido) {
        this.puertoValido = puertoValido;
    }
}
