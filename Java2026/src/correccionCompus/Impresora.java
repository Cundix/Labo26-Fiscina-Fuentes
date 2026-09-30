package correccionCompus;

import java.util.ArrayList;

public class Impresora extends Salida {
    private String metodoImpresion;

    public Impresora(String fabricante, String modelo, double precio, int stock,
                     ArrayList<String> puertosValidos, String metodoImpresion) {
        super(fabricante, modelo, precio, stock, puertosValidos);
        this.metodoImpresion = metodoImpresion;
    }

    public String getMetodoImpresion() {
        return metodoImpresion;
    }

    public String obtenerDetalle() {
        return super.obtenerDetalle()
                + " - Método de impresión: " + metodoImpresion;
    }
}
