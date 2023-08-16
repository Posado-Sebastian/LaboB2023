package mascotas;

import abmLugares.Pais;

public class Pajarito extends Mascota{
    private boolean cantor;

    public Pajarito(String nombre, Dueño dueño, int alegria, boolean cantor) {
        super(nombre, dueño, alegria);
        this.cantor = cantor;
    }
    public Pajarito() {
        super();
        this.cantor = false;
    }


    public boolean isCantor() {
        return cantor;
    }

    public void setCantor(boolean cantor) {
        this.cantor = cantor;
    }

    @Override
    String saludar(Dueño dueño) {
        if(!cantor) {
            String saludo = "";
            for (int i = 0; i < getAlegria(); i++) {
                saludo = saludo + "pio";
            }
            modificarAlegria();
            return saludo;
        }else{
            String saludo = "";
            for (int i = 0; i < getAlegria(); i++) {
                saludo = saludo + "\uD83C\uDFB5\uD83C\uDFB5\uD83C\uDFB5";
            }
            modificarAlegria();
            return saludo;
        }
    }
    @Override
    void alimentar() {
        setAlegria(getAlegria()+1);
    }

    public static void main(String[] args) {

    }
}

