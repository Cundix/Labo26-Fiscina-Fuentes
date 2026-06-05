package alarmas;

import fechas.Fecha;
import modificadores.Estado;

public class DetectorDeTemperatura extends Dispositivo{
    public DetectorDeTemperatura(Estado estado, int umbral, Fecha fechaAdquisicion) {
        super(estado, umbral, fechaAdquisicion);
    }

    public DetectorDeTemperatura() {
        super();
    }

    @Override
    public void mensaje() {
        System.out.println("Temperatura alta!");
    }
}
