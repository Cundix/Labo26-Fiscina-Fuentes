package companiaAlimentaria;

import fechas.Fecha;

public class Producto {
    private String nombre;
    private Fecha fechaEnvasado;
    private PaisOrigen paisOrigen;
    private String codigo;
    private String numeroDeLote;
    private TablaNutricional tablaNutricional;
    double precio;

    public Producto(String nombre, Fecha fechaEnvasado, PaisOrigen paisOrigen, String codigo, String numeroDeLote, TablaNutricional tablaNutricional, double precio) {
        this.nombre = nombre;
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
        this.codigo = codigo;
        this.numeroDeLote = numeroDeLote;
        this.tablaNutricional = tablaNutricional;
        this.precio = precio;
    }

    public Producto()
    {
        this.nombre = "";
        this.fechaEnvasado = new Fecha();
        this.paisOrigen = PaisOrigen.ARGENTINA;
        this.codigo = "";
        this.numeroDeLote = "";
        this.tablaNutricional = new  TablaNutricional();
        this.precio = 0;

    }

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

    public TablaNutricional getTablaNutricional() {
        return tablaNutricional;
    }

    public void setTablaNutricional(TablaNutricional tablaNutricional) {
        this.tablaNutricional = tablaNutricional;
    }

    public TablaNutricional infoNutricional()
    {
        return this.tablaNutricional;
    }

    public void mostrarInfoProducto()
    {
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Precio: " + this.getPrecio());
        System.out.println("Numero de Lote: " + this.numeroDeLote);
        System.out.println("Codigo: " + this.codigo);
    }

    public String infoProducto()
    {
        return ("CÓDIGO: " + this.codigo + " | " + "NÚMERO DE LOTE: " + this.numeroDeLote);
    }

}
