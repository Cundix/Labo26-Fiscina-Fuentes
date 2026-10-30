package repasoPruebaFinalEj2;

import java.util.HashSet;

public class Aprendiz extends Ayudante
{
    private HashSet<String> prohibidos;

    public Aprendiz(String nombre, String apellido, String aldeaOrigen, Taller tallerAsignado, HashSet<String> prohibidos) {
        super(nombre, apellido, aldeaOrigen, tallerAsignado);
        this.prohibidos = prohibidos;
    }

    public Aprendiz(String nombre, Taller tallerAsignado, HashSet<String> prohibidos) {
        super(nombre, tallerAsignado);
        this.prohibidos = prohibidos;
    }

    public HashSet<String> getProhibidos() {
        return prohibidos;
    }

    public void setProhibidos(HashSet<String> prohibidos) {
        this.prohibidos = prohibidos;
    }

    public String enumerarMatProhibidos()
    {
        String lista = "";
        int i = 0;
        for(String s : prohibidos)
        {
            i++;
            lista += (i + ": " + s + "\n");
        }
        return lista;
    }

    @Override
    public void prepararEstacion()
    {
        System.out.println("Los materiales peligrosos se han guardado. Materiales Prohibidos: " + enumerarMatProhibidos());
    }


    @Override
    public void envolverRegalo(Regalo regalo) throws TamanioNoValidoException, MaterialProhibidoEncontradoException
    {
        if(regalo.getTamanioRegalo().equals(Tamanio.PEQUENIO))
        {
            prepararEstacion();
            for(String s : regalo.getListaMateriales().keySet())
            {
                if(prohibidos.contains(s)) { throw new MaterialProhibidoEncontradoException("Material prohibido encontrado : " + s);}
            }
            System.out.println("Regalo envuelto");
        }
        else
        {
            throw new TamanioNoValidoException("Los Aprendices solo pueden envolver regalos pequeños");
        }
    }


}
