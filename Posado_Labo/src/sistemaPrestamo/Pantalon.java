package sistemaPrestamo;

public class Pantalon extends Ropa{
    private double medidaCintura;
    private double medidaCadera;
    private double largo;

    public Pantalon(String color, Material material, String marca, boolean estado, double medidaCintura, double medidaCadera, double largo) {
        super(color, material, marca, estado);
        this.medidaCintura = medidaCintura;
        this.medidaCadera = medidaCadera;
        this.largo = largo;
    }

    public double getMedidaCintura() {
        return medidaCintura;
    }

    public void setMedidaCintura(double medidaCintura) {
        this.medidaCintura = medidaCintura;
    }

    public double getMedidaCadera() {
        return medidaCadera;
    }

    public void setMedidaCadera(double medidaCadera) {
        this.medidaCadera = medidaCadera;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    @Override
    public String toString() {
        return "Pantalon{" +
                " medidaCintura=" + medidaCintura +
                ", medidaCadera=" + medidaCadera +
                ", largo=" + largo +
                '}';
    }

    @Override
    public boolean prestar() {
        if (isEstado()){
            System.out.println("El pantalon se dará prestado");
            return true;
        }else{
            System.out.println("El pantalon no se dará prestado");
            return false;
        }
    }

    @Override
    public void agregarElemento() {
        if (prestar()){
            System.out.println("El artículo ingresado puede ingresar al circuito de préstamos");
        }else {
            System.out.println("El artículo ingresado no podra ingresar al circuito de préstamos");
        }
    }
}
