package tratamientoSangre;

public class Geronte extends Paciente{

    @Override
    public boolean chequearAdmision() {
        return this.edad > 60;
     }

    @Override
    public boolean chequearTratabilidad() {
        System.out.println("Lamentablemente los gerontes no son tratables todavía");
        return false;
    }
}
