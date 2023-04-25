public class Impresora extends Periferico{
    private String puertoValido;
    private Boolean metodoImpresion; //false injecion yy true laser
    public Impresora(){
        super();
        this.puertoValido="";
        this.metodoImpresion=false;
    }
    public Impresora(String marca, double precio, String nombre, int stock, Boolean entradaSalida, String puertoValido, Boolean metodoImpresion){
        super(marca, precio, nombre, stock, entradaSalida, puertoValido);
        this.metodoImpresion=metodoImpresion;
    }

    public String getPuertoValido() {
        return puertoValido;
    }

    public void setPuertoValido(String puertoValido) {
        this.puertoValido = puertoValido;
    }

    public Boolean getMetodoImpresion() {
        return metodoImpresion;
    }

    public void setMetodoImpresion(Boolean metodoImpresion) {
        this.metodoImpresion = metodoImpresion;
    }
}
