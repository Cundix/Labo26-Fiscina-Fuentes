package repasoPruebaFinal_Juanse;

import java.util.ArrayList;

public class Jugador
{
    private String nombre;
    private int nroJugador;
    static int ENERGIAINICIAL = 100;
    private int currentEnergia;
    private ArrayList<String> recompensa;
    private int riesgoActual;
    static int RIESGOMAX = 100;

    private Prueba pruebaFav;

    public Prueba getPruebaFav() {
        return pruebaFav;
    }

    public void setPruebaFav(Prueba pruebaFav) {
        this.pruebaFav = pruebaFav;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNroJugador() {
        return nroJugador;
    }

    public void setNroJugador(int nroJugador) {
        this.nroJugador = nroJugador;
    }

    public static int getENERGIAINICIAL() {
        return ENERGIAINICIAL;
    }

    public static void setENERGIAINICIAL(int ENERGIAINICIAL) {
        Jugador.ENERGIAINICIAL = ENERGIAINICIAL;
    }

    public int getCurrentEnergia() {
        return currentEnergia;
    }

    public void setCurrentEnergia(int currentEnergia) {
        this.currentEnergia = currentEnergia;
    }

    public ArrayList<String> getRecompensa() {
        return recompensa;
    }

    public void setRecompensa(ArrayList<String> recompensa) {
        this.recompensa = recompensa;
    }

    public int getRiesgoActual() {
        return riesgoActual;
    }

    public void setRiesgoActual(int riesgoActual) {
        this.riesgoActual = riesgoActual;
    }

    public static int getRIESGOMAX() {
        return RIESGOMAX;
    }

    public static void setRIESGOMAX(int RIESGOMAX) {
        Jugador.RIESGOMAX = RIESGOMAX;
    }

    public Jugador(String nombre, int nroJugador, ArrayList<String> recompensa, int riesgoActual) {
        this.nombre = nombre;
        this.nroJugador = nroJugador;
        this.currentEnergia = ENERGIAINICIAL;
        this.recompensa = recompensa;
        this.riesgoActual = riesgoActual;
    }

    public boolean checkJugable()
    {
        try {
            if (currentEnergia > 20) {
                return true;
            } else {
                throw new NoSePuedeRealizarLaPruebaException("No se puede realizar la prueba");
            }
        } catch (NoSePuedeRealizarLaPruebaException e ) {
            return false;
        }
    }

    public boolean recibirDanio(int danio)
    {
        riesgoActual += danio;
        if(riesgoActual >= RIESGOMAX)
        {
            return false;//se murio
        }
        else
        {
            return true;
        }
    }

    public boolean nuevaPruebaFav(Prueba pruebaFav)
    {
        try
        {
            if(this.pruebaFav != pruebaFav)
            {
                setPruebaFav(pruebaFav);
                return true;
            }
            else
            {
                throw new PruebaRepetida("Prueba ya esta como favorita");
            }
        }
        catch (PruebaRepetida pre)
        {
            return false;
        }
    }






}
