package personas;

import fechas.Fecha;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private Fecha fechaNacimiento;
    private String direccion;

    public Persona(String nombre, String apellido, int edad, Fecha fechaNacimiento, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
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
        this.fechaNacimiento = new Fecha();
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

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
