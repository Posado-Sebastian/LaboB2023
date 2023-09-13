package biblioteca;

import java.util.HashSet;

public class Libro {
    private GeneroLibro generoLibro;
    private Autor autor;
    private String titulo;
    private static int cantDescargas=10;
    private int cantDescargasDisponibles;
    private String nombrePDF;

    public Libro(GeneroLibro generoLibro, Autor autor, String titulo, String nombrePDF) {
        this.generoLibro = generoLibro;
        this.autor = autor;
        this.titulo = titulo;
        this.nombrePDF = nombrePDF;
    }
    public Libro(String titulo) {
        this.titulo = titulo;
    }
    public Libro() {
        this.generoLibro = null;
        this.autor = new Autor("", new HashSet<Libro>());
        this.titulo = "";
        this.nombrePDF = "";
    }

    public GeneroLibro getGeneroLibro() {
        return generoLibro;
    }

    public void setGeneroLibro(GeneroLibro generoLibro) {
        this.generoLibro = generoLibro;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public static int getCantDescargas() {
        return cantDescargas;
    }

    public static void setCantDescargas(int cantDescargas) {
        Libro.cantDescargas = cantDescargas;
    }

    public int getCantDescargasDisponibles() {
        return cantDescargasDisponibles;
    }

    public void setCantDescargasDisponibles(int cantDescargasDisponibles) {
        this.cantDescargasDisponibles = cantDescargasDisponibles;
    }

    public String getNombrePDF() {
        return nombrePDF;
    }

    public void setNombrePDF(String nombrePDF) {
        this.nombrePDF = nombrePDF;
    }


}
