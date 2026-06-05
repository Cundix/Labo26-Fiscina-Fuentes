package ventaElectronica;

public class Producto {
    private String nombre;
    private int precio;
    private int stock;
    Seccion seccion;

    public Producto(String nombre, int precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public Producto(String nombre, int precio)
    {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = 1;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean esDeLaSeccion(Seccion seccion)
    {
        if(this.seccion==seccion)
        {
            return true;
        }
        return false;
    }

    public void mostrarProducto()
    {
        System.out.println("Nombre: "+this.nombre + " | Precio: "+this.precio + " | Stock: "+this.stock + " | Seccion: "+this.seccion);
    }
}
