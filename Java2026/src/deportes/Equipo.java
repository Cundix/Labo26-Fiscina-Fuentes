package deportes;

import personas.Jugador;

import java.util.ArrayList;

public class Equipo {

    private ArrayList<Jugador> jugadores;
    private ArrayList<String> turnos;
    private Jugador capitan;

    public Equipo(ArrayList<Jugador> jugadores, ArrayList<String> turno) {
        this.jugadores = jugadores;
        this.turnos = turno;
    }

    public Equipo() {
        this.jugadores = new ArrayList<>();
        this.turnos = new ArrayList<String>();
        this.turnos.add("Mañana");
        this.turnos.add("Tarde");
        this.turnos.add("Noche");
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public ArrayList<String> getTurnos() {
        return this.turnos;
    }

    public void setTurno(String turno) {
        this.turnos.add(turno);
    }



    public int getCantidadJugadores() {
        return jugadores.size();
    }

    public void addJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    public Jugador getJugador(int index)
    {
        return jugadores.get(index);
    }

    public boolean checkCamisetas()
    {
        boolean camiseta = false;
        Jugador jugador1 = new Jugador();
        for (Jugador jugador : jugadores) {

            if(jugador.getNumeroCamiseta() == jugador1.getNumeroCamiseta())
            {
                camiseta = true;
                break;
            }
            else
            {
                jugador1 = jugador;
            }

        }
        return camiseta;
    }

}
