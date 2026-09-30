package correccionCompus;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Venta {
    private Cliente cliente;
    private Computadora computadora;
    private MetodoPago metodoPago;
    private LocalDateTime fecha;

    public Venta(Cliente cliente, Computadora computadora, MetodoPago metodoPago) {
        this.cliente = cliente;
        this.computadora = computadora;
        this.metodoPago = metodoPago;
        this.fecha = LocalDateTime.now();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    public MetodoPago getMetodoPago() {
        return metodoPago;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public double calcularSubtotal() {
        return computadora.calcularPrecioNeto();
    }

    public double calcularRecargo() {
        return metodoPago.calcularRecargo(calcularSubtotal());
    }

    public double calcularTotal() {
        return metodoPago.calcularTotal(calcularSubtotal());
    }

    public ArrayList<Componente> obtenerComponentesVendidos() {
        return computadora.obtenerComponentes();
    }

    public int cantidadDispositivosEntrada() {
        return computadora.cantidadDispositivosEntrada();
    }

    public int cantidadDispositivosSalida() {
        return computadora.cantidadDispositivosSalida();
    }

    public void mostrarCantidadEntradaYSalida() {
        System.out.println("Dispositivos de entrada: " + cantidadDispositivosEntrada());
        System.out.println("Dispositivos de salida: " + cantidadDispositivosSalida());
    }

    public void mostrarDetalle() {
        System.out.println("DETALLE DE VENTA");
        System.out.println("Fecha: " + fecha);
        System.out.println("Cliente: " + cliente.getNombreCompleto());
        System.out.println("Celular: " + cliente.getCelular());
        System.out.println("Método de pago: " + metodoPago.obtenerDetalle());
        System.out.println();

        computadora.mostrarDetalleComponentes();

        System.out.println();
        System.out.println("Subtotal: $" + calcularSubtotal());
        System.out.println("Recargo: $" + calcularRecargo());
        System.out.println("Total: $" + calcularTotal());
        System.out.println();
    }
}
