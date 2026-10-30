package repasoUltimaPrueba;

public class FaltaEnergiaExeption extends RuntimeException {
    private int energia;

    public FaltaEnergiaExeption(String message, int energia) {
        super(message);
        this.energia = energia;
    }
}
