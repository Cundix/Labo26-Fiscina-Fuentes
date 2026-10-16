package sistemaPuntosArcoYFlecha;

import java.util.HashSet;

public class BeneficioTragos extends Beneficio
{
    private HashSet<String> tragos;

    public BeneficioTragos(String nombre, String usuarioCreador, HashSet<String> tragos) {
        super(nombre, usuarioCreador);
        this.tragos = tragos;
    }

    public HashSet<String> getTragos() {
        return tragos;
    }

    public void setTragos(HashSet<String> tragos) {
        this.tragos = tragos;
    }
}
