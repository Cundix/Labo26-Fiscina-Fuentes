package repasoClaudeExVeterinaria;

public class Cirugia extends Servicio{
    int horasQuirofano;
    private Riesgo riesgo;

    @Override
    public void conocerProtocolo() {

    }

    @Override
    public void agregarse(Sistema sistema) {
        sistema.agregarServicioNormal(this);
    }

    public Cirugia(int duracion, Insumo insumo, float honorarios, int cantTurnosDisponibles, float precioSesion, int horasQuirofano) {
        super(duracion, insumo, honorarios, cantTurnosDisponibles, precioSesion);
        this.horasQuirofano = horasQuirofano;
    }
}
