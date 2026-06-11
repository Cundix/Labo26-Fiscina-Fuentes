package empresaLogistica;
/*
Envío Local: Si la zona de origen y destino son la misma. Guarda el barrio de origen y
barrio de destino. El costo se calcula como: precio_base + (distancia * 50).*/

public class EnvioLocal extends Envio {
    private String barrioOrigen;
    private String barrioDestino;
    private float costoTotal;

    public String getBarrioOrigen() {
        return barrioOrigen;
    }

    public void setBarrioOrigen(String barrioOrigen) {
        this.barrioOrigen = barrioOrigen;
    }

    public String getBarrioDestino() {
        return barrioDestino;
    }

    public void setBarrioDestino(String barrioDestino) {
        this.barrioDestino = barrioDestino;
    }

    public float getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(float costoTotal) {
        this.costoTotal = costoTotal;
    }

    public EnvioLocal(float distanciaEnKm, float pesoDelPaqueteEnKg, Provincia origen, Provincia destino, String barrioOrigen, String barrioDestino, float costoTotal) {
        super(distanciaEnKm, pesoDelPaqueteEnKg, origen, destino);
        this.barrioOrigen = barrioOrigen;
        this.barrioDestino = barrioDestino;
        this.costoTotal = costoTotal;
    }

    public EnvioLocal(String barrioOrigen, String barrioDestino, float costoTotal) {
        this.barrioOrigen = barrioOrigen;
        this.barrioDestino = barrioDestino;
        this.costoTotal = costoTotal;
    }

    public EnvioLocal()
    {
        this.barrioDestino = "";
        this.barrioOrigen = "";
        this.costoTotal = 100;
    }

    public void setCostototal(float costoTotal) {
        this.costoTotal = costoTotal;
    }

    @Override
    public float calcularCosto() {

        return this.getPrecioBase() + (this.getDistanciaEnKm() * 50);
    }
}
