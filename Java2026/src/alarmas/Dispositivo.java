package alarmas;

import fechas.Fecha;

public class Dispositivo {
    private boolean estado;
    private int umbral;
    private Fecha fechaAdquisicion;
    private int medicion;

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
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

    public Dispositivo(boolean estado, int umbral, Fecha fechaAdquisicion) {
        this.estado = estado;
        this.umbral = umbral;
        this.fechaAdquisicion = fechaAdquisicion;
    }

    public Dispositivo() {
        this.estado = true;
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
