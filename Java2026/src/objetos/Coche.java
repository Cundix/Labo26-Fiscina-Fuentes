package objetos;

public class Coche {
    private String marca;
    private String modelo;
    private String color;
    private int velocidad;

    public Coche(String marca, String modelo, String color, int velocidad)
    {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.velocidad = velocidad;
    }
    public Coche()
    {
        this.marca = "";
        this.modelo = "";
        this.color = "";
        this.velocidad = 0;
    }
    public String getMarca()
    {
       return this.marca;
    }
    public String getModelo()
    {
        return this.modelo;
    }
    public String getColor()
    {
        return this.color;
    }
    public void setMarca(String marca)
    {
        this.marca = marca;
    }
    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }
    public void setColor(String color)
    {
        this.color = color;
    }

    public void XLR8()
    {
        this.velocidad += 10;
    }
    public void stop()
    {
        this.velocidad = 0;
    }
    public void showSpeed()
    {
        System.out.println("Velocidad actual: " + this.velocidad);
    }

    public static void main(String[] args) {
        Coche coche = new Coche();
        System.out.println("Velocidad: " + coche.velocidad + " Marca: " + coche.marca + "Modelo: " + coche.modelo);
        coche.XLR8();
        System.out.println("Velocidad: " + coche.velocidad + " Marca: " + coche.marca + "Modelo: " + coche.modelo);

    }

}
