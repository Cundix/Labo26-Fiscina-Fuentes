package companiaAlimentaria;

public class TablaNutricional {
    private int calorias;
    private float proteinas;
    private float grasasTotales;

    public int getCalorias() {
        return calorias;
    }

    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    public float getProteinas() {
        return proteinas;
    }

    public void setProteinas(float proteinas) {
        this.proteinas = proteinas;
    }

    public float getGrasasTotales() {
        return grasasTotales;
    }

    public void setGrasasTotales(float grasasTotales) {
        this.grasasTotales = grasasTotales;
    }

    public TablaNutricional(int calorias, float proteinas, float grasasTotales) {
        this.calorias = calorias;
        this.proteinas = proteinas;
        this.grasasTotales = grasasTotales;
    }

    public TablaNutricional() {
        this.calorias = 100;
        this.proteinas = 5;
        this.grasasTotales = 1;
    }

    public void MostrarTabla()
    {
        System.out.println("Calorias: " + this.calorias);
        System.out.println("Proteinas: " + this.proteinas);
        System.out.println("Grasas totales: " + this.grasasTotales);
    }
}
