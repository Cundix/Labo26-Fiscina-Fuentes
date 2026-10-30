package repasoPruebaFinalEj3;

public class Bizcochuelo extends Preparacion
{
    private int limon;
    private int polvoHornear;

    public Bizcochuelo(int stock, int harina, int azucar, int manteca, int huevos, float precioUnitario, int limon, int polvoHornear) {
        super(stock, harina, azucar, manteca, huevos, precioUnitario);
        this.limon = limon;
        this.polvoHornear = polvoHornear;
    }

    public int getLimon() {
        return limon;
    }

    public void setLimon(int limon) {
        this.limon = limon;
    }

    public int getPolvoHornear() {
        return polvoHornear;
    }

    public void setPolvoHornear(int polvoHornear) {
        this.polvoHornear = polvoHornear;
    }

    @Override
    public void conocerReceta()
    {
        System.out.println("El bizcochuelo arranca con...");
    }
}
