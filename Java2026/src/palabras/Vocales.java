package palabras;

import java.lang.String;

public class Vocales {
    public static void main(String[] args) {
        String texto = "Ayer me compre muñecos de la marca ToyCo por internet";
        texto = texto.toLowerCase();
        String vocales ="aeiou";
        int numeroVocales = 0;
        for (int i = 0; i < texto.length(); i++)
        {
            for (int x = 0; x < vocales.length(); x++)
            {
                if (texto.charAt(i) == vocales.charAt(x))
                {
                    numeroVocales++;
                }
            }

        }

        System.out.println(numeroVocales);
    }
}  