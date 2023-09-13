package bebidas;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class SistemaBebida {
    private HashMap<Bebida,Integer>bebidas;
    private HashSet<Bebedor> bebedores;

    public SistemaBebida(HashMap<Bebida, Integer> bebidas, HashSet<Bebedor> bebedores) {
        this.bebidas = bebidas;
        this.bebedores = bebedores;
    }
    public SistemaBebida() {
        this.bebidas = new HashMap<Bebida,Integer>();
        this.bebedores = new HashSet<Bebedor>();
    }

    public HashMap<Bebida, Integer> getBebidas() {
        return bebidas;
    }

    public void setBebidas(HashMap<Bebida, Integer> bebidas) {
        this.bebidas = bebidas;
    }

    public HashSet<Bebedor> getBebedores() {
        return bebedores;
    }

    public void setBebedores(HashSet<Bebedor> bebedores) {
        this.bebedores = bebedores;
    }
    public void verDnis(Bebedor bebedor) throws DniException{
        for (Bebedor b: bebedores){
            if (b.getDni()==bebedor.getDni()){
                throw new DniException("ya hay otra persona con ese dni");
            }
        }
    }
    public void altaBebedor(Bebedor bebedor){
        try {
            verDnis(bebedor);
            bebedores.add(bebedor);
        }catch (DniException e){
            System.out.println(e.getMessage());
        }
    }
    public void modificarBebedor(Bebedor bviejo, Bebedor bnuevo){
        if (bebedores.contains(bviejo)){
            bebedores.remove(bviejo);
            bebedores.add(bnuevo);
        }
    }
    public void modificarBebida(Bebida bviejo, Bebida bnuevo){
        Integer n=bebidas.get(bviejo);
        bebidas.remove(bviejo);
        bebidas.put(bnuevo,n);
    }
    public void coeficientes(){
        Bebedor mayor = null;
        Bebedor menor = null;
        try {
            if (bebedores.isEmpty()){
                throw new NoPersonasRegistradasException("no hay personas registradas");
            }
            for (Bebedor b : bebedores) {
                if (mayor.equals(null)) {
                    mayor = b;
                }
                if (menor.equals(null)) {
                    menor = b;
                }
                if (mayor.calcularCoef() < b.calcularCoef()) {
                    mayor = b;
                }
                if (menor.calcularCoef() > b.calcularCoef()) {
                    menor = b;
                }
            }
            System.out.println("mayor hidratacion: " + mayor.getNombre() + " menor hidratacion: " + menor.getNombre());
        }catch (NoPersonasRegistradasException e){
            System.out.println(e.getMessage());
        }
    }
    public void verStock(Bebida bebida) throws BebidaDisponibleException{
        boolean ver=false;
        for (Map.Entry<Bebida,Integer> b : bebidas.entrySet()){
            if (b.getKey()==bebida){
                ver=true;
                if(b.getValue()==0){
                    throw new BebidaDisponibleException("La bebida solicitada no tiene stock disponible");
                }
            }
        }
        if (ver==false){
            throw new BebidaDisponibleException("La bebida solicitada no esta disponible");
        }
    }
    public void beber(Bebedor bebedor, Bebida bebida){
        try{
            Bebedor b1=bebedor;
            verStock(bebida);
            b1.agregarBebida(bebida);
            modificarBebedor(bebedor,b1);
            bebidas.replace(bebida,bebidas.get(bebida),bebidas.get(bebida)-1);
        }catch (BebidaDisponibleException e){
            System.out.println(e.getMessage());
        }
    }
}
