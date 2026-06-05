package alarmas;

import fechas.Fecha;
import modificadores.Estado;

public class Dispositivo {
    private Estado estado;
    private int umbral;
    private Fecha fechaAdquisicion;
    private int medicion;

    public Estado isEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public int getUmbral() {
        return umbral;
    }

    public void setUmbral(int umbral) {
        this.umbral = umbral;
    }

    public Fecha getFechaAdquisicion() {
        return fechaAdquisicion;
    }

    public void setFechaAdquisicion(Fecha fechaAdquisicion) {
        this.fechaAdquisicion = fechaAdquisicion;
    }

    public int getMedicion() {
        return medicion;
    }

    public void setMedicion(int medicion) {
        this.medicion = medicion;
    }

    public Dispositivo(Estado estado, int umbral, Fecha fechaAdquisicion) {
        this.estado = estado;
        this.umbral = umbral;
        this.fechaAdquisicion = fechaAdquisicion;
    }

    public Dispositivo() {
        this.estado = Estado.ACTIVADO;
        this.umbral = 1;
    }

    public void mensaje()
    {
        System.out.println("Dispositivo ACTIVADO!");
    }

    public boolean alarma()
    {
        if(this.getMedicion() > this.getUmbral())
        {
            this.mensaje();
            return true;
        }

        else
        {
            return false;
        }
    }
}
