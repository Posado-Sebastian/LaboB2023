public class Operario extends Empleado{
    public Operario(){
        super();
    }
    public Operario(String nombre){
        super(nombre);
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    @Override
    public String toString() {
        return getClass().getSuperclass().getCanonicalName() + " " + getNombre() + " -> " + getClass().getCanonicalName();
    }
}
