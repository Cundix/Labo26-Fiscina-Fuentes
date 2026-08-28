package sistBebidas;

public class Alcoholicas extends Bebida
{
    private double cantAlcohol;

    public Alcoholicas(String nombre, double cantAlcohol) {
        super(nombre, 0, cantAlcohol * 20);
        this.cantAlcohol = cantAlcohol;
    }
}
