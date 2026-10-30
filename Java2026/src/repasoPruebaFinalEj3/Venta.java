package repasoPruebaFinalEj3;

import java.time.LocalDate;

public class Venta
{
    private Vendible producto;
    private LocalDate fecha;
    private String descripcion;

    public Venta(Vendible producto, LocalDate fecha, String descripcion) {
        this.producto = producto;
        this.fecha = fecha;
        this.descripcion = descripcion;
    }

    public Vendible getProducto() {
        return producto;
    }

    public void setProducto(Vendible producto) {
        this.producto = producto;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
