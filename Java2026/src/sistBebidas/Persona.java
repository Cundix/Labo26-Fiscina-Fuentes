package sistBebidas;

import java.util.ArrayList;

public class Persona
{
    private String nombre;
    private String apellido;
    private int DNI;
    private ArrayList<Bebida> listaBebidas;

    public Persona(String nombre, String apellido, int DNI) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        listaBebidas = new ArrayList<>();
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

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public ArrayList<Bebida> getListaBebidas() {
        return listaBebidas;
    }

    public void setListaBebidas(ArrayList<Bebida> listaBebidas) {
        this.listaBebidas = listaBebidas;
    }

    public void consumirBebida(Bebida bebida, int cantidad)
    {
        for(int i = 0; i < cantidad; i++)
        {
            this.listaBebidas.add(bebida);
        }
        System.out.println(this.nombre + " consumió x" + cantidad + " de " + bebida.getNombre());
    }

    public double calcularQPersona()
    {
        double resultado = 0;
        for(Bebida bebida : listaBebidas)
        {
            resultado += bebida.calcularQ();
        }
        return resultado;
    }

    public Persona mayorQque(Persona persona)
    {
        if(persona.calcularQPersona() > this.calcularQPersona())
        {
            return persona;
        }
        else return this;
    }

    public Persona menorQque(Persona persona)
    {
        if(persona.calcularQPersona() < this.calcularQPersona())
        {
            return persona;
        }
        else return this;
    }

}
