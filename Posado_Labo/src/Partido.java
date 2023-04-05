public class Partido {
    private Equipo equipo1;
    private Equipo equipo2;
    private String horarioPartido;
    private String diaPartido;
    public Partido(){
        this.diaPartido="noAsignado";
        this.horarioPartido="noAsignado";
        this.equipo1=new Equipo();
        this.equipo2=new Equipo();
    }
    public Partido(String diaPartido, String horarioPartido, Equipo equipo1, Equipo equipo2){
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

    public String getDiaPartido() {
        return diaPartido;
    }

    public String getHorarioPartido() {
        return horarioPartido;
    }

    public void setDiaPartido(String diaPartido) {
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

}
