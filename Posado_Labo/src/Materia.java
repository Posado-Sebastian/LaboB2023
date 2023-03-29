import java.util.ArrayList;

public class Materia {
    private ArrayList<Integer> notas;
    private String nombreMateria;

    public Materia(ArrayList<Integer> integers, String materia) {
        this.notas = notas;
        this.nombreMateria = nombreMateria;
    }

    public void Materia() {
        this.notas = new ArrayList<Integer>();
        this.nombreMateria = "n/a";
    }

    public void Materia(ArrayList<Integer> notas, String nombreMateria) {
        this.notas = notas;
        this.nombreMateria = nombreMateria;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }

}