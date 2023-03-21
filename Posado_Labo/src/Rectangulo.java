public class Rectangulo {
    private int base;
    private int altura;
    public Rectangulo(){
        this.base = 0;
        this.altura = 0;
    }
    public Rectangulo(int base,int altura){
        this.base=base;
        this.altura=altura;
    }
    public int getBase(){
        return base;
    }
    public int getAltura(){
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setBase(int base) {
        this.base = base;
    }
    public int areaRectangulo(int base, int altura){
        int area = base*altura;
        return area;
    }
    public int perimetroRectangulo(int base, int altura){
        int perimetro = altura*2 + base*2;
        return perimetro;
    }
}
