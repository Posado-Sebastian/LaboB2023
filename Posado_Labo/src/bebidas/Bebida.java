package bebidas;

public abstract class Bebida {
    private String nombre;
    private int coeficienteNegatividad;

    public Bebida(String nombre, int coeficienteNegatividad) {
        this.nombre = nombre;
        this.coeficienteNegatividad = coeficienteNegatividad;
    }
    public Bebida(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCoeficienteNegatividad() {
        return coeficienteNegatividad;
    }

    public void setCoeficienteNegatividad(int coeficienteNegatividad) {
        this.coeficienteNegatividad = coeficienteNegatividad;
    }
    public abstract int coficientePositividad();
    public abstract int calcularNegatividad();
}
