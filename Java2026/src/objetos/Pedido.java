package objetos;

import fechas.Fecha;
import personas.Alumno;
import personas.Persona;
import fechas.Hora;

public class Pedido
{
    private Fecha fechaCreacion;
    private Plato plato;
    private Persona persona;
    private Hora hora;
    private Boolean entregado;


    public Pedido(Fecha fechaCreacion, Plato plato, Persona persona, Hora hora, Boolean entregado) {
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

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
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

    public void setEntregado(Boolean entregado) {
        this.entregado = entregado;
    }

    public Pedido(Plato plato, Persona persona, Hora hora) {
        this.plato = plato;
        this.persona = persona;
        this.hora = hora;
        this.fechaCreacion = new Fecha();
        this.entregado = false;
    }
}
