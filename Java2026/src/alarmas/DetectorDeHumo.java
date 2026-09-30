package alarmas;

import fechas.Fecha;
import modificadores.Estado;

public class DetectorDeHumo extends Dispositivo {
    private double medidaActual;

    public DetectorDeHumo(Estado estado, double umbral, Fecha fechaAdquisicion) {
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
        System.out.println("Llamando a los bomberos!");
    }
}