package sistemaPrestamo;

import java.util.HashMap;

public class SistemaPrestamo {
    private HashMap<Prestable, Boolean>objetoHashMap;

    public SistemaPrestamo(HashMap<Prestable, Boolean> objetoHashMap) {
        this.objetoHashMap = objetoHashMap;
    }

    public HashMap<Prestable, Boolean> getObjetoHashMap() {
        return objetoHashMap;
    }

    public void setObjetoHashMap(HashMap<Prestable, Boolean> objetoHashMap) {
        this.objetoHashMap = objetoHashMap;
    }
}
