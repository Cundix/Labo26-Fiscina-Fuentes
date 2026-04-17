package fechas;

import java.util.Scanner;
public class DiaLaboral {
    public static void main(String[] args) {
        String dia;
        System.out.println("Ingresar Día:");
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
