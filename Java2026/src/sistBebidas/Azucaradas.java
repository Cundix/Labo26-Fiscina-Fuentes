package sistBebidas;

public class Azucaradas extends Bebida
{
    private double cantAzucar;

    public Azucaradas(String nombre, double cantAzucar) {
        super(nombre, 1, cantAzucar * 10);
        this.cantAzucar = cantAzucar;
    }

    public double getCantAzucar() {
        return cantAzucar;
    }

    public void setCantAzucar(double cantAzucar) {
        this.cantAzucar = cantAzucar;
    }
}
