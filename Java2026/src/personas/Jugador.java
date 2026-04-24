package personas;

import fechas.Fecha;

import java.util.ArrayList;

public class Jugador
{
    private String nombre;
    private String apellido;
    private Fecha fechaNacimiento;
    private int numeroCamiseta;

    public Jugador(String nombre, String apellido, Fecha fechaNacimiento, int numeroCamiseta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.numeroCamiseta = numeroCamiseta;
    }
    public Jugador() {
        this.nombre = "Tres";
        this.apellido = "TristesTigres";
        this.fechaNacimiento = new Fecha();
        this.numeroCamiseta = 0;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(int numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }


}
