package repasoClaudeExVeterinaria;

import java.time.LocalDate;

public class Reserva {
    private LocalDate fecha;
    private Reservable tipoReserva;

    public Reserva(LocalDate fecha, Reservable tipoReserva) {
        this.fecha = fecha;
        this.tipoReserva = tipoReserva;
    }
}
