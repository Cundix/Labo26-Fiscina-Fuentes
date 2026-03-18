package Unidad0;
import java.util.Scanner;
public class EJ4 {
    public static void main(String[] args) {
        String dia;
        System.out.println("Ingresar Día: (EN MINUSCULA BOBI)");
        Scanner scanner = new Scanner(System.in);
        dia = scanner.nextLine();
        if(dia != "sabado" && dia != "domingo")
        {
            System.out.println("Es dia laboral");
        }
        else
        {
            System.out.println("No es un dia laboral");
        }
    }
}
