package repasoUltimaPrueba2;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public abstract class Preparacion {
    protected int harina;
    protected int azucar;
    protected int manteca;
    protected int huevos;

    protected float precio;
    protected int stock;

    public Preparacion(int harina, int azucar, int manteca, int huevos, float precio, int stock) {
        this.harina = harina;
        this.azucar = azucar;
        this.manteca = manteca;
        this.huevos = huevos;
        this.precio = precio;
        this.stock = stock;
    }

    public boolean validarbasico()
    {
        return !(this.azucar < 0 || this.harina < 0 || this.huevos <0 || this.manteca <0);
    }

    public abstract String conocerReceta();
    public abstract boolean esValida();

    public void sumarAlStock(int cantidad) {
        this.stock+=cantidad;
        System.out.println("El nuevo stock es de " + this.stock);
    }

    public Preparacion(int harina) {
        this.harina = harina;
        this.manteca = 1;
        this.huevos=1;
        this.azucar=1;
    }

    public abstract void agregarse(Sistema sistema);
}


