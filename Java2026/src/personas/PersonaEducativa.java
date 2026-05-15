package personas;

import empresarial.SistemaBuffet;
import fechas.Fecha;
import fechas.Hora;
import objetos.Pedido;
import objetos.Plato;

public class PersonaEducativa extends Persona{
    private int porcentajeDto;

    public PersonaEducativa()
    {
        super();
        this.porcentajeDto = 0;
    }
    public PersonaEducativa(int porcentajeDto) {}

    public PersonaEducativa(String nombre, String apellido, int edad, Fecha fechaNacimiento, String direccion) {
    }

    public int getPorcentajeDto() {
        return porcentajeDto;

    }

    public void setPorcentajeDto(int porcentajeDto) {}

    public Pedido hacerPedido(Plato plato, Hora hora, Fecha fechaActual) {
        return new Pedido(fechaActual, plato, this, hora, false);
    }
}
