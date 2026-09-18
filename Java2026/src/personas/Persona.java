package personas;

import fechas.Fecha;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;

public abstract class Persona {
    private int dni;
    private String nombre;
    private String apellido;
    private int edad;
    private LocalDate fechaNacimiento;
    private String direccion;
    private String pais;
    private String provincia;

    public Persona(String nombre, String apellido, int edad, LocalDate fechaNacimiento, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
    }

    public Persona(String nombre, String apellido, int dni, String pais, String provincia)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.pais = pais;
        this.provincia = provincia;
    }

    public Persona(String nombre, String apellido, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Persona(String pais, String provincia)
    {
        this.pais = pais;
        this.provincia = provincia;
        nombre = "Empleado";
        apellido = "x";
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public int getDni() {
        return dni;
    }
    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }

    public Persona(String nombre, String apellido, int edad)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public void showData()
    {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Fecha nacimiento: " + fechaNacimiento);
        System.out.println("Direccion: " + direccion);
    }

    public int getEdad() {
        return edad;
    }

    public Persona() {
        this.nombre = "Josh";
        this.apellido = "Josh";
        this.edad = 30;
        this.fechaNacimiento = LocalDate.now();
        this.direccion = "Beiro 920, Vte. Lopez";
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

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
