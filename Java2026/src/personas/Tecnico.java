package personas;

import fechas.Fecha;

import objetos.Cohete;

public class Tecnico extends Persona {

    private String especialidad;
    private Cohete coheteAsignado;

    public Tecnico(String nombre, String apellido, int edad, Fecha fechaNacimiento, String direccion, String especialidad, Cohete cohete)
    {
        super(nombre, apellido, edad, fechaNacimiento, direccion);
        this.especialidad = especialidad;
        this.coheteAsignado = cohete;
    }
    public Tecnico(String especialidad, Cohete cohete)
    {
        super();
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
            System.out.printf("objetos.Cohete asignado con exito.");
        }
        else
        {
            System.out.println("No esta capacitado para ese cohete.");
        }
    }

    public static void main(String[] args) {

        Cohete cohete1 = new Cohete();
        Cohete cohete2 = new Cohete();
        Cohete cohete3 = new Cohete();
        Tecnico tecnico1 = new Tecnico("Navegacion", cohete1);
        Tecnico tecnico2 = new Tecnico("Propulsion", cohete1);
        Tecnico tecnico3 = new Tecnico("Estructura", cohete1);

        tecnico1.cambioCohete(cohete3);
        tecnico2.cambioCohete(cohete1);

        tecnico1.activarCoheteAsig();
        tecnico2.activarCoheteAsig();

    }

}
