package sistemaPuntosArcoYFlecha;

import java.util.HashMap;

public class Circulares extends Diana
{
    static float radioCm = 13;

    public Circulares(String nombre, int dificultad, HashMap<Integer, ColorDiana> puntajesDiana) {
        super(nombre, dificultad, puntajesDiana);
    }

    public Circulares(String nombre, int dificultad) {
        super(nombre, dificultad);
    }

    @Override
    public float calcularArea() {
        return (float)3.14 * radioCm * radioCm;
    }

    public static float getRadioCm() {
        return radioCm;
    }

    public static void setRadioCm(float radioCm) {
        Circulares.radioCm = radioCm;
    }




}
