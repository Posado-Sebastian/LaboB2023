package computadora;

import computadora.Periferico;

public class Pantalla extends Periferico {
    private String puertoValido;

    public Pantalla(String puertoValido) {
        super();
        this.puertoValido = puertoValido;
    }

    public String getPuertoValido() {
        return puertoValido;
    }

    public void setPuertoValido(String puertoValido) {
        this.puertoValido = puertoValido;
    }
}
