package ventaElectronica;

public enum Resolucion
{
    CUATRO_K("4092 x 2720"),MIL_OCHENTA("1080 x 720"), SIETEVEINTE("720 x 540"), CUATROCHENTA("480 x 320");

    String valor;

    Resolucion(String valor)
    {
        this.valor = valor;
    }
}
