package computadora;

import computadora.Periferico;

public class Teclado extends Periferico {
    private String tipoConector;
    private String puertoValido;

    public Teclado(String tipoConector, String puertoValido) {
        this.tipoConector = tipoConector;
        this.puertoValido = puertoValido;
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
