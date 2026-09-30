package correccionCompus;

import java.util.ArrayList;

public class Periferico extends Componente {
    private ArrayList<String> puertosValidos;

    public Periferico(String fabricante, String modelo, double precio, int stock,
                      ArrayList<String> puertosValidos) {
        super(fabricante, modelo, precio, stock);
        this.puertosValidos = puertosValidos;
    }

    public ArrayList<String> getPuertosValidos() {
        return puertosValidos;
    }

    public int cantidadPuertosValidos() {
        return puertosValidos.size();
    }

    public int cantidadEntrada() {
        return 0;
    }

    public int cantidadSalida() {
        return 0;
    }

    public String getTipo() {
        return "Periférico";
    }

    public String obtenerDetalle() {
        return getTipo() + ": " + getNombreComercial()
                + " - $" + getPrecio()
                + " - Puertos válidos: " + cantidadPuertosValidos();
    }
}
