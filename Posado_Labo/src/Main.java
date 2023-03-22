public class Main {
    public static void main(String[] args) {
        Cafeteria cafetera= new Cafeteria(5, 3);
        cafetera.mostrarContenido();
        cafetera.agregarCafe(5);
        cafetera.mostrarContenido();
        cafetera.llenarTaza(6);
        cafetera.mostrarContenido();
        cafetera.vaciarCafetera();
        cafetera.mostrarContenido();
        Libros libro = new Libros();
        libro.mostrarInformacion();
        Fecha fechaPublicacion;
        libro.libroAnterior(fechaPublicacion= new Fecha(2,2,1900));
        Cancion cancion = new Cancion();
        cancion.mostrarGenero();
    }
}