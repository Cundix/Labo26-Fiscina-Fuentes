package sistemaResiduos;

import sistemaDronesXbarbieri.Distancia;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class SistemaBasura
{
    private HashSet<PuntoRecoleccion> puntosR;
    private HashMap<LocalDate, Boolean> log;

    public PuntoRecoleccion buscarPunto(String direccion)
    {
        for(PuntoRecoleccion p : puntosR)
        {
            if(p.getDireccion().equals(direccion))
            {
                return p;
            }
        }
        return null;
    }

    public boolean agregarPunto(PuntoRecoleccion punto)
    {
        if(punto != null || puntosR != null || !puntosR.contains(punto) )
        {
            if(!direccionExiste(punto.getDireccion()))
            {
                puntosR.add(punto);
            }
            return true;
        }
        return false;

    }

    public boolean direccionExiste(String direccion)
    {
        for (PuntoRecoleccion p : puntosR)
        {
            if(p.getDireccion().equals(direccion))
            {
                return true;
            }
        }
        return false;
    }

    public int cantidadRecibeBarrio (String barrio)
    {
        HashSet<PuntoRecoleccion> res = new HashSet<>();
        for (PuntoRecoleccion p : puntosR)
        {
            if(p.estaEnBarrio(barrio))
            {
                res.add(p);
            }
        }

        return res.size();
    }

    public boolean recibeTipo(PuntoRecoleccion punto, TipoResiduo tipo)
    {
        return punto.recibeTipo(tipo);
    }

    public void agregarResiduoAceptado(PuntoRecoleccion punto, TipoResiduo tipo, int cantidad)
    {
        punto.agregarTipo(tipo, cantidad);
    }

    public void eliminarResiduoAceptado(PuntoRecoleccion punto, TipoResiduo tipo)
    {
        punto.eliminarTipo(tipo);
    }

    public HashSet<PuntoRecoleccion> getPuntosQueReciben(TipoResiduo tipo)
    {
        HashSet<PuntoRecoleccion> res = new HashSet<>();
        for (PuntoRecoleccion p : puntosR)
        {
            if(p.recibeTipo(tipo))
            {
                res.add(p);
            }
        }
        return res;
    }


    public boolean iniciarRecoleccion(ArrayList<PuntoRecoleccion> ruta, Camion camion)
    {
        if(puntosR == null || SistemaBasura.rutaKm(ruta) > 45)
        {
            return false;
        }
        else
        {
            for(PuntoRecoleccion p : puntosR)
            {
                camion.recolectarPunto(p);
            }
        }
        return true;

    }

    public void nuevaRecoleccion(ArrayList<PuntoRecoleccion> ruta, Camion camion)
    {
        boolean resultado = this.iniciarRecoleccion(ruta, camion);

        this.log.put(LocalDate.now(), resultado);
    }

    static double rutaKm(ArrayList<PuntoRecoleccion> puntosR)
    {
        double la = -1, lo = -1;
        double distancia = 0;
        double laDes, loDes;
        PuntoRecoleccion p2 = null;

        for(PuntoRecoleccion p : puntosR)
        {
            if(p2 != null)
            {
                distancia += SistemaBasura.distanciaEntrePuntos(p, p2);
            }
            p2 = p;

        }

        return distancia;
    }

    static double distanciaEntrePuntos(PuntoRecoleccion punto1, PuntoRecoleccion punto2)
    {
        return Distancia.calcularDistancia(punto1.getLatitudOrigen(), punto1.getLongitudOrigen(), punto2.getLatitudOrigen(), punto2.getLongitudOrigen());
    }

    public double eficiencia ()
    {
        double eficiencia = 0;
        int cont = 0;
        for (Boolean res : this.log.values())
        {
            if(res)
            {
                eficiencia += 1;
            }
            cont ++;
        }

        eficiencia = eficiencia/cont * 100;
        System.out.println("Eficiencia: " + eficiencia + "%");
        return eficiencia;
    }


}
