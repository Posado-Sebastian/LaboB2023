package sistemaPrestamo;

import java.util.HashMap;

public class Libro extends Lectura{
    private HashMap<Integer, Integer> capitulosPaginas;

    public Libro(int codigo, String titulo, int fechaPublicacion, HashMap<Integer, Integer> capitulosPaginas) {
        super(codigo, titulo, fechaPublicacion);
        this.capitulosPaginas = capitulosPaginas;
    }

    public HashMap<Integer, Integer> getCapitulosPaginas() {
        return capitulosPaginas;
    }

    public void setCapitulosPaginas(HashMap<Integer, Integer> capitulosPaginas) {
        this.capitulosPaginas = capitulosPaginas;
    }

    @Override
    public boolean prestar() {
        if(capitulosPaginas.size()%2!=0){
            System.out.println("El libro se dará prestado");
            return true;
        }else{
            System.out.println("El libro no se dará prestado");
            return false;
        }
    }

    @Override
    public void agregarElemento() {
        if (prestar()) {
            System.out.println("El artículo ingresado puede ingresar al circuito de préstamos");
        } else {
            System.out.println("El artículo ingresado no podra ingresar al circuito de préstamos");
        }
    }

    @Override
    public String toString() {
        return "Libro{" +super.toString()+
                "capitulosPaginas=" + capitulosPaginas +
                '}';
    }
}
