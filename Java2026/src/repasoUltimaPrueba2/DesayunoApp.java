package repasoUltimaPrueba2;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;

public class DesayunoApp {
    public static void main(String[] args) throws Exception {
        Bizcochuelo bizcochuelo = new Bizcochuelo(1, 1, 10, 9, 6.6f, 5, 10, 3);
        Brownie brownie = new Brownie(2, 3, 5, 8, 1.1f, 6, 10);
        Cookies cookies = new Cookies(6, 6, 1, 6, 9.1f, 10, 10);

        Sistema sistema = new Sistema(new HashSet<>(), new HashSet<>(), new HashSet<>());

        Venta venta = new Venta("Hola", LocalDate.of(2026, 1, 2), new HashMap<>());
    }
}
