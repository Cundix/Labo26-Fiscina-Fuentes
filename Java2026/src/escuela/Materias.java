package escuela;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

import fechas.Fecha;
import personas.Alumno;

public class Materias
{
    private String nombre;
    private ArrayList<Alumno> alumnosInscriptos;
    private ArrayList<String> listaContenidos;

    public Materias(String nombre, ArrayList<Alumno> alumnosInscriptos, ArrayList<String> listaContenidos) {
        this.nombre = nombre;
        this.alumnosInscriptos = alumnosInscriptos;
        this.listaContenidos = listaContenidos;
    }
    
    public Materias() {
        this.nombre = "Sin nombre";
        this.alumnosInscriptos = new ArrayList<>();
        this.listaContenidos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Alumno> getAlumnosInscriptos() {
        return alumnosInscriptos;
    }

    public void setAlumnosInscriptos(ArrayList<Alumno> alumnosInscriptos) {
        this.alumnosInscriptos = alumnosInscriptos;
    }

    public ArrayList<String> getListaContenidos() {
        return listaContenidos;
    }

    public void setListaContenidos(ArrayList<String> listaContenidos) {
        this.listaContenidos = listaContenidos;
    }

    public int promedioEdadAlumnos()
    {
        int sumaEdadAlumnos = 0;
        for (Alumno alumno : alumnosInscriptos)
        {
            sumaEdadAlumnos += Period.between(
                    LocalDate.of(alumno.getFechaNacimiento().getAnio(), alumno.getFechaNacimiento().getMes(), alumno.getFechaNacimiento().getDia()),
                    LocalDate.now()
            ).getYears();
        }
        sumaEdadAlumnos = sumaEdadAlumnos / alumnosInscriptos.size();
        return sumaEdadAlumnos;
    }

    public void inscribirAlumno(Alumno alumno)
    {
        if(!this.alumnosInscriptos.contains(alumno))
        {
            this.alumnosInscriptos.add(alumno);
            System.out.println("Alumno inscripto: " + alumno.getNombre());
        }
        else System.out.println("Error: El alumno ya esta inscripto");
    }

    public void listarAlumnos()
    {
        for (Alumno alumno : alumnosInscriptos)
        {
            System.out.println("Alumno: " + alumno.getNombre());
        }
    }

    public void addContenido(String contenido)
    {
        this.listaContenidos.add(contenido);
    }

    public static void main(String[] args)
    {
        Alumno al1 = new Alumno("Julian", "Alvarez", 44,  new Fecha(31, 1, 2000), "", new ArrayList<>(), new ArrayList<>());
        Alumno al2 = new Alumno("Enzo", "Fernandez", 45, new Fecha(17, 1, 2001), "", new ArrayList<>(), new ArrayList<>());

        Materias programacion = new Materias("Programacion II", new ArrayList<>(), new ArrayList<>());

        System.out.println("--- Probando Materia: " + programacion.getNombre() + " ---");

        programacion.addContenido("Java Avanzado");
        programacion.addContenido("Persistencia de Datos");

        programacion.inscribirAlumno(al1);
        programacion.inscribirAlumno(al2);
        programacion.inscribirAlumno(al1);

        System.out.println("\nListado de alumnos:");
        programacion.listarAlumnos();

        System.out.println("\nPromedio de edad de la cursada:");
        System.out.println(programacion.promedioEdadAlumnos() + " años");
    }

}
