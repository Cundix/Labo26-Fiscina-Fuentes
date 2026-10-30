package repasoUltimaPrueba2;

import java.time.LocalDate;
import java.util.zip.CheckedInputStream;

public abstract class PreparacionVendible extends Preparacion implements Vendible{

    public PreparacionVendible(int harina, int azucar, int manteca, int huevos, float precio, int stock) {
        super(harina, azucar, manteca, huevos, precio, stock);
    }

    public PreparacionVendible(int harina) {
        super(harina);
    }

    public abstract boolean validar();

    @Override
    public boolean esValida() {
        if(this.validarbasico() && this.validar())
        {
            System.out.println("receta es valida");
            return true;
        }
        else
        {
            System.out.println("Receta invalida");
            return false;
        }
    }

    @Override
    public void actualizarStock() throws StockInsuficienteException {

    }

    @Override
    public String descripcionDeVenta() {
        return "";
    }

    @Override
    public float calcularPrecio(int cantidad) {
        return 0;
    }

    @Override
    public float vender(int cantidad) throws StockInsuficienteException {
        return 0;
    }

    @Override
    public void chequearStock(int cantidadMinima) throws StockInsuficienteException
    {
        if(this.stock < cantidadMinima) throw new StockInsuficienteException("No hay fuficiente stock del producto " + this.toString());
        else return;//esto no hace falta JSDJASJDJ, si no entra en el if termina por
    }




}
