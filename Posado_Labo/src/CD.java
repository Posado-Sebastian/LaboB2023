import java.util.ArrayList;
import java.util.Scanner;

public class CD {
    private ArrayList<Cancion> cancions;
    public CD (){
        this.cancions = new ArrayList<Cancion>();
    }

    public ArrayList<Cancion> getCancions() {
        return cancions;
    }

    public void setCancions(ArrayList<Cancion> cancions) {
        this.cancions = cancions;
    }
    public void numeroCanciones(){
        System.out.println("El CD tiene " + cancions.size() + " canciones.");
    }
    public void verCancion(int posicion){
        Cancion cancion = cancions.get(posicion);
        Persona autor = cancion.getAutor();
        String datosAutor = autor.mostrarDatos();
        System.out.println("Titulo: " + cancion.getTitulo()+"\n"+datosAutor);
    }
    public void grabaCancion(int posicion, Cancion nuevaCancion){
        cancions.add(posicion, nuevaCancion);
    }
    public void agregarCancion(Cancion cancion){
        cancions.add(cancion);
    }
    public void eliminarCancion(int posicion){
        cancions.remove(posicion);
    }
    public void agregarCanciones(int cantidad){
        Scanner entrada2 = new Scanner(System.in);
        for (int i=0; i<cantidad; i++){
            System.out.println("ingresar titulo");
            String titulo = entrada2.nextLine();
            cancions.add(new Cancion(titulo, new Persona()));
        }
    }
}
