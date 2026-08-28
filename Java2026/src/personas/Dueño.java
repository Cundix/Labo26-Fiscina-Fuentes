package personas;

public class Dueño extends Persona
{
    public Dueño()
    {
        super();
        nombre = "Dueño ";
        apellido = "Ejemplo";

    }

    public Dueño(String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
    }
}
