package pedidoPlato;

public class Profesor extends Persona {
    private int porcentajeDescuento;

    public Profesor(String nombre, int porcentajeDescuento) {
        super(nombre);
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    public int getDireccion() {
        return super.getDireccion();
    }

    @Override
    public int getEdad() {
        return super.getEdad();
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    public int getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    @Override
    public void setDireccion(int direccion) {
        super.setDireccion(direccion);
    }

    @Override
    public void setEdad(int edad) {
        super.setEdad(edad);
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    public void setPorcentajeDescuento(int porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }
}
