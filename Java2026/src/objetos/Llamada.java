package objetos;

import fechas.Fecha;
import personas.Empleado;

public class Llamada {
    private Empleado empleadoOrigen;
    private Empleado empleadoDestino;
    private int duracionMin;
    private Fecha fecha;
    private int costo;

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public Llamada(Empleado empleadoOrigen, Empleado empleadoDestino, int duracionMin, Fecha fecha) {
        this.empleadoOrigen = empleadoOrigen;
        this.empleadoDestino = empleadoDestino;
        this.duracionMin = duracionMin;
        this.fecha = fecha;
    }
    public Llamada()
    {
        this.empleadoOrigen = new Empleado();
        this.empleadoDestino = new Empleado();
        this.duracionMin = 0;
        this.fecha = new Fecha();
    }

    public Empleado getEmpleadoOrigen() {
        return empleadoOrigen;
    }

    public void setEmpleadoOrigen(Empleado empleadoOrigen) {
        this.empleadoOrigen = empleadoOrigen;
    }

    public Empleado getEmpleadoDestino() {
        return empleadoDestino;
    }

    public void setEmpleadoDestino(Empleado empleadoDestino) {
        this.empleadoDestino = empleadoDestino;
    }

    public int getDuracionMin() {
        return duracionMin;
    }

    public void setDuracionMin(int duracionMin) {
        this.duracionMin = duracionMin;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public int calcularCosto()
    {
        return this.getDuracionMin() * 1;
    }

    public void mostrarInfo(int numeroLlamada) {
        System.out.println("====== Llamada n°" + numeroLlamada + " ======");
        System.out.println("Origen: " + (this.getEmpleadoOrigen() != null ? this.getEmpleadoOrigen().getNombre() : "No asignado"));
        System.out.println("Destino: " + (this.getEmpleadoDestino() != null ? this.getEmpleadoDestino().getNombre() : "No asignado"));
        System.out.println("Fecha: " + (this.getFecha() != null ? this.getFecha().toString() : "No asignada"));
        System.out.println("Duración: " + this.getDuracionMin() + " min.");
    }

}
