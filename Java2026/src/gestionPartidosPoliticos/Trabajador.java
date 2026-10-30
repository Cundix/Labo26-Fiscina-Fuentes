package gestionPartidosPoliticos;

import personas.Persona;

import java.time.LocalDate;
import java.time.LocalTime;

public class Trabajador extends Persona implements Comunicador {
    private LocalTime horarioEntrada;
    private LocalTime horarioSalida;
    private String nombre;
    private String apellido;
    private String DNI;
    private LocalDate fechaNacimiento;
    private float sueldo;
    private String residencia;
    private String cuil;

    public Trabajador(int dni, String nombre, String apellido, int edad, LocalDate fechaNacimiento, String direccion, String pais, String provincia, LocalTime horarioEntrada, LocalTime horarioSalida, String nombre2, String apellido2, String DNI, LocalDate fechaNacimiento2, float sueldo, String residencia, String cuil) {
        super(dni, nombre, apellido, edad, fechaNacimiento, direccion, pais, provincia);
        this.horarioEntrada = horarioEntrada;
        this.horarioSalida = horarioSalida;
        this.nombre = nombre2;
        this.apellido = apellido2;
        this.DNI = DNI;
        this.fechaNacimiento = fechaNacimiento2;
        this.sueldo = sueldo;
        this.residencia = residencia;
        this.cuil = cuil;
    }

    public Trabajador() {
    }

    public LocalTime getHorarioEntrada() {
        return horarioEntrada;
    }

    public void setHorarioEntrada(LocalTime horarioEntrada) {
        this.horarioEntrada = horarioEntrada;
    }

    public LocalTime getHorarioSalida() {
        return horarioSalida;
    }

    public void setHorarioSalida(LocalTime horarioSalida) {
        this.horarioSalida = horarioSalida;
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

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public String getResidencia() {
        return residencia;
    }

    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }

    public String getCuil() {
        return cuil;
    }

    public void setCuil(String cuil) {
        this.cuil = cuil;
    }



    // hacer una  exeption
    @Override
    public void enviarMensaje() throws ProblemaComunicacion{
        if(LocalTime.now().isAfter(horarioEntrada) && LocalTime.now().isBefore(horarioSalida))
        {
            System.out.println("Yo " + this.getNombre() + " te invito a que...");
        }
        else throw new ProblemaComunicacion("El trabajador no está en horario laboral");
    }
}
