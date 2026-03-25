package Unidad0;
import java.util.Scanner;

public class IntroducirNumeros
{
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int cont = 0;
    boolean sigo = true;
    while(sigo)
    {
        System.out.println("Ingresar numero (-1 para cancelar)");
         int num = scanner.nextInt();
         if(num != -1)
         {
             cont = cont + 1 ;
         }
         else
         {
             sigo = false;
         }
    }
    System.out.println("Cantidad de numeros Ingresados: " + cont);

    }
}

