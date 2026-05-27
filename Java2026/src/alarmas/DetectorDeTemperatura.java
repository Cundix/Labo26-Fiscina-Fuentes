package alarmas;

import fechas.Fecha;

public class DetectorDeTemperatura extends Dispositivo{
    public DetectorDeTemperatura(boolean estado, int umbral, Fecha fechaAdquisicion) {
        super(estado, umbral, fechaAdquisicion);
    }

    public DetectorDeTemperatura() {
        super();
    }

}
