package sistemaPuntosArcoYFlecha;

import java.util.HashMap;

public class Rectangulares extends Diana
{
    private int altura;
    private int base;

    public Rectangulares(String nombre, int dificultad, HashMap<Integer, ColorDiana> puntajesDiana, int altura, int base) {
        super(nombre, dificultad, puntajesDiana);
        this.altura = altura;
        this.base = base;
    }

    public Rectangulares(String nombre, int dificultad, int altura, int base) {
        super(nombre, dificultad);
        this.altura = altura;
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }


}
