package interfacesEj1;

import java.time.LocalDate;
import java.time.Year;

public class Revista extends Legible implements Prestable
{
    private LocalDate fechaPublicacion;

    public Revista(int codigo, String titulo, Year añoPublicacion, LocalDate fechaPublicacion1)
    {
        super(codigo, titulo, añoPublicacion);
        this.fechaPublicacion = fechaPublicacion1;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    @Override
    public String toString() {
        return "Revista{" +
                super.toString() +
                ", fechaPublicacion=" + fechaPublicacion +
                '}';
    }

    @Override
    public void prestar() throws IllegalArgumentException
    {
        if(puedePrestarse())
        {
            System.out.println("La Revista se dará Prestado");
            setPrestado(true);
        }
        else throw new IllegalArgumentException();
    }

    @Override
    public boolean puedePrestarse()
    {
        return (!super.isPrestado() && fechaPublicacion.getMonthValue() < LocalDate.now().getMonthValue() - 2);
    }

    @Override
    public void devolver()
    {
        this.setPrestado(false);
    }

}
