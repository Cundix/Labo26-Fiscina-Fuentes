package escuela;

import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private  String apellido;
    private Fecha fechaNacimiento;
    private ArrayList<Float> listaNotas;
    private ArrayList<Materias> materias;

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
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


}
