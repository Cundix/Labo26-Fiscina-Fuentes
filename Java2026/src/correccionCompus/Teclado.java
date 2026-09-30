package correccionCompus;

import java.util.ArrayList;

public class Teclado extends Entrada {

    public Teclado(String fabricante, String modelo, double precio, int stock,
                   ArrayList<String> puertosValidos, String tipoConector) {
        super(fabricante, modelo, precio, stock, puertosValidos, tipoConector);
    }

    public String getTipo() {
        return "entradas.Teclado";
    }
}
