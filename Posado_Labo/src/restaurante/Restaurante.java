package restaurante;

import futbol.Contrato;
import futbol.ExceptionJugador;
import futbol.Jugador;
import pedidoPlato.Persona;
import pedidoPlato.Plato;

import java.util.HashSet;

public class Restaurante implements Contrato {
    private String nombre;
    private HashSet<Plato> platos;
    private HashSet<Chef> chefs;

    public Restaurante(HashSet<Plato> platos, HashSet<Chef> chefs, String nombre) {
        this.platos = platos;
        this.chefs = chefs;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashSet<Plato> getPlatos() {
        return platos;
    }

    public void setPlatos(HashSet<Plato> platos) {
        this.platos = platos;
    }

    public HashSet<Chef> getChefs() {
        return chefs;
    }

    public void setChefs(HashSet<Chef> chefs) {
        this.chefs = chefs;
    }
    public void agregarChef(Chef chef){
        chefs.add(chef);
    }

    public void verificarChef(Chef chef)throws ExceptionChef{
        if(chef.getEdad()>18 && !chef.isExperienciaPrevia()){
            throw new ExceptionChef("El chef no tiene experiencia previa");
        }else if(chef.getEdad()<=18 && chef.isExperienciaPrevia()){
            throw new ExceptionChef("El chef no es mayor de 18 años");
        }else if(chef.getEdad()<=18 && !chef.isExperienciaPrevia()){
            throw new ExceptionChef("El chef no tiene experiencia previa ni es mayor de 18");
        }
    }
    @Override
    public void contratar(Persona chef){
        try {
            verificarChef((Chef) chef);
            agregarChef((Chef) chef);
            System.out.println("El chef " + chef.getNombre() + " se unió al equipo de " + nombre);
        } catch (ExceptionChef e) {
            System.err.println(e);
        }
    }
    public void verificarPlato(Plato plato, Chef chef) throws ExceptionPlato{
        boolean ver = false;
        for (Plato plato1: platos){
            if(plato1.equals(plato)){
                ver=true;
            }
        }
        if(!chefs.contains(chef) && !ver){
            throw new ExceptionPlato("El chef no esta en el restaurante");
        }else if(chefs.contains(chef) && ver) {
            throw new ExceptionPlato("El plato ya esta en el restaurante");
        }
    }
    public void agregarPlato(Plato plato, Chef chef){
        try {
            verificarPlato(plato,chef);
            platos.add(plato);
            System.out.println("El plato "+ plato.getNombre() + " se agregó al menú de" + nombre);
        } catch (ExceptionPlato e) {
            System.err.println(e);
        }
    }

    @Override
    public void renovar(Persona chef) {

    }

    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante(new HashSet<>(),new HashSet<>(), "joseBurger");
        Chef chef = new Chef("jose" , "juan",21123, 19, true);
        Plato plato = new Plato("fiedos", "descripcion", TipoPlato.PLATO_PRINCIPAL, chef);
        restaurante.agregarPlato(plato, chef);
        restaurante.contratar(chef);
        restaurante.agregarPlato(plato, chef);
    }
}
