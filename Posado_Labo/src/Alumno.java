import java.util.ArrayList;

public class Alumno extends Persona{
    private String apellido;
    private Fecha nacimiento;
    private ArrayList<Materia> materias;
    private String division;
    public Alumno(){
        this.apellido = "n/a";
        this.nacimiento= new Fecha();
        this.materias = new ArrayList<Materia>();
        this.division="";
    }
    public Alumno(String nombre, String apellido, Fecha nacimiento, ArrayList<Materia> materias, String division){
        super(nombre);
        this.apellido = apellido;
        this.nacimiento= nacimiento;
        this.materias = materias;
        this.division=division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getDivision() {
        return division;
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
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

    public String mostrarDatos(){
        System.out.println(getNombre()+ apellido + nacimiento.larga());
        if(materias.size()>0) {
            for (int i = 0; i < materias.size(); i++) {
                materias.get(i).mostrarMateria();
            }
        }
        return null;
    }
    public void agregarNota(int nota, int materia){
        if(nota<11 && nota>0){
            //Materia materiaSustituir=materias.get(materia);
            //materiaSustituir.getNotas().add(nota);
            materias.get(materia).getNotas().add(nota);
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
    public void agregarMateria(String materia) {
        materias.add(new Materia(new ArrayList<Integer>(), materia));
    }
    public void promedioAlumno(){
        int promedio=0;
        for (int i=0; i<materias.size(); i++){
            promedio=promedio+materias.get(i).promedioMateria();
        }
        System.out.println("El promedio del alumno es " + promedio);
    }
}
