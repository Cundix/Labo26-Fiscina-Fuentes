package Unidad0;

public class Rectangulo {
    private float base;
    private float altura;

    public Rectangulo (float base, float altura)
    {
        this.base = base;
        this.altura = altura;
    }

    public float getALtura()
    {
        return this.altura;
    }

    public float getBase()
    {
        return this.base;
    }

    public float calcArea()
    {
        return (base*altura);
    }

    public float calcPerimeter()
    {
        return ((base*2) + (altura*2));
    }
}
