package ventaComputadoras;

public class Tarjeta extends MetodoDePago {
    private String numeroTarjeta;
    private String banco;
    private String tipo;

    public Tarjeta(String numeroTarjeta, String banco, String tipo) {
        super(5);
        this.numeroTarjeta = numeroTarjeta;
        this.banco = banco;
        this.tipo = tipo;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}