package mains;

import empresarial.SistemaBuffet;
import objetos.Pedido;
import objetos.Plato;
import fechas.Fecha;
import fechas.Hora;
import personas.PersonaEducativa;

public class MainPedidos {
    public static void main(String[] args) {
        SistemaBuffet buffet = new SistemaBuffet();

        Plato p1 = new Plato("Milanesa", 5000);
        Plato p2 = new Plato("Pasta", 4000);
        buffet.getMenu().add(p1);
        buffet.getMenu().add(p2);

        PersonaEducativa alumno = new PersonaEducativa(-20);

        Fecha hoy = new Fecha(15, 5, 2026);
        Hora ahora = new Hora(12, 0, 0);

        Pedido ped1 = alumno.hacerPedido(p1, ahora, hoy);
        buffet.registrarPedido(ped1);

        Pedido ped2 = alumno.hacerPedido(p1, ahora, hoy);
        buffet.registrarPedido(ped2);

        Pedido ped3 = alumno.hacerPedido(p2, ahora, hoy);
        buffet.registrarPedido(ped3);

        System.out.println("LISTA DE PEDIDOS:");
        for (Pedido p : buffet.getListaPedidos()) {
            System.out.println(p);
        }

        System.out.println("\nRANKING DE PLATOS:");
        buffet.mostrarTop3();

        System.out.println("\nPROCESANDO COCINA:");
        buffet.listaCocina(hoy);
    }
}