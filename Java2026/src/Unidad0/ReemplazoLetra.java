package Unidad0;
import java.lang.String;
import java.util.Scanner

public class ReemplazoLetra {
    public static void main(String[] args) {
        String texto = "Ayer me compre muñecos de la marca ToyCo por internet";
        texto = texto.toLowerCase();
        String vocales ="aeiou";
        int numeroVocales = 0;
        Scanner scanner = new Scanner(System.in);

        char vocal = scanner.next().charAt(0);

        for (int i = 0; i < texto.length(); i++)
        {
            if (texto.charAt(i) == 'e')
            {
                texto.charAt(i) = vocal;
            }
        }

        System.out.println(numeroVocales);
    }
}