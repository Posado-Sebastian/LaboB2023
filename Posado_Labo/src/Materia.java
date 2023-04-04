import java.util.ArrayList;

public class Materia {
    private ArrayList<Integer> notas;
    private String nombreMateria;

    public Materia() {
        this.notas = new ArrayList<Integer>();
        this.nombreMateria = "n/a";
    }
    public Materia(ArrayList<Integer> notas, String nombreMateria) {
        this.notas = notas;
        this.nombreMateria = nombreMateria;
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
    public void mostrarMateria(){
        System.out.println(nombreMateria);
        for (int nota : notas) {
            System.out.println(notas);
        }
    }
    public int promedioMateria(){
        int promedio=0;
        for (int nota: notas){
            promedio=nota+promedio;
        }
        promedio=promedio/notas.size();
        System.out.println("El promedio de " + nombreMateria + " es " + promedio);
        return promedio;
    }

}