package repasoUltimaPrueba2;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;

public class Venta {
    private String idVenta;
    private LocalDate fecha;
    private HashMap<Vendible, Integer> productosComprados;

    public Venta(HashMap<Vendible, Integer> productosComprados) {
        this.fecha = LocalDate.now();
        this.productosComprados = productosComprados;
    }

    public Venta(String idVenta, LocalDate fecha, HashMap<Vendible, Integer> productosComprados) {
        this.idVenta = idVenta;
        this.fecha = fecha;
        this.productosComprados = productosComprados;
    }
}
