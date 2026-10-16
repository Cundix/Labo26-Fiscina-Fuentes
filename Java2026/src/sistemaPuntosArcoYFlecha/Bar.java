package sistemaPuntosArcoYFlecha;

import java.util.HashSet;

public class Bar {
    private HashSet<Diana> dianasBar;
    private int cantidadClientes;
    private double recaudacion;
    private HashSet<Beneficio> beneficios;
    private HashSet<Beneficio> acumulables;


    public Bar(HashSet<Diana> dianasBar, int cantidadClientes, double recaudacion, HashSet<Beneficio> beneficios, HashSet<Beneficio> acumulables) {
        this.dianasBar = dianasBar;
        this.cantidadClientes = cantidadClientes;
        this.recaudacion = recaudacion;
        this.beneficios = beneficios;
        this.acumulables = acumulables;
    }

    public HashSet<Diana> getDianasBar() {
        return dianasBar;
    }

    public void setDianasBar(HashSet<Diana> dianasBar) {
        this.dianasBar = dianasBar;
    }

    public int getCantidadClientes() {
        return cantidadClientes;
    }

    public void setCantidadClientes(int cantidadClientes) {
        this.cantidadClientes = cantidadClientes;
    }

    public double getRecaudacion() {
        return recaudacion;
    }

    public void setRecaudacion(double recaudacion) {
        this.recaudacion = recaudacion;
    }

    public HashSet<Beneficio> getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(HashSet<Beneficio> beneficios) {
        this.beneficios = beneficios;
    }

    public HashSet<Beneficio> getAcumulables() {
        return acumulables;
    }

    public void setAcumulables(HashSet<Beneficio> acumulables) {
        this.acumulables = acumulables;
    }

    public void cantidadBeneTragos() {
        int cantidad = 0;

        for (Beneficio beneficio : beneficios) {
            if (!(beneficio instanceof Acumulable)) {
                cantidad++;
            }
        }

    }

    public Diana dianaConMasValores() {
        Diana diana = null;
        for (Diana dianaBar : dianasBar) {
            if (diana == null || diana.cantidadPuntajes() < dianaBar.cantidadPuntajes()) {
                diana = dianaBar;
            }
        }
        return diana;
    }
}

