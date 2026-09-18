package sistemaDeRecetas;

import java.util.ArrayList;

public class PlatoPrincipal extends Plato
{
    private int tiempoDeCoccionEnMinutos;
    private int numeroComensal;


    public PlatoPrincipal(String nombre) {
        super(nombre);
    }

    public PlatoPrincipal(String nombre, Dificultad dificultad, ArrayList<String> listaDePasos) {
        super(nombre, dificultad, listaDePasos);
    }

    public int getTiempoDeCoccionEnMinutos() {
        return tiempoDeCoccionEnMinutos;
    }

    public void setTiempoDeCoccionEnMinutos(int tiempoDeCoccionEnMinutos) {
        this.tiempoDeCoccionEnMinutos = tiempoDeCoccionEnMinutos;
    }

    public int getNumeroComensal() {
        return numeroComensal;
    }

    public void setNumeroComensal(int numeroComensal) {
        this.numeroComensal = numeroComensal;
    }

    @Override
    public void mostrarListaDePasos() {
        System.out.println("El tiempo de coccion para este plato es: " +  this.getTiempoDeCoccionEnMinutos());
        this.verPasos();
    }

    @Override
    public String returnPlatoType()
    {
        return "PLATO PRINCIPAL";
    }
}
