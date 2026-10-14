package interfacesEj1;

public class Pantalon extends PrendaDeRopa implements Prestable
{
    private int medidaCintura, medidaCadera, largo;

    public Pantalon(String color, Material material, Estado estado, int medidaCintura, int medidaCadera, int largo) {
        super(color, material, estado);
        this.medidaCintura = medidaCintura;
        this.medidaCadera = medidaCadera;
        this.largo = largo;
    }

    public int getMedidaCintura() {
        return medidaCintura;
    }

    public void setMedidaCintura(int medidaCintura) {
        this.medidaCintura = medidaCintura;
    }

    public int getMedidaCadera() {
        return medidaCadera;
    }

    public void setMedidaCadera(int medidaCadera) {
        this.medidaCadera = medidaCadera;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    @Override
    public String toString() {
        return "Pantalon{" +
                super.toString() +
                ", medidaCintura=" + medidaCintura +
                ", medidaCadera=" + medidaCadera +
                ", largo=" + largo +
                '}';
    }

    @Override
    public void prestar() throws IllegalArgumentException
    {
        if(puedePrestarse())
        {
            System.out.println("El Pantalon se dará Prestado");
            setPrestado(true);
        }
        else throw new IllegalArgumentException();
    }

    @Override
    public boolean puedePrestarse()
    {
        return (!super.isPrestado() && verificar());
    }

    @Override
    public void devolver()
    {
        this.setPrestado(false);
    }

}
