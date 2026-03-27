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
    public int diasXmes()
    {
        int[] dias = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return dias[this.mes - 1];
    }

    public void fechaCorta()
    {
        System.out.println(this.dia + "-" + this.mes + "-" + this.anio);
    }
    public void fechaLarga() {
        LocalDate temp = LocalDate.of(this.anio, this.mes, this.dia);
        String nombreDia = temp.getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("es", "ES"));
        String nombreMes = temp.getMonth().getDisplayName(TextStyle.FULL, new Locale("es", "ES"));
        System.out.println(nombreDia + " " + this.dia + " de " + nombreMes + " de " + this.anio);
    }

    public void siguienteDia(){
        if (this.dia > diasXmes()) {
            this.dia = 1;
            this.mes++;

            if (this.mes > 12) {
                this.mes = 1;
                this.anio++;
            }
        }
    }

    public static void main(String[] args) {
        Fecha fecha = new Fecha(20, 11, 2009);
        System.out.println("Este mes tiene: " + fecha.diasXmes() + " Dias");
        fecha.fechaLarga();
        fecha.fechaCorta();
    }

}
