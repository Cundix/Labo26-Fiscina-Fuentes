package gestionPartidosPoliticos;

import java.sql.SQLOutput;

public class PalomaMensajera implements Comunicador {
    private boolean aprendioMapa;

    public boolean isAprendioMapa() {
        return aprendioMapa;
    }

    public void setAprendioMapa(boolean aprendioMapa) {
        this.aprendioMapa = aprendioMapa;
    }

    @Override
    public void enviarMensaje()
    {
        if(this.isAprendioMapa())
        {
            System.out.println("Lema paloma");
        }
    }
}
