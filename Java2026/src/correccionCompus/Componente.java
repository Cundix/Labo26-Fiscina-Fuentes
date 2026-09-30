package correccionCompus;

public class Componente {
    private String fabricante;
    private String modelo;
    private double precio;
    private int stock;

    public Componente(String fabricante, String modelo, double precio, int stock) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.precio = precio;
        this.stock = stock;
    }

    public String getFabricante() {
        return fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public void aplicarAumento(double porcentaje) {
        precio = precio + precio * porcentaje / 100;
    }

    public boolean tieneStock(int cantidad) {
        return stock >= cantidad;
    }

    public boolean reducirStock(int cantidad) {
        if (!tieneStock(cantidad)) {
            return false;
        }

        stock = stock - cantidad;
        return true;
    }

    public boolean esElMismoComponenteQue(Componente otroComponente) {
        return fabricante.equalsIgnoreCase(otroComponente.getFabricante())
                && modelo.equalsIgnoreCase(otroComponente.getModelo());
    }

    public String getNombreComercial() {
        return fabricante + " " + modelo;
    }

    public String obtenerDetalle() {
        return getNombreComercial() + " - $" + precio;
    }
}
