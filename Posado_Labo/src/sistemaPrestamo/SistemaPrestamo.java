package sistemaPrestamo;

import java.util.HashMap;

public class SistemaPrestamo {
    private HashMap<Objeto, Boolean>objetoHashMap;

    public SistemaPrestamo(HashMap<Objeto, Boolean> objetoHashMap) {
        this.objetoHashMap = objetoHashMap;
    }

    public HashMap<Objeto, Boolean> getObjetoHashMap() {
        return objetoHashMap;
    }

    public void setObjetoHashMap(HashMap<Objeto, Boolean> objetoHashMap) {
        this.objetoHashMap = objetoHashMap;
    }
}
