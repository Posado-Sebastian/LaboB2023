import java.util.ArrayList;

public class Curling {
    private String nombreTorneo;
    private ArrayList<Equipo> equipos;
    public Curling(){
        this.equipos=new ArrayList<Equipo>();
        this.nombreTorneo="n/a";
    }
    public Curling(ArrayList<Equipo> equipos, String nombreTorneo){
        this.equipos=equipos;
        this.nombreTorneo=nombreTorneo;
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
    public void fixture(){
        ArrayList<Equipo> equiposFixture = equipos;
        ArrayList<String> encuentros = new ArrayList<String>();
        while(equiposFixture.size()>0){
            Boolean verificar=true;
            for(int i=1; equiposFixture.size()<i && verificar==true; i++) {
                if (equiposFixture.get(0).getHorario() == equiposFixture.get(i).getHorario().toLowerCase() && equiposFixture.get(0).getBarrio().toLowerCase() == equiposFixture.get(i).getBarrio().toLowerCase()) {
                    encuentros.add(equiposFixture.get(0).getNombreEquipo() + " vs. " + equiposFixture.get(i).getNombreEquipo() + "a la " + equiposFixture.get(0).getHorario());
                    equiposFixture.remove(0);
                    equiposFixture.remove(i);
                    verificar=false;
                } else if (equiposFixture.get(0).getHorario().toLowerCase() == equiposFixture.get(i).getHorario().toLowerCase() || equiposFixture.get(0).getBarrio().toLowerCase() == equiposFixture.get(i).getBarrio().toLowerCase()) {
                    encuentros.add(equiposFixture.get(0).getNombreEquipo() + " vs. " + equiposFixture.get(i).getNombreEquipo() + "a la " + equiposFixture.get(0).getHorario());
                    equiposFixture.remove(0);
                    equiposFixture.remove(i);
                    verificar=false;
                }
            }
            if(equiposFixture.size()<=3){
                encuentros.add(equiposFixture.get(0).getNombreEquipo() + " vs. " + equiposFixture.get(1).getNombreEquipo() + "a la " + equiposFixture.get(0).getHorario());
                if(equiposFixture.size()==2){
                    equiposFixture.remove(0);
                    equiposFixture.remove(1);
                }else{
                    equiposFixture.remove(0);
                    equiposFixture.remove(1);
                    equiposFixture.remove(2);
                }
            }
        }
        for (String encuentro:encuentros){
            System.out.println(encuentro);
        }
    }
}
