package interfacesEj1;

public class ObjetoPrestar
{
    private boolean prestado;

    public ObjetoPrestar()
    {
        prestado = false;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }
}
