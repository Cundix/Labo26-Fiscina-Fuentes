package interfacesEj1;

import java.time.LocalDate;
import java.time.Year;
import java.util.HashMap;

public class Libro extends Legible implements Prestable
{
    private HashMap<Integer, Integer> paginasCapitulo;

    public Libro(int codigo, String titulo, Year añoPublicacion, HashMap<Integer, Integer> paginasCapitulo)
    {
        super(codigo, titulo, añoPublicacion);
        this.paginasCapitulo = paginasCapitulo;
    }

    public HashMap<Integer, Integer> getPaginasCapitulo() {
        return paginasCapitulo;
    }

    public int cantidadCapitulos()
    {
        return paginasCapitulo.size();
    }

    public void setPaginasCapitulo(HashMap<Integer, Integer> paginasCapitulo) {
        this.paginasCapitulo = paginasCapitulo;
    }

    @Override
    public String toString() {
        return "Libro{" +
                super.toString() +
                ", paginasCapitulo=" + paginasCapitulo +
                '}';
    }

    @Override
    public void prestar() throws IllegalArgumentException
    {
        if(puedePrestarse())
        {
            System.out.println("El Libro se dará Prestado");
            setPrestado(true);
        }
        else throw new IllegalArgumentException();
    }

    @Override
    public boolean puedePrestarse()
    {
        return (!super.isPrestado() && (cantidadCapitulos() % 2) != 0);
    }

    @Override
    public void devolver()
    {
        this.setPrestado(false);
    }


}
