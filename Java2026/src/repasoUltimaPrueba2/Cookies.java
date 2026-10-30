package repasoUltimaPrueba2;

public class Cookies extends PreparacionVendible implements Vendible{
    private int bicarbonato;

    public Cookies(int harina, int bicarbonato) {
        super(harina);
        this.bicarbonato = bicarbonato;
    }
    @Override
    public void agregarse(Sistema sistema) {
        sistema.agregarVendible(this);
    }


    public Cookies(int harina, int azucar, int manteca, int huevos, float precio, int stock, int bicarbonato) {
        super(harina, azucar, manteca, huevos, precio, stock);
        this.bicarbonato = bicarbonato;
    }

    @Override
    public String conocerReceta() {
        return "Empeza partiendo el chocolate";
    }

    @Override
    public String toString() {
        return "Cookie";
    }

    @Override
    public boolean validar() {
        return bicarbonato>= 0;
    }



    @Override
    public void actualizarStock(int cantAVender) throws StockInsuficienteException {
        if(this.stock<cantAVender) throw new StockInsuficienteException("El stock actual del producto " + this.toString() +" es solo: " + this.stock);
        else this.stock -= cantAVender;
    }

    @Override
    public String descripcionDeVenta() {
        return "Las mejores cookies";
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
}
