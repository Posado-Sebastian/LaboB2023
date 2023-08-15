package mascotas;

import pedidoPlato.Persona;

public abstract class Mascota {
    private String nombre;
    private Dueño dueño;
    private  int alegria;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Dueño getDueño() {
        return dueño;
    }

    public void setDueño(Dueño dueño) {
        this.dueño = dueño;
    }
    public int getAlegria() {
        return alegria;
    }

    public void setAlegria(int alegria) {
        this.alegria = alegria;
    }
    abstract String saludar(Dueño dueño);
    abstract void alimentar();
    public void modificarAlegria(){
        if(getAlegria()>1){
            setAlegria(getAlegria()-1);
        }
    }
        public String devuelveTipo(){
            return getClass().getCanonicalName();
        }
}
