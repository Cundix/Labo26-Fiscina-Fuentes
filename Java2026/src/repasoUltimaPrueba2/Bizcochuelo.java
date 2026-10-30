package repasoUltimaPrueba2;

public class Bizcochuelo extends Preparacion{
    private int limon;
    private int polvoHornear;

    public Bizcochuelo(int harina, int limon) {
        super(harina);
        this.limon = limon;
        this.polvoHornear = 0;
    }

    @Override
    public void agregarse(Sistema sistema) {
        sistema.agregarNoVendible(this);
    }

    public Bizcochuelo(int harina, int azucar, int manteca, int huevos, float precio, int stock, int limon, int polvoHornear) {
        super(harina, azucar, manteca, huevos, precio, stock);
        this.limon = limon;
        this.polvoHornear = polvoHornear;
    }

    @Override
    public String conocerReceta() {
        return "Partir los huevos";
    }

    @Override
    public boolean esValida() {

        if(this.validarbasico() && this.limon >= 0 && this.polvoHornear >= 0)
        {
            System.out.println("receta valida");
            return true;
        }
        else
        {
            System.out.println("Receta invalida");
            return false;
        }
    }
}
