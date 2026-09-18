package sistemaResiduos;

import java.util.HashSet;
import java.util.Map;

public abstract class Camion {
    private String modelo;
    private String patente;
    private int capacidadMaxKg;
    static int autonomiaKm = 45;
    private HashSet<TipoResiduo> residuosTransportados;

    public Camion(String modelo, String patente, HashSet<TipoResiduo> residuosTransportados) {
        this.modelo = modelo;
        this.patente = patente;
        this.residuosTransportados = residuosTransportados;
    }

    public Camion(String patente, String modelo) {
        this.patente = patente;
        this.modelo = modelo;
        this.residuosTransportados = new HashSet<>();
    }

    public Camion(String modelo, String patente, int capacidadMaxKg) {
        this.modelo = modelo;
        this.patente = patente;
        this.capacidadMaxKg = capacidadMaxKg;
        this.residuosTransportados = new HashSet<>();
    }

    public HashSet<TipoResiduo> getResiduosTransportados() {
        return residuosTransportados;
    }

    static void actualizarAutonomiaKm(int autonomiaKm)
    {
        Camion.autonomiaKm = autonomiaKm;
    }

    public void setResiduosTransportados(HashSet<TipoResiduo> residuosTransportados) {
        this.residuosTransportados = residuosTransportados;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public abstract boolean agregarTipoTransportado(TipoResiduo tipoResiduo);

    public void recolectarPunto(PuntoRecoleccion puntoRecoleccion)
    {
        for (Map.Entry<TipoResiduo, Integer> puntoTipo : puntoRecoleccion.getTiposRecibidos().entrySet()) {
            TipoResiduo tipoResiduo = puntoTipo.getKey();

            if(this.residuosTransportados.contains(tipoResiduo))
            {
                puntoTipo.setValue(0);
            }
        }
    }
}

