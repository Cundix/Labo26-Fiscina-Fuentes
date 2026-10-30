package repasoPruebaFinalEj3;

import java.util.HashMap;

public abstract class Preparacion
{
    private int stock;
    private int harina;
    private int azucar;
    private int manteca;
    private int huevos;

    private float precioUnitario;

    public Preparacion(int stock, int harina, int azucar, int manteca, int huevos, float precioUnitario) {
        this.stock = stock;
        this.harina = harina;
        this.azucar = azucar;
        this.manteca = manteca;
        this.huevos = huevos;
        this.precioUnitario = precioUnitario;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getHarina() {
        return harina;
    }

    public void setHarina(int harina) {
        this.harina = harina;
    }

    public int getAzucar() {
        return azucar;
    }

    public void setAzucar(int azucar) {
        this.azucar = azucar;
    }

    public int getManteca() {
        return manteca;
    }

    public void setManteca(int manteca) {
        this.manteca = manteca;
    }

    public int getHuevos() {
        return huevos;
    }

    public void setHuevos(int huevos) {
        this.huevos = huevos;
    }

    public float getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(float precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public abstract void conocerReceta();

    public void restarStock(int cantidad)
    {
        stock -= cantidad;
    }

    public boolean stockValido()
    {
        return stock >= 0;
    }

    public void reponerStock(int cantidad) throws CantidadInvalidaException
    {
        if(cantidad < 0){ throw new CantidadInvalidaException("CantidadInvalida");}
        stock += cantidad;
    }
}
