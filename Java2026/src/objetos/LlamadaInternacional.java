package objetos;

import fechas.Fecha;
import personas.Empleado;

public class LlamadaInternacional extends Llamada
{
    int codigoPaisDestino;
    int franjaHoraria;

    public LlamadaInternacional(int codigoPaisDestino, int franjaHoraria)
    {
        super();
        this.codigoPaisDestino = codigoPaisDestino;
        this.franjaHoraria = franjaHoraria;
    }

    public LlamadaInternacional(Empleado empleadoOrigen, Empleado empleadoDestino, int duracionMin, Fecha fecha, int codigoPaisDestino, int franjaHoraria) {
        super(empleadoOrigen, empleadoDestino, duracionMin, fecha);
        this.codigoPaisDestino = codigoPaisDestino;
        this.franjaHoraria = franjaHoraria;
    }

    public int getCodigoPaisDestino() {
        return codigoPaisDestino;
    }

    public void setCodigoPaisDestino(int codigoPaisDestino) {
        this.codigoPaisDestino = codigoPaisDestino;
    }

    public int getFranjaHoraria() {
        return franjaHoraria;
    }

    public void setFranjaHoraria(int franjaHoraria) {
        this.franjaHoraria = franjaHoraria;
    }

    public int calcularCosto()
    {
        return this.getDuracionMin() * 10;
    }
}
