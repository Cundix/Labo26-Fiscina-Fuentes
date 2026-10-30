package sistemaPuntosArcoYFlecha;

import java.util.HashSet;

public class BeneficioGaseosa extends Beneficio implements Acumulable
{
    private HashSet<String> gaseosas;

    public BeneficioGaseosa(String nombre, String usuarioCreador, HashSet<String> gaseosas) {
        super(nombre, usuarioCreador);
        this.gaseosas = gaseosas;
    }

    @Override
    public int calcularDescuentoExtra()
    {
        return 1000;
    }
}
