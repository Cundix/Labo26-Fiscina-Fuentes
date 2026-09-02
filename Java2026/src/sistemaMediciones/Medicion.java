package sistemaMediciones;

public class Medicion
{
    private double pesoKg;
    private double alturaCm;

    public Medicion(double pesoKg, double alturaCm) {
        this.pesoKg = pesoKg;
        this.alturaCm = alturaCm;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(double pesoKg) {
        this.pesoKg = pesoKg;
    }

    public double getAlturaCm() {
        return alturaCm;
    }

    public void setAlturaCm(double alturaCm) {
        this.alturaCm = alturaCm;
    }

}
