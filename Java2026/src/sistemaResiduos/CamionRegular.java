package sistemaResiduos;

public class CamionRegular extends Camion
{
    public CamionRegular(String patente, String modelo)
    {
        super(patente, modelo);
    }

    @Override
    public boolean agregarTipoTransportado(TipoResiduo tipoResiduo)
    {
        this.getResiduosTransportados().add(tipoResiduo);
        return true;
    }


}
