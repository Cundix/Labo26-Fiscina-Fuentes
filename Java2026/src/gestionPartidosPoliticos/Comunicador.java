package gestionPartidosPoliticos;

import java.time.LocalTime;

public interface Comunicador {


    public void enviarMensaje() throws ProblemaComunicacion;
}
