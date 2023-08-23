package cine;

import java.util.HashSet;

public class SistemaCine {
    private HashSet<Sala> salas;
    private HashSet<Pelicula> peliculas;
    private HashSet<Espectador> espectadores;
    private HashSet<Funcion> funciones;

    public SistemaCine(HashSet<Sala> salas, HashSet<Pelicula> peliculas, HashSet<Espectador> espectadores, HashSet<Funcion> funciones) {
        this.salas = salas;
        this.peliculas = peliculas;
        this.espectadores = espectadores;
        this.funciones = funciones;
    }
    public SistemaCine() {
        this.salas = new HashSet<Sala>();
        this.peliculas = new HashSet<Pelicula>();
        this.espectadores = new HashSet<Espectador>();
        this.funciones = new HashSet<Funcion>();
    }

    public HashSet<Sala> getSalas() {
        return salas;
    }

    public void setSalas(HashSet<Sala> salas) {
        this.salas = salas;
    }

    public HashSet<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(HashSet<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    public HashSet<Espectador> getEspectadores() {
        return espectadores;
    }

    public void setEspectadores(HashSet<Espectador> espectadores) {
        this.espectadores = espectadores;
    }

    public HashSet<Funcion> getFunciones() {
        return funciones;
    }

    public void setFunciones(HashSet<Funcion> funciones) {
        this.funciones = funciones;
    }
    public int cantUsuarios(){
        int cant=0;
        
        return cant;
    }
}
