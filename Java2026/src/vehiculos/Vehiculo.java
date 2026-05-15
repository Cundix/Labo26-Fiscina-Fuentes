package vehiculos;

import fechas.Fecha;

public class Vehiculo {
    private String marca;
    private String modelo;
    private String color;
    private int cantRuedas;
    private int yearFabricacion;
    private String tipo;

    public Vehiculo(String marca, String modelo, String color, int cantRuedas, int yearFabricacion)
    {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.cantRuedas = cantRuedas;
        this.yearFabricacion = yearFabricacion;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
