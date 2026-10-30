package repasoPruebaFinalEj3;

public class Brownie extends Preparacion implements Vendible
{
    private int chocolate;

    public Brownie(int stock, int harina, int azucar, int manteca, int huevos, float precioUnitario, int chocolate) {
        super(stock, harina, azucar, manteca, huevos, precioUnitario);
        this.chocolate = chocolate;
    }

    public int getChocolate() {
        return chocolate;
    }

    public void setChocolate(int chocolate) {
        this.chocolate = chocolate;
    }

    @Override
    public void conocerReceta()
    {
        System.out.println("Derreti la manteca...");
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
        System.out.println("Brownies bien humedos");
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
