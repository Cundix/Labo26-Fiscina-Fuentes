package Unidad0;
import java.util.Scanner;

public class ReemplazoLetra
{
    public static void main(String[] args)
    {
        String texto = "Ayer me compre muñecos de la marca ToyCo por internet";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la vocal de reemplazo: ");
        char vocalUsuario = scanner.next().charAt(0);

        String nuevoTexto = "";

        for (int i = 0; i < texto.length(); i++)
        {
            char caracterActual = texto.charAt(i);

            if (caracterActual == 'e') {
                nuevoTexto = nuevoTexto.concat(String.valueOf(vocalUsuario));
            }
            else
            {
                nuevoTexto = nuevoTexto.concat(String.valueOf(caracterActual));
            }
        }

        System.out.println("Texto modificado: " + nuevoTexto);
    }
}