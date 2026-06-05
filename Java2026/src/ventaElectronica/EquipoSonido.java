package ventaElectronica;

public class EquipoSonido extends ProductoMultimedia{
    private boolean bluetooth;
    public EquipoSonido(boolean bluetooth, String nombre, int precio)
    {
        super(nombre, precio);
        this.bluetooth = bluetooth;
    }
}
