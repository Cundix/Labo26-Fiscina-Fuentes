package Unidad0;

public class Circulo
{
    private float radio;

    public Circulo()
    {
        this.radio = 2;
    }
    public Circulo(float radio)
    {
        this.radio = radio;
    }
    public float getRadio()
    {
        return this.radio;
    }
    public float setRadio(float radio)
    {
        this.radio = radio;
    }
    public float calcArea()
    {
        return (float)((this.radio * this.radio) * 3.14f);
    }
    public float calcPer()
    {
        return (float)(this.radio * 2 * 3.14f);
    }

    public static void main(String[] args) {
        Circulo circulo = new Circulo(10);
        System.out.println("Area: " + circulo.calcArea());
        System.out.println("Perimetro: " + circulo.calcPer());
    }
}
