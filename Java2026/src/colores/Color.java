package colores;

public enum Color {

    ROJO( "#123456"), AZUL( "fgfgfgf");

    private String codigo;

    private Color(String codigo)
    {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
