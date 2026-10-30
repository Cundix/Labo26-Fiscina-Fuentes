package repasoUltimaPrueba2;

import ventaComputadoras.Compra;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Sistema {
    private HashSet<Preparacion> preparaciones;
    private HashSet<Vendible> productosEnStock;
    private HashSet<Venta> historialVentas;

    public Sistema(HashSet<Venta> historialVentas, HashSet<Vendible> productosEnStock, HashSet<Preparacion> preparaciones) {
        this.historialVentas = historialVentas;
        this.productosEnStock = productosEnStock;
        this.preparaciones = preparaciones;
    }

    public void registrarVenta(HashMap<Vendible, Integer> productosCompra)
    {

        float totalVenta = 0;
        try {

            for(Map.Entry<Vendible, Integer> entry : productosCompra.entrySet())
            {
                entry.getKey().actualizarStock(entry.getValue());
            }

        }
        catch (StockInsuficienteException sie)
        {
            System.out.println("No hay stock suficiente en uno de los productos seleccionados: " + sie.getMessage());
            return;
        }

        for(Map.Entry<Vendible, Integer> entry : productosCompra.entrySet())
        {
            totalVenta += entry.getKey().vender(entry.getValue());
        }

        this.historialVentas.add(new Venta(productosCompra));
        System.out.println("Venta cargada con exito!");
        System.out.println("Se ganó " + totalVenta);
    }

    public void agregarPreparacion(Preparacion preparacion)
    {
        if (preparacion.esValida())
        {
            preparacion.agregarse(this);
        }
    }

    public void agregarNoVendible(Preparacion p)
    {
        this.preparaciones.add(p);
    }

    public void agregarVendible(Vendible vendible)
    {
        this.productosEnStock.add(vendible);
        this.preparaciones.add((Preparacion) vendible);
    }

    public void reponerStock(int cantidad, Preparacion producto)
    {
        if(cantidad > 0)
        {
            producto.sumarAlStock(cantidad);
        }
        else System.out.println("Introducir un stock valido para sumar");
    }

    public void productosVentaActualmente()
    {
        System.out.println("Los productos a la venta actualmente son: " + this.productosEnStock.size());
    }



}
