package fechas;

public class Hora {
    private int horas;
    private int minutos;
    private int segundos;

    public Hora() {
        this.horas = 0;
        this.minutos = 0;
        this.segundos = 0;
    }

    public Hora(int horas, int minutos, int segundos) {
        setHoras(horas);
        setMinutos(minutos);
        setSegundos(segundos);
    }

    public void setHoras(int horas) {
        if (horas >= 0 && horas <= 23) {
            this.horas = horas;
        } else {
            this.horas = 0;
        }
    }

    public void setMinutos(int minutos) {
        if (minutos >= 0 && minutos <= 59) {
            this.minutos = minutos;
        } else {
            this.minutos = 0;
        }
    }

    public void setSegundos(int segundos) {
        if (segundos >= 0 && segundos <= 59) {
            this.segundos = segundos;
        } else {
            this.segundos = 0;
        }
    }

    public int getHoras() { return horas; }
    public int getMinutos() { return minutos; }
    public int getSegundos() { return segundos; }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", horas, minutos, segundos);
    }

    public void avanzarSegundo() {
        segundos++;
        if (segundos > 59) {
            segundos = 0;
            minutos++;
            if (minutos > 59) {
                minutos = 0;
                horas++;
                if (horas > 23) {
                    horas = 0;
                }
            }
        }
    }
}
