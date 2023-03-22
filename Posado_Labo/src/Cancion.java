public class Cancion {
    private String titulo;
    private Persona autor;
    private String genero;
    public Cancion(){
        this.titulo=" ";
        this.autor=new Persona(0, 0, " ");
        this.genero="n/a";
    }
    public Cancion(String titulo, Persona autor){
        this.titulo="asdasdads";
        this.autor=new Persona(17, 4550, "posado");
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
        System.out.println("Titulo: "+titulo+"\n"+"Autor: "+ autor.mostrarDatos()+"\n"+"Genero: "+ genero);
    }
}
