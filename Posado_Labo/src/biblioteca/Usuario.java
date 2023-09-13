package biblioteca;

import pedidoPlato.Persona;

import java.util.HashSet;

public class Usuario extends Persona {
    private String mail;
    private HashSet<Libro> librosPrestados;
    private Membresia membresia;

    public Usuario(String nombre, HashSet<Libro> librosPrestados, Membresia membresia) {
        super(nombre);
        this.librosPrestados = librosPrestados;
        this.membresia = membresia;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public HashSet<Libro> getLibrosPrestados() {
        return librosPrestados;
    }

    public void setLibrosPrestados(HashSet<Libro> librosPrestados) {
        this.librosPrestados = librosPrestados;
    }

    public Membresia getMembresia() {
        return membresia;
    }

    public void setMembresia(Membresia membresia) {
        this.membresia = membresia;
    }
}
