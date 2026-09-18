package sistemaResiduos;

import java.util.HashMap;
import java.util.HashSet;

public class PuntoRecoleccion
{
    private String direccion;
    private String barrio;
    private double latitudOrigen;
    private double longitudOrigen;
    private HashMap<TipoResiduo, Integer> tiposRecibidos;

    public PuntoRecoleccion(String direccion, double latitudOrigen, double longitudOrigen, HashMap<TipoResiduo, Integer> tiposRecibidos)
    {
        this.direccion = direccion;
        this.latitudOrigen = latitudOrigen;
        this.longitudOrigen = longitudOrigen;
        this.tiposRecibidos = tiposRecibidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getLatitudOrigen() {
        return latitudOrigen;
    }

    public void setLatitudOrigen(double latitudOrigen) {
        this.latitudOrigen = latitudOrigen;
    }

    public double getLongitudOrigen() {
        return longitudOrigen;
    }

    public void setLongitudOrigen(double longitudOrigen) {
        this.longitudOrigen = longitudOrigen;
    }

    public HashMap<TipoResiduo, Integer> getTiposRecibidos() {
        return tiposRecibidos;
    }

    public void setTiposRecibidos(HashMap<TipoResiduo, Integer> tiposRecibidos) {
        this.tiposRecibidos = tiposRecibidos;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public boolean estaEnBarrio(String barrio)
    {
        if(this.barrio.equals(barrio)) { return true;};

        return false;
    }

    public boolean recibeTipo(TipoResiduo tipo)
    {
        if(this.tiposRecibidos.containsKey(tipo))
        {
            return true;
        }
        return false;
    }

    public boolean agregarTipo(TipoResiduo tipo, int cantidad)
    {
        if(!(this.recibeTipo(tipo) && this.tiposRecibidos.get(tipo) == cantidad))
        {
            this.tiposRecibidos.put(tipo, cantidad);
            return true;
        };

        return false;
    }

    public boolean eliminarTipo(TipoResiduo tipo)
    {
        if(this.recibeTipo(tipo))
        {
            this.tiposRecibidos.remove(tipo);
            return true;
        }
        return false;
    }
}
