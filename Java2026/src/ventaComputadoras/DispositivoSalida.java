package ventaComputadoras;

public class DispositivoSalida extends Componente {
    private int cantPuertosValidos;

    public DispositivoSalida() {
        super();
    }

    public DispositivoSalida(String fabricante, String modelo, int stock, float precio, int cantPuertosValidos) {
        super(fabricante, modelo, stock, precio);
        this.cantPuertosValidos = cantPuertosValidos;
    }

    public int getCantPuertosValidos() {
        return cantPuertosValidos;
    }

    public void setCantPuertosValidos(int cantPuertosValidos) {
        this.cantPuertosValidos = cantPuertosValidos;
    }
}