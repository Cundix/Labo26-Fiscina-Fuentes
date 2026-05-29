package ventaComputadoras;

import java.util.ArrayList;

public class Computadora {
    private CPU cpu;
    private ArrayList<Componente> perifericos = new ArrayList<>();

    public Computadora(CPU cpu, ArrayList<Componente> perifericos) {
        this.cpu = cpu;
        this.perifericos = perifericos;
    }

    public Computadora(CPU cpu) {
        this.cpu = cpu;
        ArrayList<Componente> perifericos = new ArrayList<>();
        perifericos.add(new DispositivoEntrada());
        perifericos.add(new DispositivoSalida());
        this.perifericos = perifericos;
    }

    public Computadora()
    {
        this.cpu = new CPU();
        this.perifericos = new ArrayList<>();
        this.perifericos.add(new Componente());
        this.perifericos.add(new Componente());
    }

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
            if (p instanceof DispositivoEntrada) tieneEntrada = true; //En lugar de hacer instanceof, hay que hacer un metodo en la clase no hecha "perifericos" que overridee un metodo que devuelva cant de puertos i y o.
            if (p instanceof DispositivoSalida) tieneSalida = true;
        }
        return tieneEntrada && tieneSalida;
    }
}