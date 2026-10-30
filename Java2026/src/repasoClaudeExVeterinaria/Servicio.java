package repasoClaudeExVeterinaria;

public abstract class Servicio {
    protected int duracion;
    protected Insumo insumo;
    protected float honorarios;
    protected int cantTurnosDisponibles;
    protected float precioSesion;

    public abstract void conocerProtocolo();
    public abstract void agregarse(Sistema sistema);





}
