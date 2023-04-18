public class Periferico extends Componente{
    private Boolean entradaSalida;//false entrada y true salida
    public Periferico(){
        super();
        this.entradaSalida=false;
    }
    public Periferico(String marca, double precio, String nombre, Boolean entradaSalida){
        super(marca, precio, nombre);
        this.entradaSalida=entradaSalida;
    }

    public Boolean getEntradaSalida() {
        return entradaSalida;
    }

    public void setEntradaSalida(Boolean entradaSalida) {
        this.entradaSalida = entradaSalida;
    }
}
