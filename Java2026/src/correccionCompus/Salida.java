package correccionCompus;

import componentes.Periferico;

import java.util.ArrayList;

public class Salida extends Periferico {

    public Salida(String fabricante, String modelo, double precio, int stock,
                  ArrayList<String> puertosValidos) {
        super(fabricante, modelo, precio, stock, puertosValidos);
    }
    public int cantidadSalida() {
        return 1;
    }
}
