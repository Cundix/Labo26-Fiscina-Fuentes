public class Persona {
    private String nombre;
    private int edad;
    private String direccion;

    public void showData()
    {
        System.out.println(this.nombre);
        System.out.println(this.edad);
        System.out.println(this.direccion);
    }

    public int getEdad() {
        return edad;
    }

    public Persona() {
        this.edad = 30;
        this.nombre = "Josh";
        this.direccion = "Beiro 920, Vte. Lopez";
    }

    public String getNombre() {
        return nombre;
    }
    public static void main(String[] args) {

    }


}
