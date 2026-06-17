package platoplatito_u6ej2;

public abstract class Plato
{
    private String nombre;
    private Dificultad dificultad;
    private String listaDePasos;

    public Plato(String nombre)
    {
        dificultad = Dificultad.FACIL;
        this.nombre = nombre;
        listaDePasos = "1-  esto \n 2- y esto \n y lo otro";


    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Dificultad getDificultad() {
        return dificultad;
    }

    public void setDificultad(Dificultad dificultad) {
        this.dificultad = dificultad;
    }

    public String getListaDePasos() {
        return listaDePasos;
    }

    public void setListaDePasos(String listaDePasos) {
        this.listaDePasos = listaDePasos;
    }
}
