package sistemaPrestamo;

public abstract class Lectura implements Prestable{
    private int codigo;
    private String titulo;
    private int añoPublicacion;

    public Lectura(int codigo, String titulo, int añoPublicacion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.añoPublicacion = añoPublicacion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    @Override
    public boolean prestar() {
        return false;
    }

    @Override
    public void agregarElemento() {

    }

    @Override
    public String toString() {
        return "Lectura{" +
                "codigo=" + codigo +
                ", titulo='" + titulo + '\'' +
                ", añoPublicacion=" + añoPublicacion +
                '}';
    }
}
