package alarmas;

import java.util.ArrayList;

public class SistemaDispositivos {
    private ArrayList<Dispositivo> listaDetectores;

    public void activarDetectores() {
        if (listaDetectores.isEmpty()) return;

        float sumaUmbral = 0;
        float sumaMedicion = 0;

        for (Dispositivo d : listaDetectores) {
            sumaUmbral += d.getUmbral();
            sumaMedicion += d.getMedicion();
        }

        if ((sumaMedicion / listaDetectores.size()) > (sumaUmbral / listaDetectores.size())) {
            System.out.println("Detectores Activadados!!");
        }
    }
}
