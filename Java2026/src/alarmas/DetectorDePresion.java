package alarmas;

import fechas.Fecha;

public class DetectorDePresion extends Dispositivo {
    public DetectorDePresion(boolean estado, int umbral, Fecha fechaAdquisicion) {
        super(estado, umbral, fechaAdquisicion);
    }

    public DetectorDePresion() {
        super();
    }
}
