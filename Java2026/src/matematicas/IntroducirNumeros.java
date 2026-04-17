package matematicas;

import java.util.Scanner;

public class IntroducirNumeros
{
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int cont = 0;
    int suma = 0;
    int mayor = 0;
    int menor = 0;
    int sumaP = 0;
    int sumaN = 0;

    boolean sigo = true;
    while(sigo)
    {

        System.out.println("Ingresar numero (-1 para cancelar)");
         int num = scanner.nextInt();
         if(cont == 0 && num != -1)
         {
             menor = num;
             mayor = num;
         }
         if(num != -1)
         {
             cont = cont + 1 ;
             if(num < 0) sumaN += num;
             else sumaP += num;
             if(menor > num) menor = num;
             if(mayor < num) mayor = num;
         }
         else
         {
             sigo = false;
         }
    }
    System.out.println("Cantidad de numeros Ingresados: " + cont +
                        "\nSuma de numeros Negativos: " + sumaN +
                        "\nSuma de numeros Positivos: " + sumaP +
                        "\nNumero menor: " + menor +
                        "\nNumero Mayor: " + mayor);

    }
}

