package ventaComputadoras;

import java.util.ArrayList;

public class Computadora {
    private CPU cpu;
    private ArrayList<Componente> perifericos = new ArrayList<>();

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public ArrayList<Componente> getPerifericos() {
        return perifericos;
    }

    public void agregarPeriferico(Componente p) {
        perifericos.add(p);
    }

    public float calcularSubtotal() {
        float subtotal = (cpu != null) ? cpu.getPrecio() : 0;
        for (Componente p : perifericos) {
            subtotal += p.getPrecio();
        }
        return subtotal;
    }

    public boolean esValida() {
        if (this.cpu == null) return false;

        boolean tieneEntrada = false;
        boolean tieneSalida = false;

        for (Componente p : perifericos) {
            if (p instanceof DispositivoEntrada) tieneEntrada = true;
            if (p instanceof DispositivoSalida) tieneSalida = true;
        }
        return tieneEntrada && tieneSalida;
    }
}