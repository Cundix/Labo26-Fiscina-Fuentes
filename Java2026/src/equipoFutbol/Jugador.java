package equipoFutbol;

import personas.Persona;

import java.util.HashSet;

public abstract class Jugador extends Persona implements Integrante{
    private String provinciaOrigen;
    private String numeroCamiseta;
    private HashSet<Club> historialClubes;


}
