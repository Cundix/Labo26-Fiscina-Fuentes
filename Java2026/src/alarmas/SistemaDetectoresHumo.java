package alarmas;

import java.util.ArrayList;

public class SistemaDetectoresHumo {


    private ArrayList<DetectorDeHumo> listaDetectores;

    public SistemaDetectoresHumo() {
        this.listaDetectores = new ArrayList<>();
    }

    public ArrayList<DetectorDeHumo> getListaDetectores() {
        return listaDetectores;
    }

}

