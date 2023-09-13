package biblioteca;

import java.util.HashSet;

public class BibliotecaVirtual {
    private HashSet<Libro> libros;
    private HashSet<Usuario> usuarios;

    public BibliotecaVirtual(HashSet<Libro> libros, HashSet<Usuario> usuarios) {
        this.libros = libros;
        this.usuarios = usuarios;
    }

    public BibliotecaVirtual() {
        this.libros = new HashSet<Libro>();
        this.usuarios = new HashSet<Usuario>();
    }

    public HashSet<Libro> getLibros() {
        return libros;
    }

    public void setLibros(HashSet<Libro> libros) {
        this.libros = libros;
    }

    public HashSet<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(HashSet<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public void altaLibro(GeneroLibro generoLibro, Autor autor, String titulo, String pdf) {
        libros.add(new Libro(generoLibro, autor, titulo, pdf));
    }

    public void bajaLibro(Libro libro){
        if (libros.contains(libro)) {
            libros.remove(libro);
        }
    }
    public void modificarLibro(Libro libroViejo, Libro libroNuevo){
        if (libros.contains(libroViejo)){
            libros.remove(libroViejo);
            libros.add(libroNuevo);
        }
    }
    public void modificarUsuario(Usuario viejo, Usuario usuario){
        if (usuarios.contains(viejo)){
            usuarios.remove(viejo);
            usuarios.add(usuario);
        }
    }
    public void limitePrestamos (Usuario usuario) throws MembresiaException{
        for (Usuario u : usuarios) {
            if (u.equals(usuario)) {
                if (u.getLibrosPrestados().size() >= u.getMembresia().getCantLibros()) {
                    throw new MembresiaException("limite de prestamos alcanzado");
                }
            }
        }
    }
    public void limiteDescargas (Libro libro) throws LimiteDePrestamosAlcanzadoException{
        if (libro.getCantDescargasDisponibles() == 0) {
            throw new LimiteDePrestamosAlcanzadoException("limite de descargas alcanzada por el libro");
        }
    }
    public void prestamo(Usuario usuario, Libro libro){

        try {
            Libro libro1=libro;
            Usuario usuario1=usuario;
            limiteDescargas(libro);
            limitePrestamos(usuario);
            libro1.setCantDescargasDisponibles(libro.getCantDescargasDisponibles()-1);
            usuario1.getMembresia().setCantLibros(usuario.getMembresia().getCantLibros()-1);
            usuario1.getLibrosPrestados().add(libro);
            modificarLibro(libro,libro1);
            modificarUsuario(usuario,usuario1);
            System.out.println("el prestamo se ha realizado de manera exitosa");
        } catch (LimiteDePrestamosAlcanzadoException e) {
            System.out.println(e.getMessage());
        } catch (MembresiaException e) {
            System.out.println(e.getMessage());
        }
    }
    public void devolverLibro(Usuario usuario, Libro libro){
        Usuario usuario1 = usuario;
        Libro libro1 = libro;
        usuario1.getLibrosPrestados().remove(libro);
        libro1.setCantDescargasDisponibles(libro.getCantDescargasDisponibles()+1);
        modificarLibro(libro,libro1);
        modificarUsuario(usuario, usuario1);
    }

    public static void main(String[] args) {
        BibliotecaVirtual biblioteca = new BibliotecaVirtual();
        biblioteca.altaLibro(GeneroLibro.lirica, new Autor("jose", new HashSet<Libro>()), "titulo1", "pdf");
        Usuario u = new Usuario("carlos", new HashSet<Libro>(), Membresia.BRONCE);
        //u.getMembresia().setCantLibros(0);
        biblioteca.usuarios.add(u);
        Libro l = new Libro(GeneroLibro.lirica, new Autor("jose", new HashSet<Libro>()), "titulo1", "pdf");
        biblioteca.prestamo(u, l);
        for (Usuario v : biblioteca.usuarios){
            if (v.equals(u)){
                System.out.println(v.getMembresia().getCantLibros());

            }
        }for (Libro f : biblioteca.libros){
            if (f.equals(l)){
                System.out.println(f.getCantDescargasDisponibles());
            }
        }

    }
}
