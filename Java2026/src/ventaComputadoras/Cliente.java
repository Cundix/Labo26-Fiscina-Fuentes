package ventaComputadoras;

import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private String apellido;
    private String celular;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Cliente(String nombre, String apellido, String celular) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
    }

    public Cliente() {
        this.nombre = "nombre";
        this.apellido = "apellido";
        this.celular = "celular";
    }

}
