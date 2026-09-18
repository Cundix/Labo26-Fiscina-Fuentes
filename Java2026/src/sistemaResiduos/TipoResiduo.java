package sistemaResiduos;

public class TipoResiduo
{
    private String nombre;
    private boolean reciclable;
    private String tratamiento;

    public TipoResiduo(String nombre, boolean reciclable) {
        this.nombre = nombre;
        this.reciclable = reciclable;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean esReciclable() {
        return reciclable;
    }

    public void setReciclable(boolean reciclable) {
        this.reciclable = reciclable;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }


}
