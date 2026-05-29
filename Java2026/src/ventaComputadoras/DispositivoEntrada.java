package ventaComputadoras;

public class DispositivoEntrada extends Componente{
    private String tipoDeConector;
    private int cantPuertosValidos;

    public String getTipoDeConector() {
        return tipoDeConector;
    }

    public void setTipoDeConector(String tipoDeConector) {
        this.tipoDeConector = tipoDeConector;
    }

    public int getCantPuertosValidos() {
        return cantPuertosValidos;
    }

    public void setCantPuertosValidos(int cantPuertosValidos) {
        this.cantPuertosValidos = cantPuertosValidos;
    }

    public DispositivoEntrada() {
    }

    public DispositivoEntrada(String fabricante, String modelo, int stock, float precio, String tipoDeConector, int cantPuertosValidos) {
        super(fabricante, modelo, stock, precio);
        this.tipoDeConector = tipoDeConector;
        this.cantPuertosValidos = cantPuertosValidos;
    }
}
