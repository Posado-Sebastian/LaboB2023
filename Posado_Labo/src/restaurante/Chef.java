package restaurante;

import pedidoPlato.Persona;

public class Chef extends Persona {
    private boolean experienciaPrevia;

    public Chef(String nombre, String apellido, int direccion,int edad, boolean experienciaPrevia) {
        super(edad, direccion, nombre, apellido);

        this.experienciaPrevia = experienciaPrevia;
    }
    public Chef() {
        super();
        this.experienciaPrevia = false;
    }

    public boolean isExperienciaPrevia() {
        return experienciaPrevia;
    }

    public void setExperienciaPrevia(boolean experienciaPrevia) {
        this.experienciaPrevia = experienciaPrevia;
    }
}
