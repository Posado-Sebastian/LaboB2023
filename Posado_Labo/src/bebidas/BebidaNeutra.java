package bebidas;

public class BebidaNeutra extends Bebida{
    private int coeficientePositividad;

    public BebidaNeutra(String nombre, int coeficienteNegatividad, int coeficientePositividad) {
        super(nombre, coeficienteNegatividad);
        this.coeficientePositividad = coeficientePositividad;
    }

    public int getCoreicientePositividad() {
        return coeficientePositividad;
    }

    public void setCoeficientePositividad(int coeficientePositividad) {
        this.coeficientePositividad = coeficientePositividad;
    }

    @Override
    public int coficientePositividad() {
        return coeficientePositividad;
    }

    @Override
    public int calcularNegatividad() {
        return 0;
    }
}
