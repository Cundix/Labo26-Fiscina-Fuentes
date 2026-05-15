package objetos;

public class Plato {
    private String nombre;
    private double precio;
    private int cantidadPedidos;

    public Plato(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void incrementarContador() {
        this.cantidadPedidos++;
    }

    public int getCantidadPedidos() {
        return cantidadPedidos;
    }
}

