package alarmas;

import java.util.ArrayList;

    public class SistemaDetectoresDeTemperatura {


        private ArrayList<DetectorDePresion> listaDetectores;

        public SistemaDetectoresDeTemperatura() {
            this.listaDetectores = new ArrayList<>();
        }

        public ArrayList<DetectorDePresion> getListaDetectores() {
            return listaDetectores;
        }


    }
}

}
