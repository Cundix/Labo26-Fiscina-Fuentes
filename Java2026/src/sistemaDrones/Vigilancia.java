package sistemaDrones;

public class Vigilancia extends Dron
{
    private int cantMB;
    private int mbUsados;

    public int getCantMB() {
        return cantMB;
    }

    public void setCantMB(int cantMB) {
        this.cantMB = cantMB;
    }

    public int getMbUsados() {
        return mbUsados;
    }

    public void setMbUsados(int mbUsados) {
        this.mbUsados = mbUsados;
    }

    public Vigilancia(int cantMB, int mbUsados) {
        this.cantMB = cantMB;
        this.mbUsados = mbUsados;
    }

    @Override
    public boolean ejecutarMision() {
        return false;
    }

    @Override
    public boolean ejecutarMision(double latitud, double longitud) {
        float mbEstimados = (float) (((Cords.calcularKM(latitud, longitud)/1000)/2)*12); // calcular los mb que

        if(mbEstimados < (cantMB - mbUsados))
        {
            System.out.println("Yes, the mission can be done!");
            return true;
        }
        else
        {
            System.out.println("This mission can't be done! :(");
        }
        return false;
        }
    }

