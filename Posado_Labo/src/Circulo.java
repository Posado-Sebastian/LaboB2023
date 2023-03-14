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
    public double areaCirculo(int radio){
        double area=radio*radio* Math.PI;
        return area;
    }

    public double perimetroCirculo(int radio){
        double perimetro=radio* Math.PI *2;
        return perimetro;
    }

    public static void main(String[] args) {

    }
}
