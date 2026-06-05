package vehiculos;

import fechas.Fecha;
import colores.Color;
import java.awt.*;

public class Vehiculo {
    private String marca;
    private String modelo;
    private Color color;
    private int cantRuedas;
    private int yearFabricacion;
    private String tipo;

    public Vehiculo(String marca, String modelo, Color color, int cantRuedas, int yearFabricacion)
    {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.cantRuedas = cantRuedas;
        this.yearFabricacion = yearFabricacion;
    }

    public Vehiculo(String marca, String modelo, Color color)
    {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;

    }

    public Vehiculo()
    {
        this.marca = "";
        this.modelo = "";
    }

    public String getTipo() {
        return tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantRuedas() {
        return cantRuedas;
    }

    public void setCantRuedas(int cantRuedas) {
        this.cantRuedas = cantRuedas;
    }

    public int getYearFabricacion() {
        return yearFabricacion;
    }

    public void setYearFabricacion(int yearFabricacion) {
        this.yearFabricacion = yearFabricacion;
    }
}
