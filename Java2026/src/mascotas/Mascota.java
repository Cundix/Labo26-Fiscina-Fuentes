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

    public void saludar(String saludo)
    {
        if(this.getAlegria() >= 1)
        {
            for(int i = 0; i < this.getAlegria(); i++)
            {
                System.out.println(saludo);
            }
            if(!(getAlegria() > 1))
            {
                this.restarAlegria();
            }
        }
    };

    public abstract void saludo (String persona, String saludo);

    public void alimentar()
    {
        this.sumarAlegria();
    };

    public void sumarAlegria()
    {
        this.alegria++;
    };

    public void restarAlegria()
    {
        this.alegria--;
    };

}
