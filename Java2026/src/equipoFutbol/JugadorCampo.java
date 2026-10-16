package equipoFutbol;

public class JugadorCampo extends Jugador{
    private float porcentajeConversiones;
    private int cantAsistencias;


    public float getPorcentajeConversiones() {
        return porcentajeConversiones;
    }

    public void setPorcentajeConversiones(float porcentajeConversiones) {
        this.porcentajeConversiones = porcentajeConversiones;
    }

    public int getCantAsistencias() {
        return cantAsistencias;
    }

    public void setCantAsistencias(int cantAsistencias) {
        this.cantAsistencias = cantAsistencias;
    }

    public JugadorCampo()
    {
        super();
        this.porcentajeConversiones = 60;
        this.cantAsistencias = 100;
    }

    @Override
    public boolean contratable() {
        if(this.getPorcentajeConversiones() > 30 && this.getCantAsistencias() >= 10) return true;
        else return false;
    }
}
