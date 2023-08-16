import java.util.Date;

public class Circulo extends FiguraGeometrica{

    public Circulo(){
        super();
    }

    @Override
    public void setRadio(int radio) {
        super.setRadio(radio);
    }

    @Override
    public int getRadio() {
        return super.getRadio();
    }

    @Override
    double perimetro() {
        return getRadio()* Math.PI *2;
    }

    @Override
    double area() {
        return Math.pow(getRadio(),2)* Math.PI;
    }

    public static void main(String[] args) {

    }
}
