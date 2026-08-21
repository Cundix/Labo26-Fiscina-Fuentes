package sistemaDrones;

public class Carga extends Dron {
    private float pesoCargaKGs;

    @Override
    public boolean ejecutarMision() {
        return false;
    }

    @Override
    public boolean ejecutarMision(double latitud, double longitud)
    {
        if(Cords.calcularKM(latitud, longitud) > 30000)
        {
            System.out.println("Mission: Impossible. Mayor a 30KM");
            return false;
        }
        else
        {
            this.gastarBateria(48);
            System.out.println("Carga realizada com sucesso");
            return true;
        }
    }
}
