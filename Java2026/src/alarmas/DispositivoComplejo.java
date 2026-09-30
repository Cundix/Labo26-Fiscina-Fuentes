package alarmas;

import fechas.Fecha;
import modificadores.Estado;
import java.util.ArrayList;

public class DispositivoComplejo extends Dispositivo {
    private ArrayList<Dispositivo> dispositivos;

    public DispositivoComplejo(Estado estado, double umbral, Fecha fechaAdquisicion) {
        super(estado, umbral, fechaAdquisicion);
        this.dispositivos = new ArrayList<>();
    }

    public void agregarDispositivo(Dispositivo d) {
        this.dispositivos.add(d);
    }

    public void removerDispositivo(Dispositivo d) {
        this.dispositivos.remove(d);
    }

    @Override
    public double proporcionarMedida() {
        if (dispositivos.isEmpty()) {
            return 0.0;
        }

        double sumaMedidas = 0;
        int cantidadConectados = 0;

        for (Dispositivo d : dispositivos) {
            if (d.getEstado() == Estado.ACTIVADO) {
                sumaMedidas += d.proporcionarMedida();
                cantidadConectados++;
            }
        }

        if (cantidadConectados == 0) return 0.0;
        return sumaMedidas / cantidadConectados;
    }

    @Override
    public void mensaje() {
        System.out.println("¡Alarma! El promedio del grupo de sensores ha superado el umbral.");
    }
}