package ventaElectronica;

public class ProductoMultimedia extends Producto
{
    public ProductoMultimedia(String nombre, int precio)
    {
        super(nombre, precio);
        this.seccion = Seccion.MULTIMEDIA;
    }



}
