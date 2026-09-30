package correccionCompus;

public class Tarjeta extends MetodoPago {
    private String numeroTarjeta;
    private String banco;
    private String tipoTarjeta;

    public Tarjeta(String numeroTarjeta, String banco, String tipoTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
        this.banco = banco;
        this.tipoTarjeta = tipoTarjeta;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public String getBanco() {
        return banco;
    }

    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    public double calcularRecargo(double subtotal) {
        return subtotal * 0.05;
    }

    public String obtenerDetalle() {
        return "Tarjeta " + tipoTarjeta + " del banco " + banco;
    }
}
