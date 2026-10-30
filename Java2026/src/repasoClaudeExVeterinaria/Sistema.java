package repasoClaudeExVeterinaria;

import org.w3c.dom.html.HTMLIsIndexElement;

import javax.print.attribute.HashAttributeSet;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.HashSet;

public class Sistema {
    private HashSet<Servicio> servicios;
    private HashMap<Reservable, Integer> reservables;
    private HashSet<Reserva> reservasHistorial;

    public Sistema(HashSet<Servicio> servicios, HashMap<Reservable, Integer> reservables, HashSet<Reserva> reservasHistorial) {
        this.servicios = servicios;
        this.reservables = reservables;
        this.reservasHistorial = reservasHistorial;
    }


    public void registrarReserva(int cantReservas, Reservable reservable){
        try
        {
            reservable.reservarTurno(cantReservas);
            this.agregarAlHistorial(reservable);
            System.out.println("Reserva exitosa!");

        }
        catch (NoHaySuficientesTurnosException nhst)
        {
            System.out.println("No se puede hacer la reserva porque no hay suficientes turnos");
        }

    }

    public void agregarAlHistorial(Reservable reservable)
    {
        Reserva reserva = new Reserva(LocalDate.now(), reservable);
        this.reservasHistorial.add(reserva);
    }


    public void agregarServicio(Servicio servicio)
    {
        servicio.agregarse(this);
    }

    public void agregarAReservables(Reservable reservable){
        this.reservables.merge(reservable, 1, Integer::sum);
    }

    public void agregarServicioNormal(Servicio servicio)
    {
        this.servicios.add(servicio);
    }

    public void agregarNuevosTurnos(Servicio servicio, int cantSumar)
    {
        servicio.sumarTurnos(cantSumar);
    }

    public void cantidadServiciosReservables()
    {
        System.out.println("La cant de reservables es: " + this.reservables.size());
    }



}
