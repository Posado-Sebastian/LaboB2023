import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class MenuPedido {
    private ArrayList<Pedido> pedidos;
    private ArrayList<Plato> platos;
    public MenuPedido(){
        this.pedidos=new ArrayList<Pedido>();
        this.platos=new ArrayList<Plato>();
    }
    public MenuPedido(ArrayList<Pedido> pedidos, ArrayList<Plato> platos){
        this.pedidos=pedidos;
        this.platos=platos;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public ArrayList<Plato> getPlatos() {
        return platos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public void setPlatos(ArrayList<Plato> platos) {
        this.platos = platos;
    }
    public void agregarPlato(String nombre, int precio){
        platos.add(new Plato(nombre,precio));
    }
    public void eliminarPlato(String nombre){
        for (int i=0; i<platos.size(); i++) {
            if(platos.get(i).getNombre()==nombre){
                platos.remove(i);
            }
        }
    }
    public void modificarPlato(String nombre, String nuevoNombre, int nuevoPrecio){
        for (int i=0; i<platos.size(); i++) {
            if(platos.get(i).getNombre()==nombre){
                platos.get(i).setNombre(nuevoNombre);
                platos.get(i).setPrecio(nuevoPrecio);
            }
        }
    }
    public void agregarPedido(){
        Scanner entradaS = new Scanner(System.in);
        Scanner entradaN = new Scanner(System.in);
        Pedido nuevoPedido = new Pedido();
        nuevoPedido.setId(Math.random()*1+9999);
        nuevoPedido.setFechaCreacion(new Date());//asigna la hora en la que se crea el pedido
        String palabra;
        int numero;
        System.out.println("ingrese el numero del plato a agregar");
        for (int i=0; i<platos.size(); i++){
            System.out.println("n° " + i);
            platos.get(i).mostrarPlato();
        }
        numero = Integer.parseInt(entradaN.nextLine());
        if(numero>=0 && numero<platos.size()) {
            nuevoPedido.setPlato(platos.get(numero));
        }else{
            System.out.println("el numero ingresado no es correcto");
            while(numero<0 || numero>platos.size()){
                numero = Integer.parseInt(entradaN.nextLine());
            }
            nuevoPedido.setPlato(platos.get(numero));
        }
        System.out.println("ingrese 0 para indicar si es alumno y 1 para profesor");
        numero = Integer.parseInt(entradaN.nextLine());
        switch (numero){
            case 0:
                Alumno alumno = new Alumno();
                System.out.println("Ingrese el nombre");
                palabra = entradaS.nextLine();
                alumno.setNombre(palabra);
                System.out.println("Ingrese el apellido");
                palabra = entradaS.nextLine();
                alumno.setApellido(palabra);
                System.out.println("Ingrese la division");
                palabra = entradaS.nextLine();
                alumno.setDivision(palabra);
                nuevoPedido.setCliente(alumno);
                break;
            case 1:
                Profesor profesor= new Profesor();
                System.out.println("Ingrese el nombre");
                palabra = entradaS.nextLine();
                profesor.setNombre(palabra);
                System.out.println("Ingrese el descuento");
                numero = Integer.parseInt(entradaN.nextLine());
                profesor.setPorcentajeDescuento(numero);
                break;
            default:
                System.out.println("el numero ingresado no es correcto el cliente sera asignado de forma automatica, para cambiarlo modifique el pedido");
                break;
        }
        Date entrega= new Date();
        System.out.println("ingrese la hora en la que el pedido sera retirado");
        numero = Integer.parseInt(entradaN.nextLine());
        entrega.setHours(numero);
        System.out.println("ingrese los minutos en la que el pedido sera retirado");
        numero = Integer.parseInt(entradaN.nextLine());
        entrega.setMinutes(numero);
        nuevoPedido.setHoraEntrega(entrega);
        pedidos.add(nuevoPedido);
    }
    public void eliminarPedido(double id){
        for (int i=0; i<pedidos.size(); i++){
            if(pedidos.get(i).getId()==id){
                pedidos.remove(i);
            }
        }
    }
}
