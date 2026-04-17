package fechas;

import java.time.LocalDate;
import java.time.format.TextStyle; // Para nombres en español
import java.util.Locale;

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
    public Fecha (Fecha fecha)
    {
        this.dia = fecha.dia;
        this.mes = fecha.mes;
        this.anio = fecha.anio;

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
    public String fechaLarga() {
        LocalDate temp = LocalDate.of(this.anio, this.mes, this.dia);
        String nombreDia = temp.getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("es", "ES"));
        String nombreMes = temp.getMonth().getDisplayName(TextStyle.FULL, new Locale("es", "ES"));
        return (nombreDia + " " + this.dia + " de " + nombreMes + " de " + this.anio);
    }

    public Fecha siguienteDia(){
        if (this.dia == diasXmes()) {
            this.dia = 1;
            this.mes++;

            if (this.mes > 12) {
                this.mes = 1;
                this.anio++;
            }

        }
        else
        {
            this.dia ++;
        }
        return this;
    }

    public Fecha anterior(){
        if (this.dia == 1) {
            this.dia = diasXmes();
            this.mes --;

            if (this.mes < 2) {
                this.mes = 12;
                this.anio --;
            }

        }
        else
        {
            this.dia --;
        }
        return this;
    }

    public boolean igualQue(Fecha fecha2) {
        return this.dia == fecha2.dia &&
                this.mes == fecha2.mes &&
                this.anio == fecha2.anio;
    }
    public boolean menorQue(Fecha fecha2)
    {
        boolean isItBeforier = false;
        if(this.anio < fecha2.anio) isItBeforier = true;
        else if(this.anio == fecha2.anio)
        {
            if(this.mes < fecha2.anio) isItBeforier = true;
            else if(this.mes == fecha2.mes)
            {
                if(this.dia < fecha2.dia) isItBeforier = true;
            }
        }
        return !isItBeforier;
    }

    public boolean mayorQue(Fecha fecha2)
    {
        boolean isItAfterier = false;
        if(this.anio > fecha2.anio) isItAfterier = true;
        else if(this.anio == fecha2.anio)
        {
            if(this.mes > fecha2.anio) isItAfterier = true;
            else if(this.mes == fecha2.mes)
            {
                if(this.dia > fecha2.dia) isItAfterier = true;
            }
        }
        return isItAfterier;
    }

    public static void main(String[] args) {
        Fecha fecha = new Fecha(30, 12, 2009);
        Fecha fechaOg = new Fecha(fecha);
        Fecha fecha2 = new Fecha(31, 12, 2009);
        System.out.println("Este mes tiene: " + fecha.diasXmes() + " Dias");
        System.out.println("fechas.Fecha 1: " + fecha.fechaLarga());
        fecha.fechaCorta();
        System.out.println("fechas.Fecha 2: " + fecha2.fechaLarga());
        fecha2.fechaCorta();

        System.out.println("Siguiente dia: " + (fecha.siguienteDia()).fechaLarga());

        System.out.println("Dia anterior: " + (fecha.anterior()).anterior().fechaLarga());

        if(fechaOg.igualQue(fecha2)) System.out.println("Las fechas 1 y 2 son iguales");
        else
        {
            if(fechaOg.menorQue(fecha2)) System.out.println("La fecha 2 es anterior a fecha 1");
            else System.out.println("La fecha 1 es anterior a la fecha 2");
        }

    }

}
