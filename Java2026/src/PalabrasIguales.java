package Unidad0;

// Este codigo compara todos los caracteres, ahora me doy cuenta que se puede hacer mucho mas facil, pero bueno ya está hecho JAJAJJA.

import java.util.Scanner;

public class PalabrasIguales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Palabra1, Palabra2;
        System.out.println("Enter word 1 (EL PROGRAMA DIFERENCIA ENTRE MAYSCS Y MINUS)");
        Palabra1 = scanner.nextLine();
        System.out.println("Now enter word 2");
        Palabra2 = scanner.nextLine();

        if (Palabra1.length() != Palabra2.length())
        {
            System.out.println("Las palabras no son iguales.");
        }
        else
        {
            boolean iguales = true;
            for(int i = 0; i < Palabra1.length(); i++)
            {
                if(Palabra1.charAt(i) == Palabra2.charAt(i));
                else
                {
                    System.out.println("Not the same word!");
                    i += Palabra1.length(); //Fuerzo que se acabe el FOR para que no diga el msg varias veces si hay mas de dos letras distintas
                }
            }
            //Juanse:
            //if(!(Palabra1.equals(Palabra2))) System.out.println("No son la misma palabra");
            //else System.out.println("Son la misma palabra:)");
        }

    }
}
