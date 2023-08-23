package cine;

public class Pelicula {
    private int identificador;
    private String titulo;
    private Genero genero;
    private int duracion;

    public Pelicula(int identificador, String titulo, Genero genero, int duracion) {
        this.identificador = identificador;
        this.titulo = titulo;
        this.genero = genero;
        this.duracion = duracion;
    }
    public Pelicula() {
        this.identificador = 0;
        this.titulo = "";
        this.genero = null;
        this.duracion = 0;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
}
