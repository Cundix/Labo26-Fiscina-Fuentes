package equipoFutbol;

import personas.Persona;

import java.util.HashSet;

public abstract class Jugador extends Integrante{
    private String provinciaOrigen;
    private String numeroCamiseta;

    public Jugador()
    {
        super();
        this.provinciaOrigen = "NA";
        this.numeroCamiseta = "11";
    }

}
