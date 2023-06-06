package pedidoPlato;

public class Profesor extends Persona {
    private int porcentajeDescuento;
    public Profesor (){
        super();
        this.porcentajeDescuento=0;
    }
    public Profesor (int edad, int direccion, String nombre, String apellido, int porcentajeDescuento){
        super(edad, direccion, nombre, apellido);
        this.porcentajeDescuento=porcentajeDescuento;
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
