package sistemaVehiculo;

import sistemaVehiculo.Vehiculo;

public class Auto extends Vehiculo {
    private Boolean descapotado;
    private String patente;

    public Auto(Boolean descapotado, String patente) {
        this.descapotado = descapotado;
        this.patente = patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getPatente() {
        return patente;
    }

    public Boolean getDescapotado() {
        return descapotado;
    }

    public void setDescapotado(Boolean descapotado) {
        this.descapotado = descapotado;
    }
}
