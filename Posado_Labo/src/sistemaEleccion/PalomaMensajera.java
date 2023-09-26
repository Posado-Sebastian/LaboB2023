package sistemaEleccion;

import pedidoPlato.Color;

public class PalomaMensajera extends Ave{
    private Boolean sabeVolar;

    public PalomaMensajera(Color color, String nombre, String especie, Boolean sabeVolar) {
        super(color, nombre, especie);
        this.sabeVolar = sabeVolar;
    }

    public Boolean getSabeVolar() {
        return sabeVolar;
    }

    public void setSabeVolar(Boolean sabeVolar) {
        this.sabeVolar = sabeVolar;
    }

    @Override
    public void lema(String mensaje) {
        if (sabeVolar){
            System.out.println("Lanzando un papelito que dice: " + mensaje);
        }
    }
}
