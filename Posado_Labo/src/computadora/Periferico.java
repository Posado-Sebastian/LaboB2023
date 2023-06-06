package computadora;

import computadora.Componente;

public class Periferico extends Componente {
    private Boolean entradaSalida;//false entrada y true salida
    private String puertoValido;
    public Periferico(){
        super();
        this.entradaSalida=false;
        this.puertoValido="";
    }
    public Periferico(String marca, double precio, String nombre, int stock, Boolean entradaSalida, String puertoValido){
        super(marca, precio, nombre, stock);
        this.entradaSalida=entradaSalida;
        this.puertoValido=puertoValido;
    }

    public Boolean getEntradaSalida() {
        return entradaSalida;
    }

    public void setEntradaSalida(Boolean entradaSalida) {
        this.entradaSalida = entradaSalida;
    }
}
