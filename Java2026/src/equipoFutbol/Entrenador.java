package equipoFutbol;

public class Entrenador extends CuerpoTecnico {
    private int cantCopasObetenidas;
    private Lisencia lisencia;
    private int aniosExperiencia;

    public Entrenador()
    {
        super();
        this.lisencia = new Lisencia();
        this.aniosExperiencia = 10;
    }

    public int getCantCopasObetenidas() {
        return cantCopasObetenidas;
    }

    public void setCantCopasObetenidas(int cantCopasObetenidas) {
        this.cantCopasObetenidas = cantCopasObetenidas;
    }

    public Lisencia getLisencia() {
        return lisencia;
    }

    public void setLisencia(Lisencia lisencia) {
        this.lisencia = lisencia;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    @Override
    public boolean contratable() {
        if(this.getLisencia().vigente() && this.getAniosExperiencia() > 2) return true;
        else return false;
    }
}
