package sistemaCaloriasFamilias;

import java.util.HashMap;
import java.util.HashSet;

public class PlatoComida {
    String nombre;
    float calorias;
    HashSet<String> ingredientes;

    public PlatoComida(String nombre, float calorias, HashSet<String> ingredientes) {
        this.nombre = nombre;
        this.calorias = calorias;
        this.ingredientes = ingredientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getCalorias() {
        return calorias;
    }

    public void setCalorias(float calorias) {
        this.calorias = calorias;
    }

    public HashSet<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(HashSet<String> ingredientes) {
        this.ingredientes = ingredientes;
    }


    public float caloriasCantidad(int cantidad)
    {
        return cantidad * calorias;
    }
}
