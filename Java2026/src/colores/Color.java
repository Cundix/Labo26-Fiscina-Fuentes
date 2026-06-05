package colores;

public enum Color {

    ROJO("ROJO", "#123456"), AZUL("AZUL", "fgfgfgf");

    private String nombre;
    private String codigo;

    private Color(String nombre, String codigo)
    {
        this.nombre = nombre;
        this.codigo = codigo;
    }


}
