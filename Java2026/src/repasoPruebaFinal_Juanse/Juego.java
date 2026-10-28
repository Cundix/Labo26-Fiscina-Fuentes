package repasoPruebaFinal_Juanse;

import java.util.HashMap;
import java.util.HashSet;

public class Juego
{
    private HashSet<Jugador> jugadores;
    private HashSet<Prueba> pruebas;
    private HashSet<Jugable> jugables;

    public Juego()
    {
        jugadores = new HashSet<>();
        pruebas = new HashSet<>();
        jugables = new HashSet<>();
    }

    public HashSet<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(HashSet<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public HashSet<Prueba> getPruebas() {
        return pruebas;
    }

    public void setPruebas(HashSet<Prueba> pruebas) {
        this.pruebas = pruebas;
    }

    public HashSet<Jugable> getJugables() {
        return jugables;
    }

    public void setJugables(HashSet<Jugable> jugables) {
        this.jugables = jugables;
    }
}
