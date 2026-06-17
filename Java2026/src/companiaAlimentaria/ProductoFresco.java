package companiaAlimentaria;

public class ProductoFresco extends Producto {

    public ProductoFresco(String lote)
    {
        super(lote);
    }
    @Override
    public boolean esFresco() {
        return true;
    }


}
