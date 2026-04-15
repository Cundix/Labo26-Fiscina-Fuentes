package carreras;


import java.util.ArrayList;

public class Carrera {
    private String name;
    private int participantes;

    public Carrera(String name, int participantes)
    {
        this.participantes = participantes;
        this.name = name;

    }

    public int getParticipantes() {
        return participantes;
    }

    public String getName() { return this.name;}

    public static void main(String[]args)
    {
        Carrera carrera = new Carrera("London Marathon", 25);
        ArrayList<Corredor> corredors = new ArrayList<>();

        for(int i = 0; i < carrera.getParticipantes(); i++)
        {
            Corredor corredor = new Corredor();
            corredors.add(corredor);
            System.out.println("EL corredor n°" +i +" para " + carrera.getName() + " es: " + corredor.getName());
        }


    }
}
