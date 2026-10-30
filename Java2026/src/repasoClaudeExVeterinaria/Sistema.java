package repasoClaudeExVeterinaria;

import org.w3c.dom.html.HTMLIsIndexElement;

import javax.print.attribute.HashAttributeSet;
import java.util.HashMap;
import java.util.HashSet;

public class Sistema {
    private HashSet<Servicio> servicios;
    private HashMap<Reservable, Integer> reservables;
    private HashSet<Reserva> reservas;

    public void registrarReserva(int cantReservas){

    }

    public void agregarServicio(Servicio servicio)
    {
        servicio.agregarse(this);
    }

    public void agregarNuevoaTurnos(Servicio servicio)
    {

    }

    public void cantidadServiciosReservables()
    {

    }



}
