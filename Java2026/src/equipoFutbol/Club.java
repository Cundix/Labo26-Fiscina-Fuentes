package equipoFutbol;

import java.util.HashSet;

public class Club {
    private HashSet<Integrante> integrantes;

    public void contratar(Integrante posibleEmpleado) throws NoContratable
    {
        if(posibleEmpleado.contratable() && !(posibleEmpleado.trabajoEnClub(this)))
        {
            this.integrantes.add(posibleEmpleado);
            System.out.println(posibleEmpleado.getNombre() + "ha sido contrata");
        }
        else throw new NoContratable("La persona no se puede contratar");
    }

    public Club() {
        this.integrantes = new HashSet<Integrante>();
    }

    public static void main(String[] args) {
        Club club = new Club();

        Entrenador e1 = new Entrenador();
        JugadorCampo jc1 = new JugadorCampo();
        Arquero a1 = new Arquero();
        PrepFisico p1 = new PrepFisico();


        try {
            club.contratar(e1);
            club.contratar(jc1);
            club.contratar(a1);
            club.contratar(p1);
        }
        catch (NoContratable noContratable)
        {
            System.out.println(noContratable.getMessage());
        }


    }
}
