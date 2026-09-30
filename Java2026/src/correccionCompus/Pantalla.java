package correccionCompus;

import java.util.ArrayList;

public class Pantalla extends Salida {

    public Pantalla(String fabricante, String modelo, double precio, int stock,
                    ArrayList<String> puertosValidos) {
        super(fabricante, modelo, precio, stock, puertosValidos);
    }

    public String getTipo() {
        return "salidas.Pantalla";
    }
}
