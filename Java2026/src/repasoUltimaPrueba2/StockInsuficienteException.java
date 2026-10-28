package repasoUltimaPrueba2;

public class StockInsuficienteException extends RuntimeException {
    private int stock;
    public StockInsuficienteException(String message, int stock) {
        super(message);
        this.stock = stock;
    }
}
