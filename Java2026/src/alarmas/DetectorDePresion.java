package alarmas;

import fechas.Fecha;
import modificadores.Estado;

public class DetectorDePresion extends Dispositivo {
    private double medidaActual;

    public DetectorDePresion(Estado estado, double umbral, Fecha fechaAdquisicion) {
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
        System.out.println("Sensor de presión activado");
    }
}