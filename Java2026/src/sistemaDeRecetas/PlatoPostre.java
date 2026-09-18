package sistemaDeRecetas;

import java.util.ArrayList;

public class PlatoPostre extends Plato
{
    private int temperaturaHorno;
    private boolean aptoDiabeticos;

    public PlatoPostre(String nombre, int temperaturaHorno, boolean aptoDiabeticos) {
        super(nombre);
        this.temperaturaHorno = temperaturaHorno;
        this.aptoDiabeticos = aptoDiabeticos;
    }

    public PlatoPostre(String nombre, Dificultad dificultad, ArrayList<String> listaDePasos, int temperaturaHorno, boolean aptoDiabeticos) {
        super(nombre, dificultad, listaDePasos);
        this.temperaturaHorno = temperaturaHorno;
        this.aptoDiabeticos = aptoDiabeticos;
    }

    public int getTemperaturaHorno() {
        return temperaturaHorno;
    }

    public void setTemperaturaHorno(int temperaturaHorno) {
        this.temperaturaHorno = temperaturaHorno;
    }

    public boolean isAptoDiabeticos() {
        return aptoDiabeticos;
    }

    public void setAptoDiabeticos(boolean aptoDiabeticos) {
        this.aptoDiabeticos = aptoDiabeticos;
    }

    @Override
    public void mostrarListaDePasos() {
        int i = 1;
        for(String paso : this.getListaDePasos())
        {
            System.out.println(i + "- " + paso);
            System.out.println("MANTENER COCINA LIMPIA Y HORNO AL MINIMO");
            i++;
        }
    }

    @Override
    public String returnPlatoType()
    {
        return "PLATO POSTRE";
    }
}
