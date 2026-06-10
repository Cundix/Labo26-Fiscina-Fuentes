package companiaAlimentaria;

import fechas.Fecha;



public class ProductoEnvasado extends Producto {
    float temperaturaRecomendada;

    public ProductoEnvasado(String nombre, Fecha fechaEnvasado, PaisOrigen paisOrigen, String codigo, String numeroDeLote, TablaNutricional tablaNutricional, double precio, float temperaturaRecomendada) {
        super(nombre, fechaEnvasado, paisOrigen, codigo, numeroDeLote, tablaNutricional, precio);
        this.temperaturaRecomendada = temperaturaRecomendada;
    }

    public ProductoEnvasado(float temperaturaRecomendada) {
        this.temperaturaRecomendada = temperaturaRecomendada;
    }

    public ProductoEnvasado() {

    }
}
