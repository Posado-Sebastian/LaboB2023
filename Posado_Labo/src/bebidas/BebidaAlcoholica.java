package bebidas;

public class BebidaAlcoholica extends Bebida{
    private static int coeficientePositividad=0;
    private int cantAlcohol;

    public BebidaAlcoholica(String nombre, int cantAlcohol) {
        super(nombre);
        this.cantAlcohol = cantAlcohol;
        super.setCoeficienteNegatividad(calcularNegatividad());
    }

    public static int getCoeficientePositividad() {
        return coeficientePositividad;
    }

    public static void setCoeficientePositividad(int coeficientePositividad) {
        BebidaAlcoholica.coeficientePositividad = coeficientePositividad;
    }

    public int getCantAlcohol() {
        return cantAlcohol;
    }

    public void setCantAlcohol(int cantAlcohol) {
        this.cantAlcohol = cantAlcohol;
    }

    @Override
    public int coficientePositividad() {
        return coficientePositividad();
    }

    @Override
    public int calcularNegatividad() {
        return cantAlcohol*20;
    }
}
