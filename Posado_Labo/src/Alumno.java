import java.util.ArrayList;

public class Alumno {
    private String  nombre;
    private String apellido;
    private Fecha nacimiento;
    private ArrayList<Integer> notas;
    public void alumno(){
        this.nombre = "n/a";
        this.apellido = "n/a";
        this.nacimiento= new Fecha();
        this.notas= new ArrayList<Integer>();
    }
    public void alumno(String nombre, String apellido, Fecha nacimiento, ArrayList<Integer> notas){
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacimiento= nacimiento;
        this.notas= notas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
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

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }
    public void agregarNota(int nota){
        if(nota<11 && nota>0){
            notas.add(nota);
        }
    }
    public void menorNota(){
        int menor = 10;
        for(int nota:notas){
            if(nota<menor){
                menor=nota;
            }
        }
    }
    public void mayorNota(){
        int mayor = 1;
        for(int nota:notas){
            if(nota>mayor){
                mayor=nota;
            }
        }
    }
}
