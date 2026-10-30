package repasoPruebaFinalEj3;

import java.time.LocalDate;
import java.util.HashSet;

public class Sistema
{
    private HashSet<Preparacion> productos;
    private HashSet<Vendible> aLaVenta;
    private HashSet<Venta> historial;

    public Sistema(HashSet<Preparacion> productos, HashSet<Vendible> aLaVenta) {
        this.productos = productos;
        this.aLaVenta = aLaVenta;
    }

    public Sistema(HashSet<Preparacion> productos, HashSet<Vendible> aLaVenta, HashSet<Venta> historial) {
        this.productos = productos;
        this.aLaVenta = aLaVenta;
        this.historial = historial;
    }

    public HashSet<Preparacion> getProductos() {
        return productos;
    }

    public void setProductos(HashSet<Preparacion> productos) {
        this.productos = productos;
    }

    public HashSet<Vendible> getaLaVenta() {
        return aLaVenta;
    }

    public void setaLaVenta(HashSet<Vendible> aLaVenta) {
        this.aLaVenta = aLaVenta;
    }

    public void registrarVenta(Vendible producto, int cantidad)
    {
        try
        {
            Preparacion preparacion = (Preparacion) producto;
            String resultadoVenta = producto.vender(cantidad);
            historial.add(new Venta(producto, LocalDate.now(), resultadoVenta));
            preparacion.restarStock(cantidad);
        }
        catch(IllegalArgumentException e)
        {
            System.out.printf("No es un producto vendible o no es una cantidad valida");
        }
    }

    public void agregarPreparacion(Preparacion preparacion)
    {
        try
        {
            if(preparacion.stockValido())
            {
                productos.add(preparacion);
                System.out.println("Se ha agregado correctamente la preparacion");;
            }
            else
            {
                throw new CantidadInvalidaException("Ingrediente con cantidades invalidas");
            }
        }
        catch (CantidadInvalidaException e)
        {
            System.out.println(e.getMessage());
        }
    }

    public void reponerStock(Preparacion p, int nuevoStock)
    {
        try
        {
            p.reponerStock(nuevoStock);
            System.out.println();
            System.out.println("El Stock nuevo es de: " + p.getStock());
        }
        catch (CantidadInvalidaException e)
        {
            System.out.println(e.getMessage());
        }
    }

    public int cantidadVendibles()
    {
        return aLaVenta.size() - productos.size();
    }

    public void saberCantVendibles()
    {
        System.out.println("La cantidad de productos vendibles son: " + cantidadVendibles());
    }

}
