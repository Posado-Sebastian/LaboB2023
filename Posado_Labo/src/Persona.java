public class Persona {
    private int edad;
    private int direccion;
    private String nombre;
    public Persona(){
        this.edad=0;
        this.direccion=0;
        this.nombre="N/A";
    }
    public Persona(int edad, int direccion, String nombre){
        this.edad=edad;
        this.direccion=direccion;
        this.nombre=nombre;
    }

    public int getDireccion() {
        return direccion;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDireccion(int direccion) {
        this.direccion = direccion;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarDatos(){
        System.out.println("Edad: "+edad+" direccion: "+direccion+" nombre: "+nombre);
    }
}
