package correccionCompus;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Sistema sistema = new Sistema();

        Cliente cliente = new Cliente("Ana", "Pérez", "1122334455");

        CPU cpu = new CPU("Intel", "i5", 200000, 10);

        ArrayList<String> puertosUSB = new ArrayList<>();
        puertosUSB.add("USB");

        ArrayList<String> puertosHDMI = new ArrayList<>();
        puertosHDMI.add("HDMI");

        ArrayList<String> puertosUSBWifi = new ArrayList<>();
        puertosUSBWifi.add("USB");
        puertosUSBWifi.add("WiFi");

        Teclado teclado = new Teclado("Logitech", "K120", 15000, 20, puertosUSB, "USB");
        Mouse mouse = new Mouse("Genius", "DX-110", 8000, 15, puertosUSB, "USB");
        Pantalla pantalla = new Pantalla("Samsung", "24 pulgadas", 120000, 8, puertosHDMI);
        Impresora impresora = new Impresora("HP", "DeskJet", 90000, 5, puertosUSBWifi, "Inyección");

        Computadora computadora = new Computadora(cpu);
        computadora.agregarPeriferico(teclado);
        computadora.agregarPeriferico(mouse);
        computadora.agregarPeriferico(pantalla);
        computadora.agregarPeriferico(impresora);
        System.out.println(computadora.calcularPrecioNeto());

        MetodoPago pago = new Tarjeta("123456789", "Santander", "Crédito");

        Venta venta = sistema.realizarCompra(cliente, computadora, pago);

        if (venta != null) {
            venta.mostrarDetalle();
            venta.mostrarCantidadEntradaYSalida();
        } else {
            System.out.println("No se pudo realizar la compra.");
        }

        sistema.mostrarComponenteMasVendido();
    }
}
