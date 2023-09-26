package centroEducativo;

import java.time.LocalDateTime;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        ExamenEscrito ex1= new ExamenEscrito(LocalDateTime.now(), 1, 9);
        ExamenEscrito ex4= new ExamenEscrito(LocalDateTime.now(), 1,7);
        ExamenOral ex2=new ExamenOral(LocalDateTime.now(), NivelSatisfaccion.EXCELENTE);
        ExamenOral ex3=new ExamenOral(LocalDateTime.now(), NivelSatisfaccion.INSUFICIENTE);
        HashSet<Examen> examenes= new HashSet<>();
        HashSet<Examen> examenes2= new HashSet<>();
        examenes.add(ex1);
        examenes.add(ex2);
        examenes.add(ex4);
        examenes2.add(ex1);
        examenes2.add(ex2);
        examenes2.add(ex3);
        Alumno alumno= new Alumno("joe", "o", 2, examenes);
        Alumno alumno2= new Alumno("jose", "o", 2, examenes2);
        HashSet<Alumno>alumnos= new HashSet<>();
        alumnos.add(alumno);
        alumnos.add(alumno2);
        CentroEducativo centroEducativo= new CentroEducativo(alumnos);
        if(alumno.examenesAprobados()){
            System.out.println("aprobado");
        }
        System.out.println(centroEducativo.cantAlumnosAprobados());
    }
}
