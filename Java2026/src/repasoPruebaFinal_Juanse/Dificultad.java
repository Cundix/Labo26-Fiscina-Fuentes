package repasoPruebaFinal_Juanse;

public enum Dificultad
{
    FACIL(25), MODERADA(50), DIFICIL(75), MORTAL(100);

    private int valor;

    private Dificultad(int valor)
    {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
