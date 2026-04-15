public class Tecnico {

    private String nombre;
    private String apellido;
    private Fecha nacimiento;
    private String especialidad;
    private Cohete coheteAsignado;

    public Tecnico(String nombre, String apellido, Fecha fecha, String especialidad, Cohete cohete)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacimiento = fecha;
        this.especialidad = especialidad;
        this.coheteAsignado = cohete;
    }

    public void setEspecialidad(String especialidad)
    {
        this.especialidad = especialidad;
    }
    public void setCoheteAsignado(Cohete cohete)
    {
        this.coheteAsignado = cohete;
    }
    public void activarCoheteAsig()
    {
        int cant = 3;
        coheteAsignado.activar(cant);
    }
    public boolean capacitado(Cohete cohete)
    {
        boolean res = true;
        if(cohete.getVelocidadMax() > 28000 && !(this.especialidad.equals("Navegacion"))) res = false;
        else if(cohete.getCPropulsores() >= 4 && !(this.especialidad.equals("Propulsion"))) res = false;
        else if(cohete.getLargo() > 70 && !(this.especialidad.equals("Estrucutura"))) res = false;
        return res;
    }
    public void cambioCohete(Cohete cohete)
    {
        if(capacitado(cohete))
        {
            this.setCoheteAsignado(cohete);
            System.out.printf("Cohete asignado con exito.");
        }
        else
        {
            System.out.println("No esta capacitado para ese cohete.");
        }
    }

    public static void main(String[] args) {
        Cohete cohete1 = new Cohete("Cohete 1", 28000, 10, 80, 4);
        Cohete cohete2 = new Cohete("Cohete 2", 22000, 15, 60, 2);
        Cohete cohete3 = new Cohete("Cohete 3", 24000, 16, 50, 1);
        Tecnico tecnico1 = new Tecnico("Roberto", "Sanchez", new Fecha(11, 03, 2009), "Propulsion", cohete1);
        Tecnico tecnico2 = new Tecnico("Pedro", "Sanchez", new Fecha(11, 03, 2009), "Estructura", cohete2);

        tecnico1.cambioCohete(cohete3);
        tecnico2.cambioCohete(cohete1);

        tecnico1.activarCoheteAsig();
        tecnico2.activarCoheteAsig();

    }

}
