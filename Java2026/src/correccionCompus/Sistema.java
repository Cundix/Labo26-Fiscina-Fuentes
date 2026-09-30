package correccionCompus;

import java.util.ArrayList;

public class Sistema {
    private ArrayList<Venta> ventas;

    public Sistema() {
        this.ventas = new ArrayList<>();
    }

    public ArrayList<Venta> getVentas() {
        return ventas;
    }
    public Venta realizarCompra(Cliente cliente, Computadora computadora, MetodoPago metodoPago) {
        if (cliente == null || computadora == null || metodoPago == null) {
            return null;
        }

        if (!computadora.cumpleCompraMinima()) {
            return null;
        }

        if (!computadora.hayStockDisponible()) {
            return null;
        }

        computadora.descontarStock();

        Venta venta = new Venta(cliente, computadora, metodoPago);
        ventas.add(venta);

        return venta;
    }
    public Componente calcularComponenteMasVendido() {
        ArrayList<Componente> componentesVendidos = new ArrayList<>();
        ArrayList<Integer> cantidades = new ArrayList<>();

        for (Venta venta : ventas) {
            ArrayList<Componente> componentesDeLaVenta = venta.obtenerComponentesVendidos();

            for (Componente componente : componentesDeLaVenta) {
                sumarComponenteVendido(componente, componentesVendidos, cantidades);
            }
        }

        if (componentesVendidos.isEmpty()) {
            return null;
        }

        int posicionMayor = buscarPosicionMayor(cantidades);
        return componentesVendidos.get(posicionMayor);
    }
    public void mostrarComponenteMasVendido() {
        Componente componente = calcularComponenteMasVendido();

        if (componente == null) {
            System.out.println("Todavía no hay componentes vendidos.");
        } else {
            System.out.println("componentes.Componente más vendido: " + componente.getNombreComercial());
        }
    }
    private void sumarComponenteVendido(Componente componente,
                                        ArrayList<Componente> componentesVendidos,
                                        ArrayList<Integer> cantidades) {
        int posicion = buscarPosicionComponente(componentesVendidos, componente);

        if (posicion == -1) {
            componentesVendidos.add(componente);
            cantidades.add(1);
        } else {
            int cantidadActual = cantidades.get(posicion);
            cantidades.set(posicion, cantidadActual + 1);
        }
    }

    private int buscarPosicionComponente(ArrayList<Componente> componentesVendidos,
                                         Componente componente) {
        for (int i = 0; i < componentesVendidos.size(); i++) {
            Componente componenteActual = componentesVendidos.get(i);

            if (componenteActual.esElMismoComponenteQue(componente)) {
                return i;
            }
        }

        return -1;
    }

    private int buscarPosicionMayor(ArrayList<Integer> cantidades) {
        int posicionMayor = 0;

        for (int i = 1; i < cantidades.size(); i++) {
            if (cantidades.get(i) > cantidades.get(posicionMayor)) {
                posicionMayor = i;
            }
        }

        return posicionMayor;
    }
}
