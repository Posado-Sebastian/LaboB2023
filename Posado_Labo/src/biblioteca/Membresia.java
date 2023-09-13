package biblioteca;

public enum Membresia {
    BRONCE(5), PLATA(15), ORO(50);
    private int cantLibros;

    Membresia(int i) {
        this.cantLibros=i;
    }

    public int getCantLibros() {
        return cantLibros;
    }

    public void setCantLibros(int cantLibros) {
        this.cantLibros = cantLibros;
    }
}
