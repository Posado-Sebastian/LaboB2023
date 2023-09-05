package excepcion;

public class ExceptionNombreVacio extends Throwable {
    public ExceptionNombreVacio(String nombre){
        super(nombre);
    }
    public static void longitudNombre(String nombre) throws ExceptionNombreVacio{
        if (nombre.length() == 0){
            throw new ExceptionNombreVacio("no se ha ingresado un nombre");
        }
    }
    public static void Main(String[] args){
        try {
            String nombre = null;
            System.out.println("El largo del nombre es:" + nombre.length());
            longitudNombre(nombre);
            if(nombre=="sebastian"){
                throw new IllegalArgumentException("no se puede llamar sebastian");
            }
        }catch (NullPointerException exception){
            exception.getMessage();
        }catch (IllegalArgumentException E){
            System.err.println(E);
        } catch (ExceptionNombreVacio e) {
            throw new RuntimeException(e);
        }
    }
}
