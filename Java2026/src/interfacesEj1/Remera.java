package interfacesEj1;

import java.time.LocalDate;

public class Remera extends PrendaDeRopa implements Prestable
{
    private int medidaEspalda, contorno, largo;

    public Remera(String color, Material material, Estado estado, int medidaEspalda, int contorno, int largo)
    {
        super(color, material, estado);
        this.medidaEspalda = medidaEspalda;
        this.contorno = contorno;
        this.largo = largo;
    }

    public int getMedidaEspalda() {
        return medidaEspalda;
    }

    public void setMedidaEspalda(int medidaEspalda) {
        this.medidaEspalda = medidaEspalda;
    }

    public int getContorno() {
        return contorno;
    }

    public void setContorno(int contorno) {
        this.contorno = contorno;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    @Override
    public String toString() {
        return "Remera{" +
                super.toString() +
                ", medidaEspalda=" + medidaEspalda +
                ", contorno=" + contorno +
                ", largo=" + largo +
                '}';
    }
    @Override
    public void prestar() throws IllegalArgumentException
    {
        if(puedePrestarse())
        {
            System.out.println("La remera se dará Prestada");
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
