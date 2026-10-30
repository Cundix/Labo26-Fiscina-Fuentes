package repasoClaudeExVeterinaria;

public abstract class Servicio {
    protected int duracion;
    protected Insumo insumo;
    protected float honorarios;
    protected int cantTurnosDisponibles;
    protected float precioSesion;

    public abstract void conocerProtocolo();
    public abstract void agregarse(Sistema sistema);

    public void sumarTurnos(int cantTurnos)
    {
        this.cantTurnosDisponibles += cantTurnos;
    }

    public Servicio(int duracion, Insumo insumo, float honorarios, int cantTurnosDisponibles, float precioSesion) {
        this.duracion = duracion;
        this.insumo = insumo;
        this.honorarios = honorarios;
        this.cantTurnosDisponibles = cantTurnosDisponibles;
        this.precioSesion = precioSesion;
    }
}
