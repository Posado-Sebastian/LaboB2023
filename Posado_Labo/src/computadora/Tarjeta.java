package computadora;

import computadora.MetodoPago;

public class Tarjeta extends MetodoPago {
    private int numero;
    private String banco;
    private Boolean credito;

    public Tarjeta(int numero, String banco, Boolean credito) {
        this.numero = numero;
        this.banco = banco;
        this.credito = credito;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public Boolean getCredito() {
        return credito;
    }

    public void setCredito(Boolean credito) {
        this.credito = credito;
    }
}
