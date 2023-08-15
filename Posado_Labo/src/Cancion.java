import pedidoPlato.Persona;

public class Cancion {
    private String titulo;
    private Persona autor;
    private String genero;
    public Cancion(){
        this.titulo=" ";
        this.autor=null;
        this.genero="n/a";
    }
    public Cancion(String titulo, Persona autor){
        this.titulo="asdasdads";
        this.autor=null;
        this.genero="MEITALACERO";
    }

    public Persona getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setAutor(Persona autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void mostrarGenero(){
        System.out.println("Titulo: "+titulo+"\n"+"Autor: "+ autor.toString()+"\n"+"Genero: "+ genero);
    }
}
