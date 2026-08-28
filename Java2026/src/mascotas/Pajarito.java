package mascotas;

public class Pajarito extends Mascota
{
    private boolean cantor;
    private String canto;

    public Pajarito(boolean cantor, String canto) {
        super();
        this.cantor = cantor;
        if(cantor)
        {
            this.canto = canto;
        }
        else
        {
            this.canto = "Pío";
        }
    }

    @Override
    public void saludar(String persona)
    {

    }

    @Override
    public String toString()
    {
        return "Pajarito";
    }
}
