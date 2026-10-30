package repasoPruebaFinalEj2;

public abstract class Ayudante
{
    private String nombre;
    private String apellido;
    private String aldeaOrigen;
    private Taller tallerAsignado;

    public Ayudante(String nombre, String apellido, String aldeaOrigen, Taller tallerAsignado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.aldeaOrigen = aldeaOrigen;
        this.tallerAsignado = tallerAsignado;
    }

    public Ayudante(String nombre, Taller tallerAsignado) {
        this.nombre = nombre;
        this.tallerAsignado = tallerAsignado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getAldeaOrigen() {
        return aldeaOrigen;
    }

    public void setAldeaOrigen(String aldeaOrigen) {
        this.aldeaOrigen = aldeaOrigen;
    }

    public Taller getTallerAsignado() {
        return tallerAsignado;
    }

    public void setTallerAsignado(Taller tallerAsignado) {
        this.tallerAsignado = tallerAsignado;
    }

    public abstract void prepararEstacion();

    public abstract void envolverRegalo(Regalo regalo) throws TamanioNoValidoException;
}
