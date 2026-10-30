package repasoUltimaPrueba2;

public class Brownie extends PreparacionVendible implements Vendible{
    private int chocolate;

    public Brownie(int harina, int chocolate) {
        super(harina);
        this.chocolate = chocolate;
    }

    public Brownie(int harina, int azucar, int manteca, int huevos, float precio, int stock, int chocolate) {
        super(harina, azucar, manteca, huevos, precio, stock);
        this.chocolate = chocolate;
    }

    @Override
    public boolean validar() {
        return (this.chocolate >= 0);
    }

    @Override
    public String conocerReceta() {
        return "Derreti la manetca";
    }



    @Override
    public void actualizarStock(int cantAVender) throws StockInsuficienteException {
        if(this.stock<cantAVender) throw new StockInsuficienteException("El stock actual del producto " + this.toString() +" es solo: " + this.stock);
        else this.stock -= cantAVender;
    }

    @Override
    public String descripcionDeVenta() {
        return "Brownies bien humedos!";
    }

    @Override
    public float calcularPrecio(int cantidad) {
        return cantidad*this.precio;
    }

    @Override
    public float vender(int cantidad) throws StockInsuficienteException {
        try
        {
            this.actualizarStock(cantidad);
            return this.calcularPrecio(cantidad);

        }
        catch (StockInsuficienteException stockInsuficienteException)
        {
            System.out.println("Error en la venta del producto " + this.toString());
            throw stockInsuficienteException;
        }
    }

    @Override
    public void agregarse(Sistema sistema) {
        sistema.agregarVendible(this);
    }

    @Override
    public String toString() {
        return "Brownie";
    }
}
