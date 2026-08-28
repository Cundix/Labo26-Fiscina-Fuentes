package sistBebidas;

import java.util.ArrayList;

public class SistemaBebidas
{
    private ArrayList<Persona> listaPersonas;

    public SistemaBebidas() {
        this.listaPersonas = new ArrayList<>();
    }

    public void registrarPersona(String nombre, String apellido, int dni)
    {
        if(this.buscarPersona(dni) != null)
        {
            System.out.println("Error: DNI ya existe. Vuelva a Ingresarlo");
        }
        else
        {
            Persona p = new Persona(nombre, apellido, dni);
            listaPersonas.add(p);
        }
    }

    public Persona mayorQ()
    {
        Persona p = listaPersonas.getFirst();
        for(int i = 1; i < listaPersonas.size(); i++)
        {
            p = p.mayorQque(listaPersonas.get(i));
        }
        return p;
    }

    public Persona menorQ()
    {
        Persona p = listaPersonas.getFirst();
        for(int i = 1; i < listaPersonas.size(); i++)
        {
            p = p.menorQque(listaPersonas.get(i));
        }
        return p;
    }


    public Persona buscarPersona(int dni)
    {
        for (Persona p : listaPersonas)
        {
            if (p.getDNI() == dni)
            {
                return p;
            }
        }
        return null; // Retorna null si no encuentra a la persona
    }

    public static void main(String[] args) {

        SistemaBebidas sistema = new SistemaBebidas();

        sistema.registrarPersona("Juan", "Perez", 11111111);
        sistema.registrarPersona("Maria", "Gomez", 22222222);
        sistema.registrarPersona("Carlos", "Lopez", 33333333);

        Alcoholicas cerveza = new Alcoholicas("Cerveza", 0.05);
        Azucaradas jugo = new Azucaradas("Jugo de Naranja", 5.0);
        Neutra agua = new Neutra("Agua Mineral", 10.0, 0.0);

        Persona juan = sistema.buscarPersona(11111111);
        Persona maria = sistema.buscarPersona(22222222);
        Persona carlos = sistema.buscarPersona(33333333);

        if (juan != null) {
            juan.consumirBebida(cerveza, 3);
        }

        if (maria != null) {
            maria.consumirBebida(jugo, 2);
            maria.consumirBebida(agua, 1);
        }

        if (carlos != null) {
            carlos.consumirBebida(agua, 4);
        }

        Persona personaMayorQ = sistema.mayorQ();
        Persona personaMenorQ = sistema.menorQ();

        System.out.println("En todo el sistema, la persona con MAYOR Q es: " + personaMayorQ.getNombre() + " (Q: " + personaMayorQ.calcularQPersona() + ")");
        System.out.println("En todo el sistema, la persona con MENOR Q es: " + personaMenorQ.getNombre() + " (Q: " + personaMenorQ.calcularQPersona() + ")");
    }
}
