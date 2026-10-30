package sistemaPuntosArcoYFlecha;

public abstract class Beneficio
{
    private String nombre;
    private String usuarioCreador;

    public Beneficio(String nombre, String usuarioCreador) {
        this.nombre = nombre;
        this.usuarioCreador = usuarioCreador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuarioCreador() {
        return usuarioCreador;
    }

    public void setUsuarioCreador(String usuarioCreador) {
        this.usuarioCreador = usuarioCreador;
    }
}
