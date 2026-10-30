package repasoPruebaFinalEj2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Oficiales extends Ayudante
{
    private HashMap<String, Integer> stock;

    public Oficiales(String nombre, String apellido, String aldeaOrigen, Taller tallerAsignado, HashMap<String, Integer> stock) {
        super(nombre, apellido, aldeaOrigen, tallerAsignado);
        this.stock = stock;
    }

    public Oficiales(String nombre, Taller tallerAsignado, HashMap<String, Integer> stock) {
        super(nombre, tallerAsignado);
        this.stock = stock;
    }

    public HashMap<String, Integer> getStock() {
        return stock;
    }

    public void setStock(HashMap<String, Integer> stock) {
        this.stock = stock;
    }

    public HashSet<String> stockMayorA(int numero)
    {
        HashSet<String> res = new HashSet<>();
        for(Map.Entry<String, Integer> e : stock.entrySet())
        {
            if(e.getValue() >= numero){res.add(e.getKey());}
        }
        return res;
    }

    public void mostrarLista (HashSet<String> lista)
    {
        for (String s : lista)
        {
            System.out.println(s);
        }
    }

    public void chequearMaterial(HashMap<String, Integer> lista) throws StockInsuficienteException
    {
        for (Map.Entry<String, Integer> e : lista.entrySet())
        {
            if(!(stock.containsKey(e.getKey()) && (stock.get(e.getKey()) >= e.getValue())))
            {
                throw new StockInsuficienteException("No hay material o no alcanza la cantidad requerida: " + e.getKey());
            }
        }
    }
    public void desscontar(HashMap<String, Integer> lista) throws StockInsuficienteException
    {
        Integer cant;
        for (Map.Entry<String, Integer> e : lista.entrySet())
        {
            // Calculamos el nuevo stock restando la cantidad requerida por el regalo
            int nuevoStock = stock.get(e.getKey()) - e.getValue();

            // Actualizamos el mapa usando put()
            stock.put(e.getKey(), nuevoStock);
        }
    }

    @Override
    public void prepararEstacion()
    {
        System.out.println("Materiales con Stock mayor a 1: ");
        mostrarLista(stockMayorA(1));
    }

    @Override
    public void envolverRegalo(Regalo regalo) throws TamanioNoValidoException, StockInsuficienteException
    {
        if(regalo.getTamanioRegalo().equals(Tamanio.MEDIANO))
        {
            prepararEstacion();

            chequearMaterial(regalo.getListaMateriales());

            desscontar(regalo.getListaMateriales());

            System.out.println("Regalo envuelto");
        }
        else
        {
            throw new TamanioNoValidoException("Los Oficiales solo pueden envolver regalos medianos");
        }
    }
}
