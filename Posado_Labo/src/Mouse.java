import computadora.Periferico;

public class Mouse extends Periferico {
    private String tipoConector;
    private String puertoValido;
    public Mouse(){
        super();
        this.tipoConector="";
        this.puertoValido="";
    }
    public Mouse(String marca, double precio, String nombre, int stock, Boolean entradaSalida, String tipoConector, String puertoValido){
        this.tipoConector=tipoConector;
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
