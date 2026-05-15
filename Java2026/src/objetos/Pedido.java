package objetos;

import fechas.Fecha;
import personas.Alumno;
import personas.Persona;
import fechas.Hora;
import personas.PersonaEducativa;

public class Pedido
{
    private Fecha fechaCreacion;
    private Plato plato;
    private PersonaEducativa persona;
    private Hora hora;
    private double precioFinal;
    private Boolean entregado;


    public Pedido(Fecha fechaCreacion, Plato plato, PersonaEducativa persona, Hora hora, Boolean entregado) {
        this.fechaCreacion = fechaCreacion;
        this.plato = plato;
        this.persona = persona;
        this.hora = hora;
        this.entregado = entregado;
    }

    public Pedido()
    {
        
    }

    public Fecha getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Fecha fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Plato getPlato() {
        return plato;
    }

    public void setPlato(Plato plato) {
        this.plato = plato;
    }

    public PersonaEducativa getPersona() {
        return persona;
    }

    public void setPersona(PersonaEducativa persona) {
        this.persona = persona;
    }

    public Hora getHora() {
        return hora;
    }

    public void setHora(Hora hora) {
        this.hora = hora;
    }

    public Boolean getEntregado() {
        return entregado;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }

    public void setEntregado(Boolean entregado) {
        this.entregado = entregado;
    }

    public Pedido(Plato plato, PersonaEducativa persona, Hora hora) {
        this.plato = plato;
        this.persona = persona;
        this.hora = hora;
        this.fechaCreacion = new Fecha();
        this.entregado = false;
    }

    public void mostrarPedido() {
        System.out.println("----------------------------------------------------");
        System.out.println("Fecha: " + (fechaCreacion != null ? fechaCreacion : "N/D"));
        System.out.println("Hora: " + (hora != null ? hora : "N/D"));
        System.out.println("Cliente: " + (persona != null ? persona.getNombre() : "Anónimo"));
        System.out.println("Plato: " + (plato != null ? plato.getNombre() : "Sin especificar"));

        double mostrarPrecio = (precioFinal > 0) ? precioFinal : (plato != null ? plato.getPrecio() : 0.0);
        System.out.println("Precio: $" + mostrarPrecio);

        System.out.println("Estado: " + (entregado ? "ENTREGADO" : "PENDIENTE"));
    }
}
