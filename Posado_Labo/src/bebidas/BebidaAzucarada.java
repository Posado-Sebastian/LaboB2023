package bebidas;

public class BebidaAzucarada extends Bebida{
    private int cantAzucar;
    private static int coeficientePositividad=1;

    public BebidaAzucarada(String nombre, int cantAzucar) {
        super(nombre);
        this.cantAzucar = cantAzucar;
        super.setCoeficienteNegatividad(calcularNegatividad());
    }

    public int getCantAzucar() {
        return cantAzucar;
    }

    public void setCantAzucar(int cantAzucar) {
        this.cantAzucar = cantAzucar;
    }

    public static int getCoeficientePositividad() {
        return coeficientePositividad;
    }

    public static void setCoeficientePositividad(int coeficientePositividad) {
        BebidaAzucarada.coeficientePositividad = coeficientePositividad;
    }

    @Override
    public int coficientePositividad() {
        return coeficientePositividad;
    }

    @Override
    public int calcularNegatividad() {
        return cantAzucar*10;
    }
}
