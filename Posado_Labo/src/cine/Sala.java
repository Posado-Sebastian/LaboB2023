package cine;

public class Sala {
    private int numeroSala;
    private static int cantButacas = 45;

    public Sala(int numeroSala) {
        this.numeroSala = numeroSala;
    }
    public Sala() {
        this.numeroSala = 0;
    }

    public int getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }

    public static int getCantButacas() {
        return cantButacas;
    }

    public static void setCantButacas(int cantButacas) {
        Sala.cantButacas = cantButacas;
    }
}
