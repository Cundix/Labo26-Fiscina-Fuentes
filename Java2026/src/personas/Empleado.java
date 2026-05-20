package personas;

import fechas.Fecha;

public class Empleado extends Persona {

    private String numeroTelefono;
    private int codigoPais;

    public Empleado(String numeroTelefono, String pais, String provincia)
    {
        super(pais, provincia);
        this.numeroTelefono = numeroTelefono;
    }

    public Empleado()
    {
        super("Argentina", "Buenos Aires");
        this.numeroTelefono = "11-7366-9228";
        this.codigoPais = 12345;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public int getCodigoPais() {
        return codigoPais;
    }

    public void setCodigoPais(int codigoPais) {
        this.codigoPais = codigoPais;
    }
}
