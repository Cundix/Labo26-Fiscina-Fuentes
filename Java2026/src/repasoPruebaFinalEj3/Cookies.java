package repasoPruebaFinalEj3;

public class Cookies extends Preparacion implements Vendible
{
    private int bicarbonato;
    private Topping topping;

    public Cookies(int stock, int harina, int azucar, int manteca, int huevos, float precioUnitario, int bicarbonato, Topping topping) {
        super(stock, harina, azucar, manteca, huevos, precioUnitario);
        this.bicarbonato = bicarbonato;
        this.topping = topping;
    }

    public int getBicarbonato() {
        return bicarbonato;
    }

    public void setBicarbonato(int bicarbonato) {
        this.bicarbonato = bicarbonato;
    }

    public Topping getTopping() {
        return topping;
    }

    public void setTopping(Topping topping) {
        this.topping = topping;
    }

    @Override
    public void conocerReceta() {
        System.out.println("Empeza partiendo chocolate...");
    }

    @Override
    public void actualizarStock(int cantidad) throws NoHayStockException
    {
        if(super.getStock() >= cantidad)
        {
            System.out.println("Stock Suficiente");
        }
        else
        {
            throw new NoHayStockException("No Hay Stock Suficiente");
        }
    }

    @Override
    public void descripcionDeLaVenta()
    {
        System.out.println("Animate a probar las mejores cookies del mercado");
    }

    @Override
    public float calcularPrecio(int cantidad)
    {
        return getPrecioUnitario() * cantidad;
    }

    @Override
    public String vender(int cantidad)
    {
        float ganancia;
        try {
            actualizarStock(cantidad);
            ganancia = calcularPrecio(cantidad);
            return ("Ganancias: " + ganancia);
        }
        catch (NoHayStockException e)
        {
            return ("Ocurrio un error: no hay stock");
        }
    }
}
