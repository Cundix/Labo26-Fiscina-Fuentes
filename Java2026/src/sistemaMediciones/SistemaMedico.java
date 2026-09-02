package sistemaMediciones;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;

public class SistemaMedico
{
    private HashSet<Persona> personas;


    public SistemaMedico()
    {
        personas = new HashSet<>();
    }

    public void registrarPersona(Persona persona)
    {
        if(personas.isEmpty() || !(personas.contains(persona)))
        {
            personas.add(persona);
            System.out.printf("Registrado persona: %s\n", persona.toString());
        }

        else
        {
            System.out.println("Esa persona ya existe");
        }
    }

    public void eliminarPersona(Persona persona)
    {
        if(personas.contains(persona))
        {
            personas.remove(persona);
            System.out.printf("Eliminado persona: %s\n", persona.toString());
        }
        else
        {
            System.out.println("Esa persona no existe");
        }
    }

    public void nuevaMedicion(LocalDate fecha, Persona persona, double pesoKg, double altura)
    {
            Medicion medicion = new Medicion(pesoKg, altura);
            if(persona.agregarMedicion(medicion, fecha))
            {
                System.out.printf("Medcion agregada en el dia " + fecha.toString() + " para la  persona: %s\n", persona.toString());
            }
            else
            {
                System.out.println("Ya existe una medicion en esa fecha");
            }
    }

    static void main(String[] args)
    {
        SistemaMedico sistemaMedico = new SistemaMedico();

        Persona persona = new Persona("Juanse", "Fuentes", LocalDate.now());

        sistemaMedico.registrarPersona(persona);

        sistemaMedico.nuevaMedicion(LocalDate.of(2025, 12, 25), persona, 64, 1.73);
        sistemaMedico.nuevaMedicion(LocalDate.of(2025, 12, 25), persona, 65, 2);

        sistemaMedico.nuevaMedicion(LocalDate.of(2027, 12, 30), persona, 70 , 1.75);
        sistemaMedico.nuevaMedicion(LocalDate.of(2030, 12, 30), persona, 74 , 1.80);

        persona.mayorPeso();
        persona.menorPeso();

        persona.porcentajeCrecimiento(LocalDate.of(2025, 12, 25),  LocalDate.of(2030, 12, 30));







    }

}
