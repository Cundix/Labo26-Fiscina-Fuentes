package correccionCompus;

public class CPU extends Componente {
    public CPU(String fabricante, String modelo, double precio, int stock) {
        super(fabricante, modelo, precio, stock);
    }

    public String obtenerDetalle() {
        return "componentes.CPU: " + super.obtenerDetalle();
    }
}
