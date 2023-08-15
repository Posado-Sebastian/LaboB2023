package mascotas;

public class Perro extends Mascota{
    public Perro() {
    }

    @Override
    String saludar(Dueño dueño) {
        if(dueño.equals(getDueño())) {
            String saludo="";
            for(int i=0; i<getAlegria(); i++){
                saludo = saludo + "guau";
            }
            modificarAlegria();
            return saludo;
        }else{
            modificarAlegria();
            return ("GUAU!");
        }
    }
    @Override
    void alimentar() {
        setAlegria(getAlegria()+1);
    }
}
