package SistemaDeRecetas;

import java.util.ArrayList;

public class SistemaRecetas {
    ArrayList<Plato> listaDePlatos;

    public void agregarReceta(Plato plato)
    {
        if(listaDePlatos.contains(plato))
        {
            listaDePlatos.add(plato);
            System.out.println("Plato Agregado");
        }
    }

    public void eliminarReceta(Plato plato)
    {
        listaDePlatos.remove(plato);
    }

    public void modificarReceta(Plato plato, int index)
    {
        listaDePlatos.set(index, plato);
    }

    public ArrayList<Plato> buscarPlatosPorDificultad(Dificultad dificultad)
    {

        ArrayList<Plato> lista = new ArrayList<>();
        for (Plato plato : listaDePlatos) {
            if (plato.getDificultad().equals(dificultad)) {
                lista.add(plato);
            }
        }
        return lista;
    }

    public int cantidadRecetas()
    {
        return listaDePlatos.size();
    }

    public Plato platoConMayorCantidadDePasos()
    {
        Plato platito = listaDePlatos.getFirst();
        for (Plato plato : listaDePlatos)
        {
            platito = platito.masPasosQue(plato);
        }
        return platito;
    }

    public ArrayList<Plato> filtrarPorTipo(String tipoPlato)
    {
        ArrayList<Plato> lista = new ArrayList<>();

        for (Plato plato : listaDePlatos)
        {
            if(plato.returnPlatoType().toLowerCase().equals(tipoPlato))
            {
                lista.add(plato);
            }
        }

        return lista;
    }

    public void devolverNombres(ArrayList<Plato> lista)
    {
        for (Plato plato : lista)
        {
            System.out.println(plato.getNombre() + " - " +  plato.getDificultad());
        }
    }


    static void main()
    {
        SistemaRecetas sistema = new SistemaRecetas();

        PlatoEntrada plato1 = new PlatoEntrada("Entrada1", Dificultad.MEDIO, new ArrayList<>(), TipoEntrada.FRIA);
        PlatoEntrada plato2 = new PlatoEntrada("Entrada2", Dificultad.FACIL, new ArrayList<>(), TipoEntrada.CALIENTE);

        PlatoPostre plato3 = new PlatoPostre("Postre1", Dificultad.AVANZADO, new ArrayList<>(), 75, true);
        PlatoPostre plato4 = new PlatoPostre("Postre2", Dificultad.FACIL, new ArrayList<>(), 85, false);

        PlatoPrincipal plato5 = new PlatoPrincipal("Principal1", Dificultad.FACIL, new ArrayList<>());
        PlatoPrincipal plato6 = new PlatoPrincipal("Principal2", Dificultad.MEDIO, new ArrayList<>());

        sistema.agregarReceta(plato1);
        sistema.agregarReceta(plato2);
        sistema.agregarReceta(plato3);
        sistema.agregarReceta(plato4);
        sistema.agregarReceta(plato5);
        sistema.agregarReceta(plato6);

        for(Dificultad dificultad : Dificultad.values())
        {
            sistema.devolverNombres(sistema.buscarPlatosPorDificultad(dificultad));
        }

        System.out.println(sistema.platoConMayorCantidadDePasos().getNombre());



    }
}
