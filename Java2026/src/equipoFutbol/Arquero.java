package equipoFutbol;

public class Arquero extends Jugador{
    private float porcentajeAtajadas;
    private int cantGolesRecibidos;

    public Arquero()
    {
        super();
        this.porcentajeAtajadas = 1;
        this.cantGolesRecibidos = 1000;
    }

    public float getPorcentajeAtajadas() {
        return porcentajeAtajadas;
    }

    public void setPorcentajeAtajadas(float porcentajeAtajadas) {
        this.porcentajeAtajadas = porcentajeAtajadas;
    }

    public int getCantGolesRecibidos() {
        return cantGolesRecibidos;
    }

    public void setCantGolesRecibidos(int cantGolesRecibidos) {
        this.cantGolesRecibidos = cantGolesRecibidos;
    }

    @Override
    public boolean contratable() {
        if(this.getPorcentajeAtajadas() > 60 && this.getCantGolesRecibidos() < 10) return true;
        else return false;
    }
}
