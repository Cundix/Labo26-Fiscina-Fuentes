package ventaComputadoras;

public class Compra {
    private Cliente cliente;
    private Computadora computadora;
    private MetodoDePago metodoDePago;

    public Compra(Cliente cliente, Computadora computadora, MetodoDePago metodoDePago) {
        this.cliente = cliente;
        this.computadora = computadora;
        this.metodoDePago = metodoDePago;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Computadora getComputadora() {
        return computadora;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
    }

    public MetodoDePago getMetodoDePago() {
        return metodoDePago;
    }

    public void setMetodoDePago(MetodoDePago metodoDePago) {
        this.metodoDePago = metodoDePago;
    }

    public void mostrarDetalle() {
        float subtotal = computadora.calcularSubtotal();
        float recargoMoneda = subtotal * metodoDePago.getRecargo() / 100;
        float total = subtotal + recargoMoneda;

        System.out.println(cliente.getNombre() + " " + cliente.getApellido());
        System.out.println(subtotal);
        System.out.println(recargoMoneda);
        System.out.println(total);
    }

    public void mostrarContadorPerifericos() {
        int entradas = 0;
        int salidas = 0;
        for (Componente p : computadora.getPerifericos()) {
            if (p instanceof DispositivoEntrada) entradas++;
            if (p instanceof DispositivoSalida) salidas++;
        }
        System.out.println(entradas);
        System.out.println(salidas);
    }
}