import java.util.Scanner;

public class MontañaRusa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean sigo = true;
        int contador = 0;
        float promedio = 0;
        float altura = 0;
        while(sigo)
        {
            System.out.println("Ingresa altura: ");
            altura = scanner.nextFloat();
            if(altura == 0) sigo = false;
            else
            {
                if(altura < 1.40) System.out.println("Altura menor a la permitida");
                else
                {
                    promedio += altura;
                    contador++;
                }
            }
        }
        promedio /= contador;
        System.out.println("El promedio de alturas es: " + promedio);
        System.out.println("Subieron " + contador + " personas");
    }
}
