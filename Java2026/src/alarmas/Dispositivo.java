package alarmas;

import java.time.LocalDate;

public abstract class Dispositivo {
    private Estado estado;
    private double umbral;
    private LocalDate fechaAdquisicion;

    public Dispositivo(Estado estado, double umbral, LocalDate fechaAdquisicion) {
        this.estado = estado;
        this.umbral = umbral;
        this.fechaAdquisicion = fechaAdquisicion;
    }

    public Dispositivo() {
        this.estado = Estado.ACTIVADO;
        this.umbral = 1.0;
        this.fechaAdquisicion = LocalDate.now();
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

    public LocalDate getFechaAdquisicion() {
        return fechaAdquisicion;
    }

    public void setFechaAdquisicion(LocalDate fechaAdquisicion) {
        this.fechaAdquisicion = fechaAdquisicion;
    }

    // Devuelve el valor numérico (medida) registrado por el dispositivo
    public abstract double proporcionarMedida();

    // Emite el mensaje particular correspondiente al tipo de alarma
    public abstract void mensaje();

    // Evalúa la medición actual contra el umbral si el sensor está activado
    public boolean evaluarAlarma() {
        if (this.estado == Estado.ACTIVADO && proporcionarMedida() > getUmbral()) {
            mensaje();
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Tipo: " + getClass().getSimpleName() +
                " | Estado: " + estado +
                " | Umbral: " + umbral +
                " | Fecha de Adquisición: " + fechaAdquisicion;
    }
}