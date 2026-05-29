package ventaComputadoras;

public class Pantalla extends DispositivoSalida {
    public Pantalla() {
        super();
    }

    public Pantalla(String fabricante, String modelo, int stock, float precio, int cantPuertosValidos) {
        super(fabricante, modelo, stock, precio, cantPuertosValidos);
    }
}