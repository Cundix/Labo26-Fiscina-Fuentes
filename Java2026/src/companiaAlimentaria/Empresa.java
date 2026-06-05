package companiaAlimentaria;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Empresa {
    private ArrayList<Producto> productos;

    public Empresa(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public Empresa() {
        this.productos = new ArrayList<Producto>();
    }

    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
    }

    public void mostrarInfoProducto(Producto producto) {
        System.out.println("Nombre: " + producto.getNombre());
        System.out.println("Precio: " + producto.getPrecio());
        System.out.println("Numero de Lote: " + producto.numeroDeLote);
        System.out.println("Codigo: " + producto.codigo);
    }

    public Producto productoMasRecientementeEnvasado() {
        Producto ultimo = this.productos.get(0);
        for (Producto producto : this.productos) {
            if (producto.getFechaEnvasado().mayorQue(ultimo.getFechaEnvasado())) ultimo = producto;
        }
        return ultimo;
    }
}
