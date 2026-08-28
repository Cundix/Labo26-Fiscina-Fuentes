package sistBebidas;

public abstract class Bebida
{
    private String nombre;
    private double positiveQ;
    private double negativeQ;

    public Bebida(String nombre, double positiveQ, double negativeQ) {
        this.nombre = nombre;
        this.positiveQ = positiveQ;
        this.negativeQ = negativeQ;
    }

    public Bebida(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPositiveQ() {
        return positiveQ;
    }

    public void setPositiveQ(double positiveQ) {
        this.positiveQ = positiveQ;
    }

    public double getNegativeQ() {
        return negativeQ;
    }

    public void setNegativeQ(double negativeQ) {
        this.negativeQ = negativeQ;
    }

    public double calcularQ()
    {
        return positiveQ - negativeQ;
    }
}
