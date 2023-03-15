import java.util.Date;

public class Circulo {
    private int radio;
    public Circulo(){
        this.radio=2;
    }
    public int getRadio(){
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
    public double areaCirculo(){
        return Math.pow(radio,2)* Math.PI;
    }

    public double perimetroCirculo(){
        return radio* Math.PI *2;
    }

    public static void main(String[] args) {

    }
}
