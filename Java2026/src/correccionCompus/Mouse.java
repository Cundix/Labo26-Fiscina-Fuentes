package correccionCompus;

import java.util.ArrayList;

public class Mouse extends Entrada {

    public Mouse(String fabricante, String modelo, double precio, int stock,
                 ArrayList<String> puertosValidos, String tipoConector) {
        super(fabricante, modelo, precio, stock, puertosValidos, tipoConector);
    }
}
