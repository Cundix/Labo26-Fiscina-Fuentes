package ventaComputadoras;

public class CPU extends Componente {
    public CPU() {
        super();
    }

    public CPU(String nombre)
    {
        super("Ryzen 5 2400g Radeon Vega 11 Graphix");

    }

    public CPU(String fabricante, String modelo, int stock, float precio) {
        super(fabricante, modelo, stock, precio);
    }
}