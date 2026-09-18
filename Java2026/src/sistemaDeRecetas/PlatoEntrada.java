package sistemaDeRecetas;

import java.util.ArrayList;

public class PlatoEntrada extends Plato
{
    private TipoEntrada tipoEntrada;

    public PlatoEntrada(String nombre, TipoEntrada tipoEntrada) {
        super(nombre);
        this.tipoEntrada = tipoEntrada;
    }

    public PlatoEntrada(String nombre, Dificultad dificultad, ArrayList<String> listaDePasos, TipoEntrada tipoEntrada) {
        super(nombre, dificultad, listaDePasos);
        this.tipoEntrada = tipoEntrada;
    }

    public TipoEntrada getTipoEntrada() {
        return tipoEntrada;
    }

    public void setTipoEntrada(TipoEntrada tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }

    @Override
    public void mostrarListaDePasos()
    {
        if(this.tipoEntrada.equals(TipoEntrada.CALIENTE))
        {
            System.out.println("PRENDÉ EL HORNO!!!!");
            this.verPasos();
            return;
        }
        this.verPasos();
        System.out.println("- GUARDAR EN LA HELDADERA");
    }

    @Override
    public String returnPlatoType()
    {
        return "PLATO ENTRADA";
    }
}
