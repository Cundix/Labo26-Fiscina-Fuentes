package Unidad0;

import java.util.Vector;

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
            this.dia = 1;
        }
        if (mes <= 0 || mes > 12) {
            this.mes = 1;
        }
        if (anio > 9999) {
            this.anio = 1900;
        }
        else {
            this.dia = dia;
            this.mes = mes;
            this.anio = anio;
        }
    }
    public int diasXmes()
    {
        int[] dias = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return dias[this.mes - 1];
    }

    public void fechaCorta()
    {
        System.out.println(this.dia + "-" + this.mes + "-" + this.anio);
    }
    public void fechaLarga()
    {
        String[] dias = {}
    }
}
