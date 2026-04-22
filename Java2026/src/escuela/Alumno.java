package escuela;

import fechas.Fecha;
import java.util.ArrayList;
import java.util.Arrays;

public class Alumno {
    private String nombre;
    private  String apellido;
    private Fecha fechaNacimiento;
    private ArrayList<Float> listaNotas;
    private ArrayList<Materias> materias;

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public Alumno (String nombre, String apellido, Fecha fechaNacimiento, ArrayList<Float> listaNotas, ArrayList<Materias> materias) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.listaNotas = listaNotas;
        this.materias = materias;
    }
    public Alumno() {
        nombre = "";
        apellido = "";
        fechaNacimiento = new Fecha();
        listaNotas = new ArrayList<>();
        materias = new ArrayList<>();
        listaNotas = Arrays.asList();
    }

    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
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

    public static void main(String[] args) {
        Alumno a1 = new Alumno();
        Alumno a2 = new Alumno();



    }



}
