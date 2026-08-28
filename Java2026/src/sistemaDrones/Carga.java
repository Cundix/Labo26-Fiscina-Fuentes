package sistemaDrones;

public class Carga extends Dron {
    private float pesoCargaKGs;

    public Carga(String nombre, float bateriaPorcentaje, EstadoDron estado, Cords origen, float pesoCargaKGs) {
        super(nombre, bateriaPorcentaje, estado, origen);
        this.pesoCargaKGs = pesoCargaKGs;
    }

    public float getPesoCargaKGs() {
        return pesoCargaKGs;
    }

    public void setPesoCargaKGs(float pesoCargaKGs) {
        this.pesoCargaKGs = pesoCargaKGs;
    }

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
