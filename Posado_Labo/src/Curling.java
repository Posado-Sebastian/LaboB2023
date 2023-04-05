import java.util.ArrayList;

public class Curling {
    private String nombreTorneo;
    private ArrayList<Equipo> equipos;
    private ArrayList<Partido> partidos;
    public Curling(){
        this.equipos=new ArrayList<Equipo>();
        this.nombreTorneo="n/a";
        this.partidos=new ArrayList<Partido>();
    }
    public Curling(ArrayList<Equipo> equipos, String nombreTorneo, ArrayList<Partido> partidos){
        this.equipos=equipos;
        this.nombreTorneo=nombreTorneo;
        this.partidos=partidos;
    }

    public ArrayList<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(ArrayList<Partido> partidos) {
        this.partidos = partidos;
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public String getNombreTorneo() {
        return nombreTorneo;
    }

    public void setNombreTorneo(String nombreTorneo) {
        this.nombreTorneo = nombreTorneo;
    }

    public void setEquipos(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }
    public void agregarEquipo(Equipo equipoNuevo){
        boolean verificar=true;
        for (int i=0; i<equipos.size(); i++){
            if (equipoNuevo.getNombreEquipo()==equipos.get(i).getNombreEquipo()){
                verificar=false;
            }
        }
        if(verificar==true && equipoNuevo.getJugadores().size()<11) {
            equipos.add(equipoNuevo);
        }
    }
    public void mostrarTorneo(){
        System.out.println("Los equipos que participan son : ");
        for(Equipo equipo:equipos){
            System.out.println(equipo.getNombreEquipo());
        }
    }
}
