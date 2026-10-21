package tratamientoSangre;

import java.util.HashSet;

public class Joven extends Paciente implements Tratable{

    private static tipoSangre tipoSangreObjetivo = tipoSangre.AP;
    private HashSet<String> actividadesDeportivas;

    @Override
    public boolean chequearAdmision()
    {
        return (this.edad >= 20 && this.edad <= 30);
    }

    public boolean chequearTratabilidad()
    {
        if(this.actividadesDeportivas.size() %2 != 0 && this.edad >= 28)
        {
            System.out.println("Lamentamos comunicarte que tu sangre no va a poder ser modificada");
            return true;
        }
        else System.out.println("Será un tratamiento costoso, pero lo vamos a lograr!");
        return false;
    }


    @Override
    public float calcularCosto() {
        if(!this.nacioEnAnioPar()) return this.fechaNacimiento.getMonthValue()*760000;
        else return this.fechaNacimiento.getDayOfMonth()*145000;
    }

    @Override
    public boolean yaEsObjetivo() {
        return (this.tipoActual.equals(tipoSangreObjetivo));
    }

    @Override
    public boolean puedeComenzar() {
        if(this.chequearTratabilidad())
        {
            System.out.println("el costo total será de: " + this.calcularCosto() + "ARS");
            return true;
        }
    }


}
