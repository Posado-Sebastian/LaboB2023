public class Tecnico extends Operario{
    public Tecnico(){
        super();
    }
    public Tecnico(String nombre){
        super(nombre);
    }
    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public String toString() {
        return getClass().getSuperclass().getSuperclass().getCanonicalName() + " " + getNombre() + " -> " + getClass().getSuperclass().getCanonicalName() + " -> " + getClass().getCanonicalName();
    }
}
