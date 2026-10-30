package sistemaPuntosArcoYFlecha;

import java.util.HashSet;

public class BeneficioComidas extends Beneficio implements Acumulable
{
    public HashSet<String> comidas;

    public BeneficioComidas(String nombre, String usuarioCreador, HashSet<String> comidas) {
        super(nombre, usuarioCreador);
        this.comidas = comidas;
    }

    public HashSet<String> getComidas() {
        return comidas;
    }

    public void setComidas(HashSet<String> comidas) {
        this.comidas = comidas;
    }

    @Override
    public int calcularDescuentoExtra()
    {
        return 4500;
    }
}
