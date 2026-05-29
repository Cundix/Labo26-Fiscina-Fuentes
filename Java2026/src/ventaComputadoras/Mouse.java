package ventaComputadoras;

public class Mouse extends DispositivoEntrada{
    public Mouse() {super();}

    public Mouse(String fabricante, String modelo, int stock, float precio, String tipoDeConector, int cantPuertosValidos) {
        super(fabricante, modelo, stock, precio, tipoDeConector, cantPuertosValidos);
    }
}
