package Unidad0;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha()
    {
        this.dia = 0;
        this.mes = 0;
        this.anio = 0;
    }

    public Fecha(int dia, int mes, int anio)
    {
        if(dia <= 0 || dia > 31 || ((dia > 28) && (mes == 2)))
        {
            System.out.println("El día ingresado no existe");
        }
        if (mes =< 0 || mes > 12) {
            System.out.println("El mes ingresado no existe");
        }
        if (anio > 9999) {
            System.out.println("El año ingresado es muy grande");
        }
        else {
            this.dia = dia;
            this.mes = mes;
            this.anio = anio;
        }
    }
}
