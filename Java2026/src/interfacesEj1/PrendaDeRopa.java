package interfacesEj1;

public class PrendaDeRopa extends ObjetoPrestar
{
    private String color;
    private Material material;
    private Estado estado;

    public PrendaDeRopa(String color, Material material, Estado estado) {
        super();
        this.color = color;
        this.material = material;
        this.estado = estado;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "color='" + color + '\'' +
                ", material=" + material +
                ", estado=" + estado;
    }

    public boolean verificar()
    {
        return (estado.equals(Estado.INMACULADO));
    }

}
