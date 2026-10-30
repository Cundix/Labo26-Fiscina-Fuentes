package repasoPruebaFinalEj2;

import java.util.HashMap;
import java.util.HashSet;

public class Regalo
{
    private Tamanio tamanioRegalo;
    private HashMap<String, Integer> listaMateriales;

    public Regalo(Tamanio tamanioRegalo, HashMap<String, Integer> listaMateriales) {
        this.tamanioRegalo = tamanioRegalo;
        this.listaMateriales = listaMateriales;
    }

    public Tamanio getTamanioRegalo() {
        return tamanioRegalo;
    }

    public void setTamanioRegalo(Tamanio tamanioRegalo) {
        this.tamanioRegalo = tamanioRegalo;
    }

    public HashMap<String, Integer> getListaMateriales() {
        return listaMateriales;
    }

    public void setListaMateriales(HashMap<String, Integer> listaMateriales) {
        this.listaMateriales = listaMateriales;
    }
}
