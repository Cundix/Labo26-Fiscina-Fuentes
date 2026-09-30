package alarmas;

import java.time.LocalDate;

public class DetectorDePresion extends Dispositivo {
    private double medidaActual;

    public DetectorDePresion(Estado estado, double umbral, LocalDate fechaAdquisicion) {
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