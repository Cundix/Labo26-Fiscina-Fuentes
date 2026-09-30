package alarmas;

import fechas.Fecha;
import modificadores.Estado;

public abstract class Dispositivo {
    private Estado estado;
    private double umbral;
    private Fecha fechaAdquisicion;

    public Dispositivo(Estado estado, double umbral, Fecha fechaAdquisicion) {
        this.estado = estado;
        this.umbral = umbral;
        this.fechaAdquisicion = fechaAdquisicion;
    }

    public Dispositivo() {
        this.estado = Estado.ACTIVADO;
        this.umbral = 1.0;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public double getUmbral() {
        return umbral;
    }

    public void setUmbral(double umbral) {
        this.umbral = umbral;
    }

    public Fecha getFechaAdquisicion() {
        return fechaAdquisicion;
    }

    public void setFechaAdquisicion(Fecha fechaAdquisicion) {
        this.fechaAdquisicion = fechaAdquisicion;
    }

    // Proporciona la medida del dispositivo (se sobrescribe en SensorComplejo)
    public abstract double proporcionarMedida();

    // Mensaje específico del disparo de alarma
    public abstract void mensaje();

    // Evalúa si dispara la alarma
    public boolean evaluarAlarma() {
        if (this.estado == Estado.ACTIVADO && proporcionarMedida() > getUmbral()) {
            mensaje();
            return true;
        }
        return false;
    }
}