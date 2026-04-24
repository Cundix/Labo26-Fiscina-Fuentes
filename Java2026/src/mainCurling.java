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
            Jugador j = new Jugador("Nombre" + i, "Apellido" + i, new Fecha(1, 1, 1990), i);
            e1.addJugador(j);
            if (i == 1) e1.setCapitan(j); // El primero es capitan
        }
        e1.addTurno("mañana");
        e1.addTurno("tarde");

        // Crear Equipo 2
        Equipo e2 = new Equipo("Javier Milei");
        for (int i = 1; i <= 11; i++) {
            Jugador j = new Jugador("Jugador" + i, "Perez", new Fecha(5, 5, 1995), i);
            e2.addJugador(j);
            if (i == 1) e2.setCapitan(j);
        }
        e2.addTurno("tarde");
        e2.addTurno("noche");

        // Crear Equipo 3
        Equipo e3 = new Equipo("La Patagonia");
        for (int i = 1; i <= 11; i++) {
            Jugador j = new Jugador("Master" + i, "Gomez", new Fecha(10, 2, 1988), i);
            e3.addJugador(j);
            if (i == 1) e3.setCapitan(j);
        }
        e3.addTurno("mañana");
        e3.addTurno("noche");

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