package ventaComputadoras;

public abstract class MetodoDePago {
    protected int recargo;

    public MetodoDePago(int recargo) {
        this.recargo = recargo;
    }

    public int getRecargo() {
        return recargo;
    }
}