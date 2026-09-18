package sistemaResiduos;

import java.util.HashSet;

public class CamionReciclable extends Camion
{
    public CamionReciclable(String modelo, String patente, HashSet<TipoResiduo> residuosTransportados)
    {
        super(modelo, patente, residuosTransportados);
    }

    public CamionReciclable(String patente, String modelo) {
        super(patente, modelo);
    }

    @Override
    public boolean agregarTipoTransportado(TipoResiduo tipoResiduo)
    {
        if(tipoResiduo.esReciclable() && !this.getResiduosTransportados().contains(tipoResiduo))
        {
            this.getResiduosTransportados().add(tipoResiduo);
            return true;
        }
        return false;
    }





}
