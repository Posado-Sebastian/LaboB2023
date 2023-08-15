package mascotas;

import java.util.HashSet;

public class SistemaMascota {
    private HashSet<Mascota> mascotas;

    public SistemaMascota(HashSet<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    public HashSet<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(HashSet<Mascota> mascotas) {
        this.mascotas = mascotas;
    }
    public void verificarVidas(){
        for(Mascota mascota : mascotas){
            if(mascota instanceof Pez){
                if(((Pez) mascota).getVidas()==0){
                    mascotas.remove(mascota);
                }
            }
        }
    }
    public void altaMascota(Dueño dueño, String nombre, Mascota mascota){
        verificarVidas();
        Boolean ver = true;
        for (Mascota mascota1: mascotas){
            if(mascota1.getNombre()==nombre){
                ver=false;
            }
        }
        if(ver) {
            mascota.setDueño(dueño);
            mascota.setNombre(nombre);
            mascotas.add(mascota);
        }
    }
    public void bajaMascota(String nombre){
        verificarVidas();
        Mascota mascotaEliminar = null;
        for (Mascota mascota : mascotas){
            if(mascota.getNombre()== nombre){
                mascotaEliminar=mascota;
            }
        }
        if(!mascotaEliminar.equals(null)){
            mascotas.remove(mascotaEliminar);
        }
    }
    public void modificarMascota(String nombre, String nombreNuevo, Dueño dueñoNuevo, Mascota mascota2){
        verificarVidas();
        Mascota mascotaModificar = null;
        Boolean ver = true;
        for (Mascota mascota1: mascotas){
            if(mascota1.getNombre()==nombre){
                ver=false;
            }
        }
        for (Mascota mascota : mascotas){
            if(mascota.getNombre()== nombre){
                mascotaModificar=mascota;
            }
        }
        if(!mascotaModificar.equals(null)){
            if(ver) {
                mascota2.setDueño(dueñoNuevo);
                mascota2.setNombre(nombreNuevo);
                mascotas.add(mascota2);
            }
        }

    }
    public static void main(String[] args) {
        SistemaMascota a = new SistemaMascota(new HashSet<Mascota>());
        a.altaMascota(new Dueño("jose"), "carlos", new Pajarito(true));
        a.altaMascota(new Dueño("jose"), "carlos", new Perro());
        for(Mascota b: a.mascotas){
            System.out.println(b.getDueño());
            System.out.println(b.getNombre());
            System.out.println(b.getClass());

        }
    }
}
