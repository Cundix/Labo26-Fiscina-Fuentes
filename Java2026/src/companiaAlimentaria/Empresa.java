package companiaAlimentaria;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<Producto> productos;

    public Empresa(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public Empresa() {
        this.productos = new ArrayList<Producto>();
    }

    public void agregarProducto(Producto producto)
    {
        this.productos.add(producto);

    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public String productoMasRecientementeEnvasado() {
        Producto ultimo = this.productos.get(0);
        for (Producto producto : this.productos) {
            if (producto.getFechaEnvasado().mayorQue(ultimo.getFechaEnvasado())) ultimo = producto;
        }
        return ultimo.numeroDeLote;
    }

    public void productosPorPais() {
        for(PaisOrigen paisOrigen : PaisOrigen.values())
        {
            int contadorPaisOrigen = 0;
            for (Producto producto : this.productos) {
                if(producto.getPaisOrigen() == paisOrigen)
                {
                    contadorPaisOrigen++;
                }
            }
            System.out.println(paisOrigen + " - " + contadorPaisOrigen);
        }
    }

    public static void main(String[] args)
    {
        Empresa empresa = new Empresa();
        ArrayList<Producto> productos = new ArrayList<>();

        ProductoFresco producto = new ProductoFresco();
        ProductoFresco producto1 = new ProductoFresco();

        ProductoEnvasado producto2 = new ProductoEnvasado();
        ProductoEnvasado producto3 = new ProductoEnvasado();

        empresa.agregarProducto(producto);
        empresa.getProductos().getFirst().mostrarInfoProducto();

        empresa.agregarProducto(producto1);
        empresa.agregarProducto(producto2);
        empresa.agregarProducto(producto3);

        empresa.productosPorPais();


    }
}
