package equipoFutbol;

public class JugadorCampo extends Jugador implements Integrante{
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

    @Override
    public boolean contratable() {
        if(this.getPorcentajeConversiones() > 30 && this.getCantAsistencias() >= 10) return true;
        else System.out.println("El porcentaje de conversiones del jugador es menor a ");
    }
}
