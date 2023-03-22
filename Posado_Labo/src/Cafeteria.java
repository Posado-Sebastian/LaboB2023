public class Cafeteria {
    private int cantidadMaxima;
    private int cantidadActual;
    public Cafeteria(){
        this.cantidadMaxima=1000;
        this.cantidadActual = 0;
    }
    public Cafeteria(int cantidadMaxima){
        this.cantidadMaxima=cantidadMaxima;
        this.cantidadActual=cantidadMaxima;
    }
    public Cafeteria(int cantidadMaxima, int cantidadActual){
        this.cantidadMaxima=cantidadMaxima;
        this.cantidadActual=cantidadActual;
        if(cantidadActual>cantidadMaxima){
            this.cantidadActual=cantidadMaxima;
        }
    }
    public void mostrarContenido(){
        System.out.println("Cantidad maxima: "+cantidadMaxima+"\n"+"Cantidad actual: "+ cantidadActual);
    }
    public void llenarCafetera(){
        cantidadActual=cantidadMaxima;
    }
    public void agregarCafe(int cantidad){
        if((cantidadActual+ cantidad)>cantidadMaxima){
            cantidadActual=cantidadMaxima;
        }else{
            cantidadActual=cantidadActual+cantidad;
        }
    }
    public void llenarTaza(int cantidad){
        if((cantidadActual-cantidad)<0){
            cantidadActual=0;
            System.out.println("la taza no se pudo llenar completamente");
        }else{
            cantidadActual=cantidadActual-cantidad;
        }
    }
    public void vaciarCafetera(){
        cantidadActual=0;
    }
}
