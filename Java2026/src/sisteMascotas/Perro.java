package sisteMascotas;

public class Perro extends Mascota
{
    @Override
    public void saludar()
    {
        System.out.println(this.nombre + ": Guau °-°");
    }
}
