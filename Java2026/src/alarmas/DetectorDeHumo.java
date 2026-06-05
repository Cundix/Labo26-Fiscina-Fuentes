package alarmas;

import fechas.Fecha;
import modificadores.Estado;

public class DetectorDeHumo extends Dispositivo{
    public DetectorDeHumo(Estado estado, int umbral, Fecha fechaAdquisicion) {
        super(estado, umbral, fechaAdquisicion);
    }

    public DetectorDeHumo() {
        super();
    }

    @Override
    public void mensaje() {
        System.out.println("Llamando a los bomberos!");
    }
}
