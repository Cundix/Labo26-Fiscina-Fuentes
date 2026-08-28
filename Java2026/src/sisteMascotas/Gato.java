package sisteMascotas;

public class Gato extends Mascota
{
    @Override
    public void saludar()
    {
        System.out.println(this.nombre + ": Miau ");
    }
}
