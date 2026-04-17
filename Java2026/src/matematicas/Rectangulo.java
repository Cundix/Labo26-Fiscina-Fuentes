package matematicas;

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
        return (this.base*altura);
    }

    public float calcPerimeter()
    {
        return ((this.base*2) + (this.altura*2));
    }
    public static void main(String[] args) {
        Rectangulo rectangulo = new Rectangulo(10, 7);
        System.out.println("Area: " + rectangulo.calcArea());
        System.out.println("Perimetro: " + rectangulo.calcPerimeter());
    }
}
