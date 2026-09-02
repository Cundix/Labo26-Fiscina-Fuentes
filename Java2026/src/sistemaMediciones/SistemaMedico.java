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

    public static void main(String[] args) {
        SistemaMedico sistemaMedico = new SistemaMedico();

        // 1. Crear y registrar persona
        Persona persona = new Persona("Juanse", "Fuentes", LocalDate.of(2005, 5, 15));
        sistemaMedico.registrarPersona(persona);

        // Intento de registrar a la misma persona (debería notificar que ya existe si equals/hashCode están implementados o si es la misma referencia)
        sistemaMedico.registrarPersona(persona);

        LocalDate f1 = LocalDate.of(2025, 6, 10);
        LocalDate f2 = LocalDate.of(2025, 12, 25);
        LocalDate f3 = LocalDate.of(2026, 3, 15);
        LocalDate f4 = LocalDate.of(2026, 8, 20);

        // Cargar mediciones válidas
        sistemaMedico.nuevaMedicion(f1, persona, 68.5, 172.0);
        sistemaMedico.nuevaMedicion(f2, persona, 70.0, 173.0);
        sistemaMedico.nuevaMedicion(f3, persona, 71.5, 174.5);
        sistemaMedico.nuevaMedicion(f4, persona, 69.0, 175.0);

        // Intento de agregar medición en fecha repetida (debería fallar)
        sistemaMedico.nuevaMedicion(f2, persona, 75.0, 173.0);

        // Consulta por fecha
        Medicion medF2 = persona.conocerMedicionFecha(f2);
        if (medF2 != null) {
            System.out.printf("\nMedición del %s: Peso = %.2f kg, Altura = %.2f cm\n", f2, medF2.getPesoKg(), medF2.getAlturaCm());
        }

        // Promedios por año
        int anioPrueba = 2025;
        System.out.printf("\nPromedio peso %d: %.2f kg\n", anioPrueba, persona.promedioPesoAnio(anioPrueba));
        System.out.printf("\nPromedio altura %d: %.2f cm\n", anioPrueba, persona.promedioAlturaAnio(anioPrueba));

        // Promedio para un año sin mediciones
        System.out.printf("\nPromedio peso 2020: %.2f\n", persona.promedioPesoAnio(2020));

        LocalDate fechaMenorPeso = persona.menorPeso();
        LocalDate fechaMayorPeso = persona.mayorPeso();

        if (fechaMenorPeso != null) {
            System.out.printf("\nMenor peso registrado: %.2f kg el %s\n",
                    persona.conocerMedicionFecha(fechaMenorPeso).getPesoKg(), fechaMenorPeso);
        }
        if (fechaMayorPeso != null) {
            System.out.printf("\nMayor peso registrado: %.2f kg el %s\n",
                    persona.conocerMedicionFecha(fechaMayorPeso).getPesoKg(), fechaMayorPeso);
        }

        double varPeso = persona.porcentajeVariacionPeso(f1, f4);
        double varAltura = persona.porcentajeCrecimiento(f1, f4);

        System.out.printf("\nVariación de peso entre %s y %s: %.2f%%\n", f1, f4, varPeso);
        System.out.printf("\nPorcentaje de crecimiento entre %s y %s: %.2f%%\n", f1, f4, varAltura);

        sistemaMedico.eliminarPersona(persona);
    }

}
