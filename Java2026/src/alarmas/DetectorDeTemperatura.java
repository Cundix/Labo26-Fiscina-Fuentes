package alarmas;

import fechas.Fecha;
import modificadores.Estado;

public class DetectorDeTemperatura extends Dispositivo {
    private double medidaActual;

    public DetectorDeTemperatura(Estado estado, double umbral, Fecha fechaAdquisicion) {
        super(estado, umbral, fechaAdquisicion);
    }

    public void setMedidaActual(double medidaActual) {
        this.medidaActual = medidaActual;
    }

    @Override
    public double proporcionarMedida() {
        return this.medidaActual;
    }

    @Override
    public void mensaje() {
        System.out.println("¡Cuidado! La temperatura sube");
    }
}