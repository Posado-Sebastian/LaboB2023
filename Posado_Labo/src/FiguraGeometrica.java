public abstract class FiguraGeometrica {
    private int radio;
    private int base;
    private int altura;
    public FiguraGeometrica(){
        this.radio=0;
        this.base=0;
        this.altura=0;
    }
    public FiguraGeometrica(int base, int altura, int radio){
        this.radio=radio;
        this.base=base;
        this.altura=altura;
    }

    public FiguraGeometrica(int base, int altura) {
        this.base=base;
        this.altura=altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public int getAltura() {
        return altura;
    }

    public int getBase() {
        return base;
    }

    public int getRadio() {
        return radio;
    }
    abstract double perimetro();
    abstract double area();
}
