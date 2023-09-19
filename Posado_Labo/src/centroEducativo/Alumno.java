package centroEducativo;

import pedidoPlato.Persona;

import java.util.HashSet;

public class Alumno extends Persona {
    private HashSet<Examen> examenes;

    public Alumno(String nombre, String apellido, int dni, HashSet<Examen> examenes) {
        super(nombre, apellido, dni);
        this.examenes = examenes;
    }

    public HashSet<Examen> getExamenes() {
        return examenes;
    }

    public void setExamenes(HashSet<Examen> examenes) {
        this.examenes = examenes;
    }
    public boolean examenesAprobados(){
        if (!examenes.isEmpty()){
            for (Examen e:examenes){
                if (!e.aprobado()){
                    return false;
                }
            }
        }
        return true;
    }
}
