public class Cancion {
    // Atributos privados para mantener el encapsulamiento
    private String titulo;
    private String autor;

    // a. Constructor por defecto (inicializa con cadenas vacías)
    public Cancion() {
        this.titulo = "";
        this.autor = "";
    }

    // b. Constructor parametrizado
    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    // c. Getters y Setters

    // Getters (Para obtener el valor)
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    // Setters (Para modificar el valor)
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}