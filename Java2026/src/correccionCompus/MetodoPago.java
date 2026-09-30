package correccionCompus;

public class MetodoPago {

    public double calcularRecargo(double subtotal) {
        return 0;
    }

    public double calcularTotal(double subtotal) {
        return subtotal + calcularRecargo(subtotal);
    }
    public String obtenerDetalle() {
        return "Método de pago";
    }

}
