package centroEducativo;

import java.util.HashSet;

public class CentroEducativo {
    private HashSet<Alumno> alumnos;

    public CentroEducativo(HashSet<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public HashSet<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(HashSet<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
    public int cantAlumnosAprobados(){
        int cant = 0;
        for (Alumno a : alumnos){
            if (a.examenesAprobados()){
                cant++;
            }
        }
        return cant;
    }
}
