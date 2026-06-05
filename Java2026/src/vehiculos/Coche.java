package vehiculos;

import colores.Color;
import fechas.Fecha;

public class Coche extends Vehiculo {

    private int velocidad;
    private float cargaMaxEnKGs;
    private boolean descapotable;

    public Coche()
    {
        super();
        this.velocidad = 0;
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
