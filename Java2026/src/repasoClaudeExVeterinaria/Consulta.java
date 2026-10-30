package repasoClaudeExVeterinaria;

public class Consulta extends Servicio implements Reservable {
    int cantEstudios;



    @Override
    public void reservarTurno(int cantAReservar) throws NoHaySuficientesTurnosException {

        this.chequearTurnos(cantAReservar);
        this.cantTurnosDisponibles -= cantAReservar;

    }

    @Override
    public void descripcionDeReserva() {

    }

    @Override
    public float calcularPrecio() {
        return this.precioSesion*
    }

    @Override
    public void chequearTurnos(int cantAReservar) throws NoHaySuficientesTurnosException {
        if(this.cantTurnosDisponibles < cantAReservar) throw new NoHaySuficientesTurnosException("No hay suficientes turnos");

    }

    @Override
    public void conocerProtocolo() {

    }

    @Override
    public void agregarse(Sistema sistema) {

    }
}
