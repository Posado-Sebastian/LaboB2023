package mascotas;

public class Gato extends Mascota{
    public Gato() {
    }

    @Override
    String saludar(Dueño dueño) {
        if(dueño.equals(getDueño())) {
            String saludo="";
            for(int i=0; i<getAlegria(); i++){
                saludo = saludo + "miau";
            }
            modificarAlegria();
            return saludo;
        }else{
            modificarAlegria();
            return ("MIAU!");
        }
    }

    @Override
    void alimentar() {
        setAlegria(getAlegria()+1);
    }
}
