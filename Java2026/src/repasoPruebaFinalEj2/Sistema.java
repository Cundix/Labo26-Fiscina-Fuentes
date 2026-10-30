package repasoPruebaFinalEj2;

import java.util.HashMap;
import java.util.HashSet;

public class Sistema
{
    public static void main(String[] args)
    {
        HashSet<String> prohibidos = new HashSet<>();
        prohibidos.add("Palo");
        prohibidos.add("Piedra");
        Aprendiz aprendiz1 = new Aprendiz("Pepe", Taller.DORADO, prohibidos);

        HashMap<String, Integer> stock = new HashMap<>();
        stock.put("Palo", 3);
        stock.put("Piedra", 1);

        HashMap<String, Integer> stock2 = new HashMap<>();
        stock2.put("Palo", 2);
        stock2.put("Piedra", 1);

        Oficiales oficial1 = new Oficiales("Figaro", Taller.VERDE, stock);

        MaestroArtesano maestro1 = new MaestroArtesano("Juan", Taller.VERDE, 110);

        Regalo regalo = new Regalo(Tamanio.MEDIANO, stock2);

        try
        {
            maestro1.envolverRegalo(regalo);
            maestro1.envolverRegalo(regalo);
            maestro1.envolverRegalo(regalo);

        }
        catch(TamanioNoValidoException e)
        {
            System.out.println("tamanio no valido encontrado");
        }
        catch (TiempoSobrepasadoException e)
        {
            System.out.println("El artesano se paso de tiempo");
        }
        catch (MaterialProhibidoEncontradoException e)
        {
            System.out.println("Se encontro un material prohibido");
        }
        catch (StockInsuficienteException e)
        {
            System.out.println("el oficial no cuenta con el stock");
        }
        try
        {
            aprendiz1.envolverRegalo(regalo);
        }
        catch(TamanioNoValidoException e)
        {
            System.out.println("tamanio no valido encontrado");
        }
        catch (MaterialProhibidoEncontradoException e)
        {
            System.out.println("Se encontro un material prohibido");
        }

        try
        {
            oficial1.envolverRegalo(regalo);
            oficial1.envolverRegalo(regalo);
        }
        catch(TamanioNoValidoException e)
        {
            System.out.println("tamanio no valido encontrado");
        }

        catch (StockInsuficienteException e)
        {
            System.out.println("el oficial no cuenta con el stock");
        }



    }



}
