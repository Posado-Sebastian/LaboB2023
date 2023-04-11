import java.util.ArrayList;

public class Partido {
    private Equipo equipo1;
    private Equipo equipo2;
    private String horarioPartido;
    private ArrayList<Boolean> diaPartido;
    public Partido(){
        this.diaPartido=new ArrayList<Boolean>();
        this.horarioPartido="noAsignado";
        this.equipo1=new Equipo();
        this.equipo2=new Equipo();
    }
    public Partido(ArrayList<Boolean> diaPartido, String horarioPartido, Equipo equipo1, Equipo equipo2){
        this.diaPartido=diaPartido;
        this.horarioPartido=horarioPartido;
        this.equipo1=equipo1;
        this.equipo2=equipo2;
    }

    public Equipo getEquipo1() {
        return equipo1;
    }

    public Equipo getEquipo2() {
        return equipo2;
    }

    public ArrayList<Boolean> getDiaPartido() {
        return diaPartido;
    }

    public String getHorarioPartido() {
        return horarioPartido;
    }

    public void setDiaPartido(ArrayList<Boolean> diaPartido) {
        this.diaPartido = diaPartido;
    }

    public void setEquipo1(Equipo equipo1) {
        this.equipo1 = equipo1;
    }

    public void setEquipo2(Equipo equipo2) {
        this.equipo2 = equipo2;
    }

    public void setHorarioPartido(String horarioPartido) {
        this.horarioPartido = horarioPartido;
    }
    public void mostrarPartido(){
        int dia=0;
        String diaString="";
        for(int i=0; i<diaPartido.size(); i++){
            if(equipo1.getDia().equals(equipo2.getDia())){
                dia=i;
            }
        }
        switch (dia){
            case 0:
                diaString="Lunes";
                break;
            case 1:
                diaString="Martes";
                break;
            case 2:
                diaString="Miercoles";
                break;
            case 3:
                diaString="Jueves";
                break;
            case 4:
                diaString="Viernes";
                break;
            case 5:
                diaString="Sabado";
                break;
            default:
                diaString="Domingo";
                break;
        }
        System.out.println(equipo1.getNombreEquipo() + " vs. " + equipo2.getNombreEquipo() + " el " + diaString + " a la " + horarioPartido);
    }
}
