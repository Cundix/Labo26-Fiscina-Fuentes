package repasoUltimaPrueba2;

import java.sql.PreparedStatement;

public interface Vendible {

    public void actualizarStock();
    public String descripcionDeVenta();
    public float calcularPrecio(int cantidad);
    public float vender(int cantidad) throws StockInsuficienteException;

    public void chequearStock() throws StockInsuficienteException;


}
