package matematicas;

import java.util.Scanner;

public class NumeroMayor {
    public static void main(String[] args) {
        int numeroMayor = 0;
        int numero1;
        int numero2;

        Scanner scanner = new Scanner(System.in);
        numero1 = scanner.nextInt();
        numero2 = scanner.nextInt();
        if (numero1 > numero2) {
            numeroMayor = numero1;
        } else {
            numeroMayor = numero2;
        }
        System.out.println(numeroMayor);

    }
}

