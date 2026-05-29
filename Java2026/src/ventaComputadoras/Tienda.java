package ventaComputadoras;

import java.util.ArrayList;

public class Tienda {
    private ArrayList<Compra> comprasVendidas = new ArrayList<>();
    private ArrayList<Componente> inventario = new ArrayList<>();

    public void registrarCompra(Cliente cliente, Computadora computadora, MetodoDePago pago) {
        if (!computadora.esValida()) {
            return;
        }

        if (computadora.getCpu().getStock() < 1) {
            return;
        }

        for (Componente p : computadora.getPerifericos()) {
            if (p.getStock() < 1) {
                return;
            }
        }

        computadora.getCpu().descontarStock(1);
        for (Componente p : computadora.getPerifericos()) {
            p.descontarStock(1);
        }

        Compra nuevaCompra = new Compra(cliente, computadora, pago);
        comprasVendidas.add(nuevaCompra);
    }

    public Componente calcularComponenteMasVendido() {
        if (comprasVendidas.isEmpty()) {
            return null;
        }

        // 1. Agrupamos TODOS los componentes vendidos (CPUs y periféricos) en una sola lista
        ArrayList<Componente> todosLosComponentes = new ArrayList<>();

        for (Compra c : comprasVendidas) {
            todosLosComponentes.add(c.getComputadora().getCpu());
            for (Componente p : c.getComputadora().getPerifericos()) {
                todosLosComponentes.add(p);
            }
        }

        // 2. Buscamos cuál se repite más usando dos ciclos 'for'
        Componente masVendido = null;
        int maxVentas = 0;

        for (int i = 0; i < todosLosComponentes.size(); i++) {
            Componente actual = todosLosComponentes.get(i);
            int contadorVentas = 0;

            // Comparamos el componente actual con todos los demás de la lista
            for (int j = 0; j < todosLosComponentes.size(); j++) {
                if (todosLosComponentes.get(j) == actual) {
                    contadorVentas++;
                }
            }

            // Si este componente se vendió más veces que el máximo anterior, lo guardamos
            if (contadorVentas > maxVentas) {
                maxVentas = contadorVentas;
                masVendido = actual;
            }
        }

        return masVendido;
    }
}