package biblioteca;

import pedidoPlato.Persona;

import java.util.HashSet;

public class Autor extends Persona {
    private HashSet<Libro> libros;

    public Autor(String nombre, HashSet<Libro> libros) {
        super(nombre);
        this.libros = libros;
    }

    public HashSet<Libro> getLibros() {
        return libros;
    }

    public void setLibros(HashSet<Libro> libros) {
        this.libros = libros;
    }
}
