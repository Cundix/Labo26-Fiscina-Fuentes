package ventaComputadoras;

public class Componente {
    private String fabricante;
    private String modelo;
    private int stock;
    private float precio;

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public Componente()
    {
        this.fabricante = "x";
        this.modelo = "x";
        this.stock = 1;
        this.precio = 1;
    }
    public Componente(String nombre)
    {
        this.fabricante = "x";
        this.modelo = nombre;
        this.stock = 10;
        this.precio = 100;
    }

    public Componente(String fabricante, String modelo, int stock, float precio) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.stock = stock;
        this.precio = precio;
    }

    public void actualizarPrecio(int porcetaje)
    {
        this.precio += this.precio * porcetaje / 100;
    }

    public void descontarStock(int cantidad)
    {
        this.stock -= cantidad;
    }
}
