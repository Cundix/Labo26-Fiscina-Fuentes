package alarmas;

import java.util.ArrayList;

/*Es medio rara la logica pero va algo así:
 * -> Los sistemas de dispositivos son 1 lista de detectores
 *
 * -> Esta clase representa lo que sería una instalación completa, ej un edificion,
 * donde puede haber varios sistemas de las mismas cosas, esto sirve porque si por ejemplo
 * hay un incendio en el 9no piso del edificio, los detectores de los otros tirarían
 * el promedio para abajo y no se llama a nadie, entonces si hay un sistema por espacio evitamos eso.
 * Esos sistemas deberían estar en los arraylist de esta clase que sería el edificio.
 *
 *
 */

public class SistemaGeneral {
    private ArrayList<SistemaDetectoresHumo> listaSistemaDetectoresHumo;
    private ArrayList<SistemaDetectoresDeTemperatura> listaSistemaDetectoresDeTemperatura;
    private ArrayList<SistemaDetectoresDePresion> listaSistemaDetectoresDePresion;

    public SistemaGeneral() {
        listaSistemaDetectoresHumo = new ArrayList<SistemaDetectoresHumo>();
        listaSistemaDetectoresDeTemperatura = new ArrayList<SistemaDetectoresDeTemperatura>();
        listaSistemaDetectoresDePresion = new ArrayList<SistemaDetectoresDePresion>;


    }


}
