package ventaElectronica;

public class Television extends ProductoMultimedia
{
    private Resolucion resolucion;

    public Television(String nombre, int precio, Resolucion tecnologia)
    {
        super(nombre, precio);
        this.resolucion = tecnologia;
    }

    public Resolucion getResolucion() {
        return resolucion;
    }

    public void setResolucion(Resolucion resolucion) {
        this.resolucion = resolucion;
    }
}
