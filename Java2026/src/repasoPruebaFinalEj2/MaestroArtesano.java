package repasoPruebaFinalEj2;

public class MaestroArtesano extends Ayudante
{
    static int tiempoMax = 120;
    private int currentTiempo;

    public MaestroArtesano(String nombre, String apellido, String aldeaOrigen, Taller tallerAsignado, int currentTiempo) {
        super(nombre, apellido, aldeaOrigen, tallerAsignado);
        this.currentTiempo = currentTiempo;
    }

    public MaestroArtesano(String nombre, Taller tallerAsignado, int currentTiempo) {
        super(nombre, tallerAsignado);
        this.currentTiempo = currentTiempo;
    }

    public static int getTiempoMax() {
        return tiempoMax;
    }

    public static void setTiempoMax(int tiempoMax) {
        MaestroArtesano.tiempoMax = tiempoMax;
    }

    public int getCurrentTiempo() {
        return currentTiempo;
    }

    public void setCurrentTiempo(int currentTiempo) {
        this.currentTiempo = currentTiempo;
    }

    @Override
    public void prepararEstacion() throws TiempoSobrepasadoException
    {
        System.out.println("Caja de Insumos revisada");
        if(tiempoMax >= currentTiempo)
        {
            currentTiempo += 10;
            throw new TiempoSobrepasadoException("Tiempo del Artesano sobrepasado");
        }
        System.out.println("Tiempo restante de Trabajo: " + (tiempoMax - currentTiempo));
    }

    @Override
    public void envolverRegalo(Regalo regalo) throws TamanioNoValidoException, TiempoSobrepasadoException
    {
        prepararEstacion();
        System.out.println("Regalo envuelto");
    }
}
