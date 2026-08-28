package sisteMascotas;

import personas.Dueño;

import java.util.ArrayList;

public abstract class Mascota
{
    private String nombre;
    private Dueño dueño;

    public Mascota(String nombre, Dueño dueño) {
        this.nombre = nombre;
        this.dueño = dueño;
    }

    public abstract void saludar();
    



}
