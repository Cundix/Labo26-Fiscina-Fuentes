package personas;

import fechas.Fecha;

public class Jugador extends Persona
{

    private int numeroCamiseta;

    public Jugador(int numeroCamiseta) {
        super();
        this.numeroCamiseta = numeroCamiseta;
    }
    public Jugador(String nombre, String apellido, int edad, Fecha fechaNacimiento, String direccion, int numeroCamiseta) {
        super(nombre, apellido, edad, fechaNacimiento, direccion);
        this.numeroCamiseta = numeroCamiseta;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(int numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }
}
