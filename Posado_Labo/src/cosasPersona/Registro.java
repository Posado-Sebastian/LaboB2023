package cosasPersona;

public class Registro {
    private double peso;
    private double altura;
    public Registro(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }
    public Registro() {
        this.peso = 0d;
        this.altura = 0d;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
