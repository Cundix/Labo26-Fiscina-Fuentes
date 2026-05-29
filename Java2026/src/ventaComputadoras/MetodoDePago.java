package ventaComputadoras;

public abstract class MetodoDePago {
    private int recargo;

    public MetodoDePago(int recargo) {
        this.recargo = recargo;
    }

    public MetodoDePago() {
        this.recargo = 0;
    }

    public int getRecargo() {
        return recargo;
    }
}