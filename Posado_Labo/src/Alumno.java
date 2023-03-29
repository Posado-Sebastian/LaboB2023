import java.util.ArrayList;

public class Alumno {
    private String  nombre;
    private String apellido;
    private Fecha nacimiento;
    private ArrayList<Materia> materias;
    public void alumno(){
        this.nombre = "n/a";
        this.apellido = "n/a";
        this.nacimiento= new Fecha();
    }
    public void alumno(String nombre, String apellido, Fecha nacimiento){
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacimiento= nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<Materia> materias) {
        this.materias = materias;
    }

    public Fecha getNacimiento() {
        return nacimiento;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNacimiento(Fecha nacimiento) {
        this.nacimiento = nacimiento;
    }

    public void agregarNota(int nota, int materia){
        if(nota<11 && nota>0){
            Materia materiaSustituir=materias.get(materia);
            materiaSustituir.getNotas().add(nota);
        }
    }
    public void menorNota(int materia){
        int menor = 10;
        Materia materia2=materias.get(materia);
        ArrayList<Integer>notas2=materia2.getNotas();
        for(int nota:notas2){
            if(nota<menor){
                menor=nota;
            }
        }
    }
    public void mayorNota(int materia){
        int mayor = 1;
        Materia materia2=materias.get(materia);
        ArrayList<Integer>notas2=materia2.getNotas();
        for(int nota:notas2){
            if(nota>mayor){
                mayor=nota;
            }
        }
    }
    public void agregarMateria(String materia){
        materias.add(new Materia(new ArrayList<Integer>(), materia));
    }
}
