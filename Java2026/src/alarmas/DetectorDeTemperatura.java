package alarmas;

import java.time.LocalDate;

public class DetectorDeTemperatura extends Dispositivo {
    private double medidaActual;

    public DetectorDeTemperatura(Estado estado, double umbral, LocalDate fechaAdquisicion) {
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