package gestionPartidosPoliticos;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        PalomaMensajera palomaMensajera = new PalomaMensajera(true);
        PartidoPolitico partidoPolitico = new PartidoPolitico("Lucas", "San Martin 2", 1, new ArrayList<>(Collections.singletonList(null)));
        ProblemaComunicacion problemaComunicacion = new ProblemaComunicacion("Hola", null, true, true);
        Telefono telefono = new Telefono(CompTelefonicas.PERSONAL, "Texto", 2.8f);
        Trabajador trabajador = new Trabajador(2, "Sam", "Perez", 9, LocalDate.of(2026, 3, 4), "San Martin 7", "Ejemplo", "Ejemplo", LocalTime.of(6, 30), LocalTime.of(8, 30), "Sofia", "Perez", "Dato", LocalDate.of(2026, 2, 4), 7.6f, "Hola", "Azul");
    }
}
