package correccionCompus;

import componentes.Periferico;

import java.util.ArrayList;

public class Entrada extends Periferico {
    private String tipoConector;
    public Entrada(String fabricante, String modelo, double precio, int stock,
                   ArrayList<String> puertosValidos, String tipoConector) {
        super(fabricante, modelo, precio, stock, puertosValidos);
        this.tipoConector = tipoConector;
    }
    public String getTipoConector() {
        return tipoConector;
    }

    public int cantidadEntrada() {
        return 1;
    }

    public String obtenerDetalle() {
        return super.obtenerDetalle()
                + " - Tipo de conector: " + tipoConector;
    }
}
