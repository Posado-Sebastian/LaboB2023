package sistemaPrestamo;

public class Remera extends Ropa implements Prestable{
    private Double medidaEspalda;
    private Double contorno;
    private Double largoTorso;

    public Remera(String color, Material material, String marca, boolean estado, Double medidaEspalda, Double contorno, Double largoTorso) {
        super(color, material, marca, estado);
        this.medidaEspalda = medidaEspalda;
        this.contorno = contorno;
        this.largoTorso = largoTorso;
    }

    public Double getMedidaEspalda() {
        return medidaEspalda;
    }

    public void setMedidaEspalda(Double medidaEspalda) {
        this.medidaEspalda = medidaEspalda;
    }

    public Double getContorno() {
        return contorno;
    }

    public void setContorno(Double contorno) {
        this.contorno = contorno;
    }

    public Double getLargoTorso() {
        return largoTorso;
    }

    public void setLargoTorso(Double largoTorso) {
        this.largoTorso = largoTorso;
    }

    @Override
    public String toString() {
        return "Remera{" +
                "medidaEspalda=" + medidaEspalda +
                ", contorno=" + contorno +
                ", largoTorso=" + largoTorso +
                '}';
    }

    @Override
    public boolean prestar() {
        if (isEstado()){
            System.out.println("La remera se dará prestado");
            return true;
        }else {
            System.out.println("La remera no se dará prestado");
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
