package cosasPersona;

import java.util.Date;
import java.util.HashMap;

public class Personaa {
    private String apellido;
    private String nombre;
    private Date nacimiento;
    private HashMap<Date, Registro> control;

    public Personaa(String apellido, String nombre, Date nacimiento, HashMap<Date, Registro> control) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.nacimiento = nacimiento;
        this.control = control;
    }
    public Personaa() {
        this.apellido = "";
        this.nombre = "";
        this.nacimiento = new Date();
        this.control = new HashMap<Date, Registro>();
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public HashMap<Date, Registro> getControl() {
        return control;
    }

    public void setControl(HashMap<Date, Registro> control) {
        this.control = control;
    }
    public void consulta(Date fecha){
        if(!control.isEmpty()){
            System.out.println("Peso: " + control.get(fecha).getPeso() + " Altura: " + control.get(fecha).getAltura());
        }
    }
    public void promedioAnio(int anio){
        int promedioPeso=0;
        int promedioAltura=0;
        int cantidad=0;
        if(!control.isEmpty()){
            for(Date fecha : control.keySet()){
                if(fecha.getYear()==anio){
                    cantidad++;
                    promedioPeso=promedioPeso+control.get(fecha).getPeso();
                    promedioAltura=promedioAltura+control.get(fecha).getPeso();
                }
            }
            System.out.println("En ese año el peso es: " + promedioPeso/cantidad*100 + " y la altura es: " + promedioAltura/cantidad*100);
        }
    }
    public void crecimiento(int anio,  int elOtroAnio){
        int peso=0;
        int altura=0;
        Date anio1 = new Date(anio, 1, 1);
        Date anio2 = new Date(elOtroAnio, 1, 1);
        if(!control.isEmpty()){
            for(Date fecha : control.keySet()){
                if(fecha.getYear()==anio){
                    if(fecha.after(anio1)){
                        anio1=fecha;
                    }
                }
            }
            for(Date fecha : control.keySet()){
                if(fecha.getYear()==elOtroAnio){
                    if(fecha.after(anio2)){
                        anio2=fecha;
                    }
                }
            }
            System.out.println("Del año " + elOtroAnio + " al año " + anio + " cambio su peso en " + (control.get(anio2).getPeso() - control.get(anio1).getPeso()) + " y su cambio en altura fue " + (control.get(anio2).getAltura() - control.get(anio1).getAltura()));
        }
    }

    @Override
    public String toString() {
        return "Personaa{" +
                "apellido='" + apellido + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
