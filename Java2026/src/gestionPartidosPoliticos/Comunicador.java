package gestionPartidosPoliticos;

import java.time.LocalTime;

public interface Comunicador {
    void enviarMensaje(LocalTime hora);

    public void enviarMensaje();
}
