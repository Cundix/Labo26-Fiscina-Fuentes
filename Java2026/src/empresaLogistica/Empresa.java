package empresaLogistica;

import modificadores.Estado;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<Envio> envios;

    public Empresa() {
        envios = new ArrayList<Envio>();
    }

    public void nuevoEnvio(Envio envio, Repartidor repartidor) {
        if(repartidor.getEstado() == Estado.LIBRES)
        {
            envios.add(envio);
            envio.
        }
    }
}
