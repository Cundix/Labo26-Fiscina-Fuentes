package tratamientoSangre;

import personas.Persona;

public abstract class Paciente extends Persona {
    public abstract boolean chequearAdmision();
    public abstract boolean chequearTratabilidad();
    protected tipoSangre tipoActual;


}
