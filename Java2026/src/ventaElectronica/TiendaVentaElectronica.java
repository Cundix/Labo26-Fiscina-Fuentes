package ventaElectronica;

import java.util.ArrayList;

public class TiendaVentaElectronica {
    private ArrayList<Producto> productos;

    public TiendaVentaElectronica(){
        productos = new ArrayList<Producto>();
    }

    public void agregarProducto(Producto producto)
    {
        this.productos.add(producto);
    }

    public void eliminarProducto(Producto producto)
    {
        this.productos.remove(producto);
    }

    public void modificarProducto(Producto producto, String nombre, int precio, int stock)
    {
        producto.setNombre(nombre);
        producto.setPrecio(precio);
        producto.setStock(stock);
    }

    public ArrayList<Producto> productosSeccion(Seccion seccion)
    {
        ArrayList<Producto> productosSeccion = new ArrayList<>();

        for (Producto producto : this.productos)
        {
            if(producto.esDeLaSeccion(seccion))
            {
                productosSeccion.add(producto);
            }
        }
        return productosSeccion;
    }

    public void mostrarSeccion(Seccion seccion)
    {
        ArrayList<Producto> productosSeccion = this.productosSeccion(seccion);
        for (Producto producto : productosSeccion)
        {
            producto.mostrarProducto();
        }
    }

    public void mostarMayorStock()
    {
        System.out.println("Mayor stock" + "\n--------------------");
        this.productoMayorStock().mostrarProducto();
    }

    public void mostarMenorStock()
    {
        System.out.println("Menor stock" + "\n--------------------");
        this.productoMayorStock().mostrarProducto();
    }


    public Producto productoMayorStock()
    {
        Producto productoAux = productos.get(0);

        for (Producto producto : this.productos)
        {
            productoAux = mayorStock(producto, productoAux);
        }
        return productoAux;
    }

    public Producto productoMenorStock()
    {
        Producto productoAux = productos.get(0);

        for (Producto producto : this.productos)
        {
            productoAux = menorStock(producto, productoAux);
        }
        return productoAux;
    }

    public Producto mayorStock(Producto producto1, Producto producto2)
    {
        if(stockProducto(producto1) >= stockProducto(producto2)) return producto1;
        return producto2;
    }
    public Producto menorStock(Producto producto1, Producto producto2)
    {
        if(stockProducto(producto1) <= stockProducto(producto2)) return producto1;
        return producto2;
    }


    public int stockProducto(Producto producto)
    {
        return producto.getStock();
    }

    public static void main(String[] args) {
        TiendaVentaElectronica tienda = new TiendaVentaElectronica();

        Television tv1 = new Television("Smart TV Samsung 55\"", 450000, Resolucion.CUATRO_K);
        tv1.setStock(15);

        Television tv2 = new Television("Noblex Entrada de Gama", 120000, Resolucion.MIL_OCHENTA);
        tv2.setStock(3);

        Television tv3 = new Television("Tedge Cocina", 85000, Resolucion.SIETEVEINTE);
        tv3.setStock(1);

        EquipoSonido audio1 = new EquipoSonido(true, "Parlante JBL Flip 6", 95000);
        audio1.setStock(22);

        EquipoSonido audio2 = new EquipoSonido(false, "Home Theater Sony Antiguo", 180000);


        Cargador cargadorFast = new Cargador("Cargador Anker PowerPort 20W", 25000, 500);
        cargadorFast.setStock(18);

        Cargador cargadorGeneric = new Cargador("Cargador Genérico Micro-USB", 4500, 100);
        cargadorGeneric.setStock(2);


        tienda.agregarProducto(tv1);
        tienda.agregarProducto(tv2);
        tienda.agregarProducto(tv3);
        tienda.agregarProducto(audio1);
        tienda.agregarProducto(audio2);
        tienda.agregarProducto(cargadorFast);
        tienda.agregarProducto(cargadorGeneric);


        System.out.println("=== SECCIÓN MULTIMEDIA ===");
        tienda.mostrarSeccion(Seccion.MULTIMEDIA);
        System.out.println();

        System.out.println("=== SECCIÓN CARGADORES ===");
        tienda.mostrarSeccion(Seccion.CARGADORES);
        System.out.println();


        tienda.mostarMayorStock();
        System.out.println();

        tienda.mostarMenorStock();
    }
}
