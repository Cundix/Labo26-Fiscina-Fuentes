package empresaLogistica;

import modificadores.Estado;

import java.util.ArrayList;
import java.util.Comparator;

public class Empresa {
    private ArrayList<Envio> envios;
    private ArrayList<Repartidor> repartidores;

    public Empresa() {
        envios = new ArrayList<Envio>();
    }

    public void nuevoEnvio(Envio envio, Repartidor repartidor) {
        if(repartidor.getEstado() == Estado.LIBRES)
        {
            envios.add(envio);
            envio.getRepartidor().setEstado(Estado.OCUPADO);
            envio.getRepartidor().sumarEnvio();
        }
    }

    public void hacerRankingRepartidoresPorKM()
    {
        repartidores.sort(Comparator.comparingInt(Repartidor::getCantKMrecorridosEnEnviosNacionales));
        for(int i  = 0; i < 3; i++)
        {
            System.out.println("El repartidor N°" + i + " en envios es: " + repartidores.get(i).getNombre());
        }
    }


}
