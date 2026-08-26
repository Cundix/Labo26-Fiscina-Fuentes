package mascotas;

public abstract class Mascota {
    private String name;
    private String nombreOwner;
    private int alegria;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNombreOwner() {
        return nombreOwner;
    }

    public void setNombreOwner(String nombreOwner) {
        this.nombreOwner = nombreOwner;
    }

    public int getAlegria() {
        return alegria;
    }

    public void setAlegria(int alegria) {
        this.alegria = alegria;
    }

    public abstract void saludar(String persona);

    public abstract void alimentar();

    public abstract String conocerEspecie();



}
