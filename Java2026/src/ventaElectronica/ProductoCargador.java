package ventaElectronica;

public class ProductoCargador extends Producto
{
    private int cantidadCargas;

    public ProductoCargador(String nombre, int precio, int cantidadCargas)
    {
        super(nombre, precio);
        this.cantidadCargas = cantidadCargas;
        this.seccion = Seccion.CARGADORES;
    }

    public int getCantidadCargas() {
        return cantidadCargas;
    }

    public void setCantidadCargas(int cantidadCargas) {
        this.cantidadCargas = cantidadCargas;
    }
}
