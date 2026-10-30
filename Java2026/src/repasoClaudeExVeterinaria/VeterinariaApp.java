package repasoClaudeExVeterinaria;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;

public class VeterinariaApp {

    public static void main(String[] args) {
        Cirugia cirugia = new Cirugia(7, Insumo.GASA, 10.1f, 8, 2.3f, 5);
        Consulta consulta = new Consulta(6, Insumo.GASA, 8.9f, 8, 9.0f, 1);
        Vacunacion vacunacion = new Vacunacion(8, Insumo.GASA, 3.2f, 5, 2.4f);

        Sistema sistema = new Sistema(new HashSet<>(), new HashMap<>(), new HashSet<>());

        sistema.agregarServicio(cirugia);
        sistema.agregarServicio(consulta);
        sistema.agregarServicio(vacunacion);

        System.out.println("Pruebo a ver si anda el error-------");

        sistema.registrarReserva(30, consulta);

        System.out.println("Pruebo a ver si anda normalmente-------");

        sistema.registrarReserva(2, consulta);

        System.out.println("Cant servicios renovables --------");

        sistema.cantidadServiciosReservables();

   }

}
