import deportes.*;
import personas.Jugador;
import fechas.Fecha;
import java.util.ArrayList;

public class mainCurling {
    public static void main(String[] args) {

        CampeonatoCurling torneo = new CampeonatoCurling("Copa de Hielo 2026", 5000.0f);

        // Crear Equipo 1
        Equipo e1 = new Equipo("Los Glaciares");
        for (int i = 1; i <= 11; i++) {
            Jugador j = new Jugador(i);
            e1.addJugador(j);
            if (i == 1) e1.setCapitan(j); // El primero es capitán
        }
        e1.addTurno(Turno.MAÑANA);
        e1.addTurno(Turno.TARDE);

        // Crear Equipo 2
        Equipo e2 = new Equipo("Javier Milei");
        for (int i = 1; i <= 11; i++) {
            Jugador j = new Jugador(i);
            e2.addJugador(j);
            if (i == 1) e2.setCapitan(j);
        }
        e2.addTurno(Turno.TARDE);
        e2.addTurno(Turno.NOCHE);

        // Crear Equipo 3
        Equipo e3 = new Equipo("La Patagonia");
        for (int i = 1; i <= 11; i++) {
            Jugador j = new Jugador(i);
            e3.addJugador(j);
            if (i == 1) e3.setCapitan(j);
        }
        e3.addTurno(Turno.MAÑANA);
        e3.addTurno(Turno.NOCHE);

        // Agregar equipos al torneo
        torneo.agregarEquipo(e1);
        torneo.agregarEquipo(e2);
        torneo.agregarEquipo(e3);

        // Generar el fixture (Todos contra todos)
        System.out.println("Generando fixture para: " + torneo.getNombre());
        System.out.println("-------------------------------------------");
        torneo.generarFixture();

        // Mostrar los partidos generados
        for (Partido p : torneo.getPartidos()) {
            Fecha f = p.getFechaPartido();
            System.out.println("Día " + f.getDia() + ": " +
                    p.getEquipo1().getNombre() + " vs " +
                    p.getEquipo2().getNombre() +
                    " | Turno: " + p.getTurno());
        }
    }
}