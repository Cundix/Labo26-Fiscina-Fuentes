package repasoClaudeExVeterinaria;

public class Consulta extends Servicio implements Reservable {
    int cantEstudios;



    @Override
    public void reservarTurno(int cantAReservar) throws NoHaySuficientesTurnosException {

        this.chequearTurnos(cantAReservar);
        this.calcularPrecio(cantAReservar);
        this.tomarTurnos(cantAReservar);

    }



    @Override
    public float calcularPrecio(int cantidadReservas) {
        return this.precioSesion*cantidadReservas;
    }


    @Override
    public void chequearTurnos(int cantAReservar) throws NoHaySuficientesTurnosException {
        if(this.cantTurnosDisponibles < cantAReservar) throw new NoHaySuficientesTurnosException("No hay suficientes turnos");
        System.out.println("Turnos suficientes");
    }

    @Override
    public void tomarTurnos(int cantAReservar) {
        this.cantTurnosDisponibles -= cantAReservar;
    }



    @Override
    public void descripcionDeReserva() {

    }

    @Override
    public void conocerProtocolo() {

    }

    @Override
    public void agregarse(Sistema sistema) {
        sistema.agregarAReservables(this);
        sistema.agregarServicioNormal(this);
    }

    public Consulta(int duracion, Insumo insumo, float honorarios, int cantTurnosDisponibles, float precioSesion, int cantEstudios) {
        super(duracion, insumo, honorarios, cantTurnosDisponibles, precioSesion);
        this.cantEstudios = cantEstudios;
    }
}
