public class Libro {
    private String titulo;
    private Persona autor;
    private int ISBN;
    private int cantPags;
    private String editorial;
    private Fecha publicacion;

    public Libro(String titulo, String editorial, Persona autor, int cantPags, int ISBN, Fecha publicacion)
    {
        this.titulo = titulo;
        this.editorial = editorial;
        this.autor = autor;
        this.cantPags = cantPags;
        this.ISBN = ISBN;
        this.publicacion = publicacion;
    }
}
