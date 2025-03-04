package pedidoPlato;

public abstract class Persona {
    private int edad;
    private int direccion;
    private String nombre;
    private String apellido;
    private int dni;


    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public Persona(String nombre, String apellido, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    public Persona(int edad, int direccion, String nombre, String apellido) {
        this.edad = edad;
        this.direccion = direccion;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona(){
        this.edad=0;
        this.direccion=0;
        this.nombre="";
        this.apellido="";
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public Persona(String nombre) {
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

}
