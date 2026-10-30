package repasoPruebaFinal_Juanse;

public class Avanzada extends Prueba
{
    public Avanzada(String nombrePrueba, Dificultad dificultad, String recompensa, Escenario escenario,  int riesgo)
    {
        super(nombrePrueba, dificultad, "Dificultad Avanzada: Cuidadito ", recompensa, escenario, dificultad.getValor(), riesgo);
        if(riesgo < 30)
        {
            super.setNivelRiesgo(30);
        }
    }
}
