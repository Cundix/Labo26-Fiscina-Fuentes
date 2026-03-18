package Unidad0;

import java.util.Scanner;

public class IngresoDeDatos {
    public static void main(String[] args) {
        int N = 1;
        double A = 20;
        char C = 'C';

        System.out.println(C);
        System.out.println(N+A);
        System.out.println(A-N);
        int valorNumerico = C - 'A';
        System.out.println(valorNumerico);

        int numeroMayor = 0;
        int numero1;
        int numero2;

        Scanner scanner = new Scanner(System.in);
        numero1 = scanner.nextInt();
        numero2 = scanner.nextInt();
        if(numero1 > numero2)
        {
            numeroMayor = numero1;
        }
        else
        {
            numeroMayor = numero2;
        }
        System.out.println(numeroMayor);

        System.out.println("EJ 3:");
        for(int i = 0; i <101; i++)
        {
            if(i%2 == 0 && i%3 == 0)
            {
                System.out.println(i);
            }
        }

        int i = 0;
        while(i <100)
        {

            if(i %2 == 0 && i %3 == 0)
            {
                System.out.println(i);
            }
            i++;
        }
    }
}
