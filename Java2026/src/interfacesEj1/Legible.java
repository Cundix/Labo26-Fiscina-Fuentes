package interfacesEj1;

import java.time.LocalDate;
import java.time.Year;

public class Legible extends ObjetoPrestar
{
    private int codigo;
    private String titulo;
    private Year añoPublicacion;

    public Legible(int codigo, String titulo, Year fechaPublicacion) {
        super();
        this.codigo = codigo;
        this.titulo = titulo;
        this.añoPublicacion = fechaPublicacion;
    }


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Year getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setFechaPublicacion(Year fechaPublicacion) {
        this.añoPublicacion = fechaPublicacion;
    }

    @Override
    public String toString() {
        return "codigo=" + codigo +
                ", titulo='" + titulo + '\'' +
                ", añoPublicacion=" + añoPublicacion;
    }
}
