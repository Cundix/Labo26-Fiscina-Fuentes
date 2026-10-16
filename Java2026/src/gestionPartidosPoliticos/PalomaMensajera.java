package gestionPartidosPoliticos;

import java.time.LocalTime;

public class PalomaMensajera implements Comunicador {
    private boolean aprendioMapa;

    public boolean isAprendioMapa() {
        return aprendioMapa;
    }

    public void setAprendioMapa(boolean aprendioMapa) {
        this.aprendioMapa = aprendioMapa;
    }


    @Override
    public void enviarMensaje() throws ProblemaComunicacion
    {
        if(this.isAprendioMapa())
        {
            System.out.println("Lema paloma");
        }

        else throw new ProblemaComunicacion("La paloma no aprendió el mapa todavía");
    }
}
