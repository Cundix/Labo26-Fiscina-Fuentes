package fixingExceptions;

public class NombreNulo extends RuntimeException
{

    public NombreNulo(String message) {
        super(message);
        
    }

    public void msg()
    {
        System.out.println("el nombre no puede ser nulo");
    }
}
