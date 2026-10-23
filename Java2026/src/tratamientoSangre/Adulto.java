package tratamientoSangre;

public class Adulto extends Paciente{
    @Override
    public boolean chequearAdmision() {
        return this.edad > 30 && this.edad <= 60;
    }

    @Override
    public boolean chequearTratabilidad() {
        System.out.println("Lamentablemente no aceptamos adultos x ahora :(");
        return false;
    }
}
