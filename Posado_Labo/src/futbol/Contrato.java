package futbol;

import pedidoPlato.Persona;
import restaurante.ExceptionChef;

public interface Contrato {
    void contratar(Persona jugador);
    void renovar(Persona jugador);
}
