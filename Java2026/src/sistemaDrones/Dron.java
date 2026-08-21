package sistemaDrones;

public abstract class Dron {
    private String nombre;
    private float bateriaPorcentaje;
    private int id;
    private EstadoDron estado;
    private Cords origen;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getBateriaPorcentaje() {
        return bateriaPorcentaje;
    }

    public void setBateriaPorcentaje(float bateriaPorcentaje) {
        this.bateriaPorcentaje = bateriaPorcentaje;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public EstadoDron getEstado() {
        return estado;
    }

    public void setEstado(EstadoDron estado) {
        this.estado = estado;
    }

    public void cargarBateria()
    {
        if(this.bateriaPorcentaje > 20)
        {
            this.bateriaPorcentaje += 10;
            return;
        }
        this.bateriaPorcentaje = 100;
    }

    public void gastarBateria(float value)
    {
        if(value > 100 || value > this.bateriaPorcentaje)
        {
            System.out.println("Valor invalido");

        }
        else
        {
            this.bateriaPorcentaje -= value;
        }
    }

    public abstract boolean ejecutarMision();


    public abstract boolean ejecutarMision(double latitud, double longitud);
}
