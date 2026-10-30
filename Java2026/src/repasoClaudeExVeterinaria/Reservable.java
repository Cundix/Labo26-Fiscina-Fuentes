package repasoClaudeExVeterinaria;

public interface Reservable {

    public void reservarTurno(int cantAReservar) throws NoHaySuficientesTurnosException;
    public void descripcionDeReserva();
    public float calcularPrecio(int ca);
    public void chequearTurnos(int cantAReservar) throws NoHaySuficientesTurnosException;
    public void tomarTurnos(int cantAReservar);


}
