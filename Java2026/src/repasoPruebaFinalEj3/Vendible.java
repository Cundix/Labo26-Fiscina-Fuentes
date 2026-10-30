package repasoPruebaFinalEj3;

public interface Vendible
{
    public void actualizarStock(int cantidad) throws NoHayStockException;
    public void descripcionDeLaVenta();
    public float calcularPrecio(int cantidad);
    public String vender(int cantidad);

}
