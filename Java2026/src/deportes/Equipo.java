package deportes;

import personas.Jugador;
import java.util.ArrayList;

public class Equipo {

    private String nombre;
    private ArrayList<Jugador> jugadores;
    private ArrayList<String> turnos;
    private Jugador capitan;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
        this.turnos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public ArrayList<String> getTurnos() {
        return turnos;
    }

    public void addTurno(String turno) {
        this.turnos.add(turno.toLowerCase());
    }

    public void setCapitan(Jugador capitan) {
        this.capitan = capitan;
    }

    public Jugador getCapitan() {
        return capitan;
    }

    public int getCantidadJugadores() {
        return jugadores.size();
    }

    public void addJugador(Jugador jugador) {
        this.jugadores.add(jugador);
    }

    public boolean tieneUnSoloCapitan() {
        return this.capitan != null;
    }

    public boolean checkCamisetas() {
        for (int i = 0; i < jugadores.size(); i++) {
            for (int j = i + 1; j < jugadores.size(); j++) {
                if (jugadores.get(i).getNumeroCamiseta() == jugadores.get(j).getNumeroCamiseta()) {
                    return false;
                }
            }
        }
        return true;
    }
}