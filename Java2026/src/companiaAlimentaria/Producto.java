package companiaAlimentaria;

import fechas.Fecha;

public class Producto {
    String nombre;
    Fecha fechaEnvasado;
    PaisOrigen paisOrigen;
    String codigo;
    String numeroDeLote;
    double precio;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Fecha getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(Fecha fechaVencimiento) {
        this.fechaEnvasado = fechaVencimiento;
    }

    public PaisOrigen getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(PaisOrigen paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNumeroDeLote() {
        return numeroDeLote;
    }

    public void setNumeroDeLote(String numeroDeLote) {
        this.numeroDeLote = numeroDeLote;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
