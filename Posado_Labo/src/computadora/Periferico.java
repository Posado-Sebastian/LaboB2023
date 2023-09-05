package computadora;

import computadora.Componente;

public abstract class Periferico extends Componente {
    private Boolean entradaSalida;//false entrada y true salida
    private String puertoValido;

    public Periferico(Boolean entradaSalida, String puertoValido) {
        super();
        this.entradaSalida = entradaSalida;
        this.puertoValido = puertoValido;
    }

    public Periferico() {
        super();
        this.entradaSalida = false;
        this.puertoValido = "";
    }

    public Boolean getEntradaSalida() {
        return entradaSalida;
    }

    public void setEntradaSalida(Boolean entradaSalida) {
        this.entradaSalida = entradaSalida;
    }
}
