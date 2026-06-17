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
            if(producto.esFresco()) {
                if (producto.getFechaEnvasado().mayorQue(ultimo.getFechaEnvasado())) ultimo = producto;
            }
        }
        return ultimo.getNumeroDeLote();
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

    public void bubbleProductos()
    {
        boolean swapped = false;
        for(int i = 0; i < this.productos.size() -1; i++)
        {
            swapped = false;
            for(int j = 0; j < this.productos.size() -1; j++)
            {
                if(productos.get(j).getPrecio() < productos.get(j+1).getPrecio())
                {
                    swapped = true;

                    Producto p = productos.get(j);
                    productos.set(j, productos.get(j+1));
                    productos.set(j+1, p);
                }
            }
            if(!swapped)
            {
                break;
            }
        }
        for (Producto producto : this.productos) {
            System.out.println(producto.getNumeroDeLote());
        }
    }

    public void mostrarProductos()
    {
        for (Producto producto : this.productos)
        {
            System.out.println(producto.getNumeroDeLote());
        }
    }


    public static void main(String[] args)
    {
        Empresa empresa = new Empresa();
        ArrayList<Producto> productos = new ArrayList<>();

        ProductoFresco producto = new ProductoFresco("1");
        ProductoFresco producto1 = new ProductoFresco("9");

        ProductoEnvasado producto2 = new ProductoEnvasado("5");
        ProductoEnvasado producto3 = new ProductoEnvasado("7");

        empresa.agregarProducto(producto);
        empresa.getProductos().getFirst().mostrarInfoProducto();

        empresa.agregarProducto(producto1);
        empresa.agregarProducto(producto2);
        empresa.agregarProducto(producto3);

        empresa.productosPorPais();

        empresa.mostrarProductos();
        System.out.println("\nORDENADOS\n");
        empresa.bubbleProductos();

    }
}
