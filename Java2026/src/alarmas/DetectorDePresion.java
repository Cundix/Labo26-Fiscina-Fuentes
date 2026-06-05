package alarmas;

import fechas.Fecha;
import modificadores.Estado;

public class DetectorDePresion extends Dispositivo {
    public DetectorDePresion(Estado estado, int umbral, Fecha fechaAdquisicion) {
        super(estado, umbral, fechaAdquisicion);
    }

    public DetectorDePresion() {
        super();
    }

    @Override
    public void mensaje() {
        System.out.println("Presion alta!");
    }
}
