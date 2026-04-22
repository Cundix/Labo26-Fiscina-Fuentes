package escuela;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

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
            sumaEdadAlumnos += (LocalDate.now().compareTo(LocalDate.of(alumno.getFechaNacimiento().getDia(), alumno.getFechaNacimiento().getDia(), alumno.getFechaNacimiento().getAnio()));

        }
        return sumaEdadAlumnos;
    }

    
}
