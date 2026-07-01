package SistemaDeRecetas;

import java.util.ArrayList;

public abstract class Plato
{
    private String nombre;
    private Dificultad dificultad;
    private ArrayList<String> listaDePasos;

    public Plato(String nombre)
    {
        dificultad = Dificultad.FACIL;
        this.nombre = nombre;
        listaDePasos = new ArrayList<String>();


    }

    public Plato(String nombre, Dificultad dificultad, ArrayList<String> listaDePasos) {
        this.nombre = nombre;
        this.dificultad = dificultad;
        this.listaDePasos = listaDePasos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Dificultad getDificultad() {
        return dificultad;
    }

    public void setDificultad(Dificultad dificultad) {
        this.dificultad = dificultad;
    }

    public ArrayList<String> getListaDePasos() {
        return listaDePasos;
    }

    public void setListaDePasos(ArrayList<String> listaDePasos) {
        this.listaDePasos = listaDePasos;
    }

    public void verPasos()
    {
        int i = 1;
        for(String paso : listaDePasos)
        {
            System.out.println(i + "- " + paso);
            i++;
        }
    }

    public abstract void mostrarListaDePasos();

    public void agregarPasos(ArrayList<String> listaDePasos)
    {
        this.listaDePasos.addAll(listaDePasos);
    }

    public void agregarPaso(String paso)
    {
        this.listaDePasos.add(paso);
    }

    public void eliminarPaso(int pos)
    {
        this.listaDePasos.remove(pos);
    }

    public void modificarReceta(ArrayList<String> listaDePasos)
    {
        this.setListaDePasos(listaDePasos);
    }

    public abstract String returnPlatoType();

    public int cantidadPasos()
    {
        return this.listaDePasos.size();
    }

    public Plato masPasosQue(Plato plato)
    {
        if(this.cantidadPasos()>plato.cantidadPasos())
        {
            return plato;
        }

        return this;
    }

}
