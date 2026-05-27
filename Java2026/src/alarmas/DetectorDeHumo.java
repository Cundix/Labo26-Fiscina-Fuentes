package alarmas;

import fechas.Fecha;

public class DetectorDeHumo extends Dispositivo{
    public DetectorDeHumo(boolean estado, int umbral, Fecha fechaAdquisicion) {
        super(estado, umbral, fechaAdquisicion);
    }

    public DetectorDeHumo() {
        super();
    }
}
