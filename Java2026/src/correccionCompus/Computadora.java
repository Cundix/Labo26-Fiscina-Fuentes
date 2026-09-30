package correccionCompus;

import java.util.ArrayList;

public class Computadora {
    private CPU cpu;
    private ArrayList<Periferico> perifericos;
    public Computadora(CPU cpu) {
        this.cpu = cpu;
        this.perifericos = new ArrayList<>();
    }
    public CPU getCpu() {
        return cpu;
    }
    public ArrayList<Periferico> getPerifericos() {
        return perifericos;
    }
    public boolean agregarPeriferico(Periferico periferico) {
        if (periferico == null) {
            return false;
        }

        perifericos.add(periferico);
        return true;
    }
    public double calcularPrecioNeto() {
        double total = cpu.getPrecio();

        for (Periferico periferico : perifericos) {
            total = total + periferico.getPrecio();
        }

        return total;
    }

    public int cantidadDispositivosEntrada() {
        int contador = 0;

        for (Periferico periferico : perifericos) {
            contador = contador + periferico.cantidadEntrada();
        }

        return contador;
    }

    public int cantidadDispositivosSalida() {
        int contador = 0;

        for (Periferico periferico : perifericos) {
            contador = contador + periferico.cantidadSalida();
        }

        return contador;
    }

    public boolean cumpleCompraMinima() {
        return cpu != null
                && cantidadDispositivosEntrada() >= 1
                && cantidadDispositivosSalida() >= 1;
    }

    public boolean hayStockDisponible() {
        if (!cpu.tieneStock(1)) {
            return false;
        }
        for (Periferico periferico : perifericos) {
            if (!periferico.tieneStock(1)) {
                return false;
            }
        }
        return true;
    }

    public void descontarStock() {
        cpu.reducirStock(1);

        for (Periferico periferico : perifericos) {
            periferico.reducirStock(1);
        }
    }
    public ArrayList<Componente> obtenerComponentes() {
        ArrayList<Componente> componentes = new ArrayList<>();

        componentes.add(cpu);

        for (Periferico periferico : perifericos) {
            componentes.add(periferico);
        }

        return componentes;
    }
    public void mostrarDetalleComponentes() {
        System.out.println(cpu.obtenerDetalle());

        for (Periferico periferico : perifericos) {
            System.out.println(periferico.obtenerDetalle());
        }
    }
}
