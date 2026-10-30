package repasoPruebaFinal_Juanse;

public class Mortal extends Prueba
{
    private int tiempoReactivacion;

    public Mortal(String nombrePrueba, String recompensa, Escenario escenario, int consumoEnergia, int tiempoReactivacion) {
        super(nombrePrueba, Dificultad.MORTAL, "Mortal Kombat", recompensa, escenario, consumoEnergia, 100);
        this.tiempoReactivacion = tiempoReactivacion;
    }

    public int getTiempoReactivacion() {
        return tiempoReactivacion;
    }

    public void setTiempoReactivacion(int tiempoReactivacion) {
        this.tiempoReactivacion = tiempoReactivacion;
    }
}
