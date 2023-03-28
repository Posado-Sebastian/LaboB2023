public class Libros {
    private String titulo;
    private Persona autor;
    private int ISBN;
    private int cantidadPaginas;
    private String editorial;
    private Fecha fechaPublicacion;
    public Libros(){
        this.titulo="n/a";
        this.autor=new Persona(0,0,"n/a");
        this.ISBN=0;
        this.cantidadPaginas=0;
        this.editorial="n/a";
        this.fechaPublicacion=new Fecha(1,1,1900);
    }
    public Libros(String titulo, Persona autor, int ISBN, int cantidadPaginas, String editorial, Fecha fechaPublicacion){
        this.titulo=titulo;
        this.autor=autor;
        this.ISBN=ISBN;
        this.cantidadPaginas=cantidadPaginas;
        this.editorial=editorial;
        this.fechaPublicacion=fechaPublicacion;
    }
    public Libros(String titulo, String editorial, Fecha fechaPublicacion, Persona autor, int ISBN, int cantidadPaginas){
        this.titulo="JOSEJOSE";
        this.editorial="santillana";
        this.autor=new Persona(32,4550,"jose");
        this.ISBN=123;
        this.cantidadPaginas=13;
        this.fechaPublicacion=new Fecha(31,8,2005);
    }
    public Libros(Persona autor, int ISBN, int cantidadPaginas, Fecha fechaPublicacion){
        this.autor=new Persona(17, 3980, "Seib");
        this.ISBN=455;
        this.cantidadPaginas=696;
        this.fechaPublicacion=new Fecha(28,8,2008);
    }

    public Fecha getFechaPublicacion() {
        return fechaPublicacion;
    }

    public int getCantidadPaginas() {
        return cantidadPaginas;
    }

    public int getISBN() {
        return ISBN;
    }

    public Persona getAutor() {
        return autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAutor(Persona autor) {
        this.autor = autor;
    }

    public void setCantidadPaginas(int cantidadPaginas) {
        this.cantidadPaginas = cantidadPaginas;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setFechaPublicacion(Fecha fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void mostrarInformacion(){

        System.out.println("Titulo: "+titulo+ "\r\n"+"Autor: "+ autor.mostrarDatos()+ "\r\n"+"ISBN: "+ISBN+ "\r\n"+"Cantidad de paginas: "+ cantidadPaginas+ "\r\n"+"Editorial: "+editorial+ "\r\n"+"Fecha: "+ fechaPublicacion.larga());
    }
    public void libroAnterior(Fecha fechaPublicacion1){
        int i;
        i = this.fechaPublicacion.menorQue(fechaPublicacion1);
        switch (i){
            case 3:
                System.out.println("Los dos libros salieron el mismo dia");
                break;
            case 2:
                System.out.println("El libro no es anterior al dado");
                break;
            default:
                System.out.println("El libro dado es anterior al dado");
                break;
        }
    }
}
