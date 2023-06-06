package controlAlturaPeso;

public class Registro {
    private int peso;
    private int altura;
    public Registro(int peso, int altura) {
        this.peso = peso;
        this.altura = altura;
    }
    public Registro() {
        this.peso = 0;
        this.altura = 0;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}
