package Unidad0;

public class DivisibleForDivisibleWhile {
    public static void main(String[] args) {

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
