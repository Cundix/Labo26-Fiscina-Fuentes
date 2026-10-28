package repasoUltimaPrueba2;

import java.sql.PreparedStatement;

public interface Vendible {

    public void actualizarStock(int cantAVender) throws StockInsuficienteException;
    public String descripcionDeVenta();
    public float calcularPrecio(int cantidad);
    public void vender(int cantidad);


}
