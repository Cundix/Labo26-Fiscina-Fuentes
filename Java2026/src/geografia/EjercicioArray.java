package geografia;

import personas.Persona;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class EjercicioArray {
    public static void main(String[] args) {
        ArrayList<Integer> numeritos = new ArrayList<>();
        numeritos.add(1);
        numeritos.add(3);
        numeritos.add(3);
        numeritos.add(2);
        int suma = 0;
        for(int n : numeritos)
        {
            suma += n;
        }
        System.out.println(suma);

        ArrayList<String> listitaStrings = new ArrayList<>();
        listitaStrings.add("London");
        listitaStrings.add("Athens");
        listitaStrings.add("Paris");
        listitaStrings.add("Moscow");
        listitaStrings.add("Geneva");
        listitaStrings.add("New York");
        listitaStrings.add("Berlin");
        listitaStrings.add("Buenos Aires");
        listitaStrings.add("Rosario");
        listitaStrings.add("Lisbon");
        listitaStrings.add("Liverpool");

        ArrayList<String> listaStringsConLaLetra = new ArrayList<>();
        for (String s : listitaStrings)
        {
            if(s.charAt(0) == 'B')
                listaStringsConLaLetra.add(s);
        }

        for (String s : listaStringsConLaLetra)
        {
            System.out.println(s);
        }

        ArrayList<Persona> listaPersona = new ArrayList<>();
        listaPersona.add(new Persona());
        listaPersona.add(new Persona());
        listaPersona.add(new Persona());

        for (Persona p : listaPersona)
            {
                if (p.getEdad() >= 30)
                {
                    System.out.println(p.getNombre());
                }
            }
    }


}