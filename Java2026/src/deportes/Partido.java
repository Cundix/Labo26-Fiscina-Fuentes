package deportes;

import fechas.Fecha;

public class Partido {

    private Equipo equipo1;
    private Equipo equipo2;
    private String turno;
    private Fecha fechaPartido;

    public Partido(Equipo equipo1, Equipo equipo2, String turno, Fecha fechaPartido) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.turno = turno;
        this.fechaPartido = fechaPartido;
    }

    public Equipo getEquipo1() {
        return equipo1;
    }

    public void setEquipo1(Equipo equipo1) {
        this.equipo1 = equipo1;
    }

    public Equipo getEquipo2() {
        return equipo2;
    }

    public void setEquipo2(Equipo equipo2) {
        this.equipo2 = equipo2;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public Fecha getFechaPartido() {
        return fechaPartido;
    }

    public void setFechaPartido(Fecha fechaPartido) {
        this.fechaPartido = fechaPartido;
    }
}
