package personas;

import escuela.Materias;
import fechas.Fecha;
import java.util.ArrayList;

public class Alumno extends Persona {

    private ArrayList<Float> listaNotas;
    private ArrayList<Materias> materias;

    public Alumno (String nombre, String apellido, int edad, Fecha fechaNacimiento, String direccion, ArrayList<Float> listaNotas, ArrayList<Materias> materias)
    {
        super(nombre, apellido, edad, fechaNacimiento, direccion);
        this.listaNotas = listaNotas;
        this.materias = materias;
    }
    public Alumno(ArrayList<Float> listaNotas, ArrayList<Materias> materias) {

        listaNotas = new ArrayList<>();
        materias = new ArrayList<>();
    }


    public ArrayList<Float> getListaNotas() {
        return listaNotas;
    }
    public void setListaNotas(ArrayList<Float> listaNotas) {
        this.listaNotas = listaNotas;
    }

    public void addNota(float nota){
        this.listaNotas.add(nota);
    }

    public void mayorNota()
    {
        float valorInicial = 0;
        for(Float nota: this.listaNotas)
        {
            if(nota > valorInicial)
            {
                valorInicial = nota;
            }
        }
        System.out.println("Mayor Nota: " + valorInicial);
    }
    public void menorNota()
    {
        float valorInicial = 0;
        for(Float nota: this.listaNotas)
        {
            if(nota < valorInicial)
            {
                valorInicial = nota;
            }
        }
        System.out.println("Menor nota: " + valorInicial);
    }

    public ArrayList<Materias> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<Materias> materias) {
        this.materias = materias;
    }

    public void agregarMaterias(Materias materia)
    {
        this.materias.add(materia);
    }

    public void eliminarMaterias(Materias materia)
    {
        this.materias.remove(materia);
    }

    public float promedioNotas()
    {
        float promedio = 0;
        for(Float nota: this.listaNotas)
        {
            promedio += nota;
        }

        promedio = promedio/this.listaNotas.size();
        return promedio;
    }

    public static void main(String[] args)
    {
        Alumno a1 = new Alumno("Lionel", "Messi", 38,  new Fecha(24, 6, 1987), "", new ArrayList<>(), new ArrayList<>());

        System.out.println("--- ESTADÍSTICAS DEL ALUMNO ---");
        a1.addNota(10.0f);
        a1.addNota(8.5f);
        a1.addNota(9.0f);

        System.out.println("Alumno: " + a1.getNombre() + " " + a1.getApellido());
        System.out.println("Lista de Notas: " + a1.getListaNotas());
        System.out.println("Promedio: " + a1.promedioNotas());
        a1.mayorNota();
        a1.menorNota();

        System.out.println("\n--- GESTIÓN DE MATERIAS ---");
        Materias materia1 = new Materias();
        materia1.setNombre("Programación II");
        materia1.addContenido("Interfaces y Herencia");

        System.out.println("\nMaterias que cursa " + a1.getNombre() + ":");
        for (Materias m : a1.getMaterias()) {
            System.out.println("- " + m.getNombre());
        }

        a1.agregarMaterias(materia1);
        materia1.inscribirAlumno(a1);

        System.out.println("\nMaterias que cursa " + a1.getNombre() + ":");
        for (Materias m : a1.getMaterias()) {
            System.out.println("- " + m.getNombre());
        }

        System.out.println("\nPromedio de edad en " + materia1.getNombre() + ":");
        System.out.println(materia1.promedioEdadAlumnos() + " años");
    }



}
