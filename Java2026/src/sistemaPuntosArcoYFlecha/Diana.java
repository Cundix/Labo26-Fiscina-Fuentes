package sistemaPuntosArcoYFlecha;

import java.util.HashMap;

public abstract class Diana
{
    private String nombre;
    private int dificultad;
    private HashMap<Integer, ColorDiana> puntajesDiana;

    public Diana(String nombre, int dificultad, HashMap<Integer, ColorDiana> puntajesDiana) {
        this.nombre = nombre;
        this.dificultad = dificultad;
        this.puntajesDiana = puntajesDiana;
    }

    public Diana(String nombre, int dificultad) {
        this.nombre = nombre;
        this.dificultad = dificultad;
        puntajesDiana = new HashMap<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDificultad() {
        return dificultad;
    }

    public void setDificultad(int dificultad) {
        this.dificultad = dificultad;
    }

    public HashMap<Integer, ColorDiana> getPuntajesDiana() {
        return puntajesDiana;
    }

    public void setPuntajesDiana(HashMap<Integer, ColorDiana> puntajesDiana) {
        this.puntajesDiana = puntajesDiana;
    }

    public abstract float calcularArea();

    public int cantidadPuntajes()
    {
        return  puntajesDiana.size();
    }
}
