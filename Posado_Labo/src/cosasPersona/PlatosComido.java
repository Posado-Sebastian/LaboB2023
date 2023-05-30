package cosasPersona;

import java.util.HashSet;

public class PlatosComido {
    HashSet<PlatoCaloria> platoCalorias;

    public PlatosComido(HashSet<PlatoCaloria> platoCalorias) {
        this.platoCalorias = platoCalorias;
    }
    public PlatosComido() {
        this.platoCalorias = new HashSet<PlatoCaloria>();
    }

    public HashSet<PlatoCaloria> getPlatoCalorias() {
        return platoCalorias;
    }

    public void setPlatoCalorias(HashSet<PlatoCaloria> platoCalorias) {
        this.platoCalorias = platoCalorias;
    }
}
