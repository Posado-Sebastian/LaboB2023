public class Rectangulo extends FiguraGeometrica{
    public Rectangulo(){
        super();
    }
    public Rectangulo(int base,int altura){
        super(base, altura);
    }

    @Override
    public void setAltura(int altura) {
        super.setAltura(altura);
    }

    @Override
    public void setBase(int base) {
        super.setBase(base);
    }

    @Override
    public int getAltura() {
        return super.getAltura();
    }

    @Override
    public int getBase() {
        return super.getBase();
    }

    @Override
    double perimetro() {
        int perimetro = getAltura()*2 + getBase()*2;
        return perimetro;
    }

    @Override
    double area() {
        int area = getBase()*getAltura();
        return area;
    }
}
