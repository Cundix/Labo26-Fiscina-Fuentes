package sistemaPuntosArcoYFlecha;

import java.util.HashMap;

public class Cuadradas extends Diana
{
    private float lado;

    public Cuadradas(String nombre, int dificultad, HashMap<Integer, ColorDiana> puntajesDiana, float lado) {
        super(nombre, dificultad, puntajesDiana);
        this.lado = lado;
    }

    public Cuadradas(String nombre, int dificultad, float lado) {
        super(nombre, dificultad);
        this.lado = lado;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }


    @Override
    public float calcularArea() {
        return lado*lado;
    }
}
