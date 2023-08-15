package mascotas;

public class Pez extends Mascota{
    private static int vidas=10;

    public Pez() {
    }

    public static int getVidas() {
        return vidas;
    }

    public static void setVidas(int vidas) {
        Pez.vidas = vidas;
    }

    @Override
    String saludar(Dueño dueño) {
        if(dueño.equals(dueño)){
            vidas=vidas-1;
        }else{
            vidas=0;
        }
        return "";
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    void alimentar() {
        vidas+=vidas;
    }
}
