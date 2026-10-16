package sistemaPuntosArcoYFlecha;

import java.util.HashSet;

public class BeneficioTragos
{
    private HashSet<String> tragos;

    public BeneficioTragos(HashSet<String> tragos)
    {
        this.tragos = tragos;
    }

    public HashSet<String> getTragos() {
        return tragos;
    }

    public void setTragos(HashSet<String> tragos) {
        this.tragos = tragos;
    }
}
