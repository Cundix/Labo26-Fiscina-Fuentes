package Unidad0;

import java.util.Scanner;

public class MontañaRusa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean sigo = true;
        boolean menorAltura = false;
        int contador = 0;
        float promedio = 0;
        float altura = 0;
        while(sigo)
        {
            altura = scanner.nextFloat();
            if(altura == 0) sigo = false;
            else
            {
                promedio += altura;
                if(altura < 1.40) menorAltura = true;
                contador++;
            }
        }
        promedio /= contador;
        System.out.println("El promedio de alturas es: " + promedio);
        if(menorAltura) System.out.println("ADVERTENCIA: Se encontro una persona de menos de 1.40");
        System.out.println("Subieron " + contador + " personas");
    }
}
