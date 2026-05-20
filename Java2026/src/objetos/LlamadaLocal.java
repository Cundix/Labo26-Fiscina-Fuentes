package objetos;

import fechas.Fecha;
import personas.Empleado;

public class LlamadaLocal extends Llamada
{
    String provinciaOrigen;
    String provinciaDestino;

    public LlamadaLocal()
    {
        super();
        provinciaOrigen = "Buenos Aires";
        provinciaDestino = "Buenos Aires";
    }

    public LlamadaLocal(String provinciaOrigen, String provinciaDestino)
    {
        super();
        this.provinciaOrigen = provinciaOrigen;
        this.provinciaDestino = provinciaDestino;
    }
    public LlamadaLocal(Empleado empleadoOrigen, Empleado empleadoDestino, int duracionMin, Fecha fecha, String provinciaOrigen, String provinciaDestino)
    {
        super(empleadoOrigen, empleadoDestino, duracionMin, fecha);
        this.provinciaOrigen = provinciaOrigen;
        this.provinciaDestino = provinciaDestino;
    }

    public String getProvinciaOrigen() {
        return provinciaOrigen;
    }

    public void setProvinciaOrigen(String provinciaOrigen) {
        this.provinciaOrigen = provinciaOrigen;
    }

    public String getProvinciaDestino() {
        return provinciaDestino;
    }

    public void setProvinciaDestino(String provinciaDestino) {
        this.provinciaDestino = provinciaDestino;
    }

    public int calcularCosto()
    {
        return this.getDuracionMin() * 5;
    }
}
