package mains;

import empresarial.SistemaBuffet;

import personas.PersonaEducativa;
import objetos.Plato;
import objetos.Pedido;
import fechas.Fecha;
import fechas.Hora;

public class mainPedidos {
    public static void main(String[] args) {
        SistemaBuffet buffet = new SistemaBuffet();

        Plato plato1 = new Plato("Milanesa con Papas", 4500);
        Plato plato2 = new Plato("Ravioles con Tuco", 3800);
        buffet.getMenu().add(plato1);
        buffet.getMenu().add(plato2);

        Fecha hoy = new Fecha(15, 5, 2026);
        Hora horaAlmuerzo = new Hora(12, 30, 0);

        //Clientes
        PersonaEducativa alumno = new PersonaEducativa();
        alumno.setNombre("Facundo");
        alumno.setPorcentajeDto(-10);

        PersonaEducativa profesor = new PersonaEducativa();
        profesor.setNombre("Carlos");
        profesor.setPorcentajeDto(-20);

        System.out.println("=== SIMULACIÓN DE CLIENTES HACIENDO PEDIDOS ===");

        Pedido pedido1 = alumno.hacerPedido(plato1, horaAlmuerzo, hoy);
        Pedido pedido2 = profesor.hacerPedido(plato2, horaAlmuerzo, hoy);

        buffet.getListaPedidos().add(pedido1);
        buffet.getListaPedidos().add(pedido2);
        System.out.println("Pedidos enviados al sistema del Buffet exitosamente.\n");

        System.out.println("=== LISTA GENERAL DE PEDIDOS EN EL BUFFET ===");
        for (Pedido p : buffet.getListaPedidos()) {
            p.mostrarPedido();
        }

        System.out.println("\n=== LLAMANDO A 'listaCocina' PARA LA FECHA " + hoy + " ===");
        buffet.listaCocina(hoy);
    }
}