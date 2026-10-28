package repasoPruebaFinal_Juanse;

public abstract class Prueba
{
    private String nombrePrueba;
    private String descripcionPrueba;
    private Dificultad dificultad;
    private String recompensa;
    private Escenario escenario;
    private int consumoEnergia;
    private int nivelRiesgo;

    public Prueba(String nombrePrueba, Dificultad dificultad, String descripcionPrueba, String recompensa, Escenario escenario, int consumoEnergia,  int nivelRiesgo) {
        this.nombrePrueba = nombrePrueba;
        this.dificultad = dificultad;
        this.descripcionPrueba = descripcionPrueba;
        this.recompensa = recompensa;
        this.escenario = escenario;
        this.consumoEnergia = consumoEnergia;
        this.nivelRiesgo = nivelRiesgo;
    }

    public int getNivelRiesgo() {
        return nivelRiesgo;
    }

    public void setNivelRiesgo(int nivelRiesgo) {
        this.nivelRiesgo = nivelRiesgo;
    }

    public int getConsumoEnergia() {
        return consumoEnergia;
    }

    public void setConsumoEnergia(int consumoEnergia) {
        this.consumoEnergia = consumoEnergia;
    }

    public String getNombrePrueba() {
        return nombrePrueba;
    }

    public void setNombrePrueba(String nombrePrueba) {
        this.nombrePrueba = nombrePrueba;
    }

    public String getDescripcionPrueba() {
        return descripcionPrueba;
    }

    public void setDescripcionPrueba(String descripcionPrueba) {
        this.descripcionPrueba = descripcionPrueba;
    }

    public Dificultad getDificultad() {
        return dificultad;
    }

    public void setDificultad(Dificultad dificultad) {
        this.dificultad = dificultad;
    }

    public String getRecompensa() {
        return recompensa;
    }

    public void setRecompensa(String recompensa) {
        this.recompensa = recompensa;
    }

    public Escenario getEscenario() {
        return escenario;
    }

    public void setEscenario(Escenario escenario) {
        this.escenario = escenario;
    }


}
