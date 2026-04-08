import com.sun.source.tree.BreakTree;

public class Cohete {

    private String nombre;
    private int velocidadMax;
    private float largo;
    private float ancho;
    private int cPropulsores;

    public Cohete()
    {
        this.nombre = prueba;
        this.velocidadMax = 25001;
        this.largo = 100;
        this.ancho = 100;
        this.cPropulsores = 4;
    }
    public Cohete(String nombre, int velocidadMax, float largo, float ancho, int cPropulsores)    {
        this.nombre = nombre;
        this.velocidadMax = velocidadMax;
        this.largo = largo;
        this.ancho = ancho;
        this.cPropulsores = cPropulsores;
    }
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    public void setVelocidadMax(int velocidadMax)
    {
        this.velocidadMax = velocidadMax;
    }
    public void setLargo(float largo)
    {
        this.largo = largo;
    }
    public void setAncho(float ancho)
    {
        this.ancho = ancho;
    }
    public void setcPropulsores(int cPropulsores)
    {
        this.cPropulsores = cPropulsores;
    }
    public boolean verificar
    {
        boolean res = false;
        if(this.cPropulsores >= 2 && this.velocidadMax > 25000)
        {
            res = true;
        }
        return res;
    }
    public void activar(int cant)
    {
        if(cant <= cPropulsores && cant > 0) {

            for (int i = 0; i < this.cPropulsores; i++) {
                System.out.printf("Propulsor " + (i + 1) + " activado" + (i + 1) + "/" + this.cPropulsores);
            }

        }
        else
        {
            System.out.printf("error. cantidad no valida");
        }
    }
    public int calcularTiempo(int distancia)
    {
        int res = -1;
        if(distancia > 0)
        {
            res = velocidadMax / distancia;
        }
        return res;
    }

    


}
