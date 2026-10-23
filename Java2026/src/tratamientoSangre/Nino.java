package tratamientoSangre;

public class Nino extends Paciente implements Tratable{

    private int nivelTolerancia;
    private static tipoSangre tipoSangreObjetivo = tipoSangre.ABP;


    @Override
    public boolean chequearAdmision() {
        return(this.edad<20);
    }

    @Override
    public boolean chequearTratabilidad() {
        if (this.edad > 3)
        {
            System.out.println("Tu tratamiento tardará: " + this.nivelTolerancia*2 + " dias.");
            return true;
        }
        else System.out.println("El nino es muy chico para ser tratado");
        return false;
    }

    @Override
    public float calcularCosto() {
        return this.nivelTolerancia*450000;
    }

    @Override
    public boolean yaEsObjetivo() {
        return(this.tipoActual.equals(tipoSangreObjetivo));
    }

    @Override
    public boolean puedeComenzar() {
        if(this.chequearTratabilidad() && !(this.yaEsObjetivo()))
        {
            System.out.println("el costo total será de: " + this.calcularCosto() + "ARS");
            return true;
        }
        return false;
    }
}
