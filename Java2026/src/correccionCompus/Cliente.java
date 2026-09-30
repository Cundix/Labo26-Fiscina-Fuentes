package correccionCompus;

public class Cliente {
    private String nombre;
    private String apellido;
    private String celular;

    public Cliente(String nombre, String apellido, String celular) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
    }

    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }

    public String getCelular() {
        return celular;
    }
}
