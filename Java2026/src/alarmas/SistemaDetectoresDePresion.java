package alarmas;

import java.util.ArrayList;

    public class SistemaDetectoresDePresion {


        private ArrayList<DetectorDePresion> listaDetectores;

        public SistemaDetectoresDePresion() {
            this.listaDetectores = new ArrayList<>();
        }

        public ArrayList<DetectorDePresion> getListaDetectores() {
            return listaDetectores;
        }


    }
}
