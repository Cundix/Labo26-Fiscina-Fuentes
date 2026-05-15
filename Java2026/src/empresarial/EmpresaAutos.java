package empresarial;

import vehiculos.Vehiculo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class EmpresaAutos {
    private String nombre;
    private ArrayList<Vehiculo> vehiculos;

    public String vehiculoMasFrecuente()
    {
        int contadorCamioneta = 0;
        int contadorCoche = 0;
        for(Vehiculo v : vehiculos)
        {
            if(v.getTipo() == "Camioneta")
            {
                contadorCamioneta++;
            }
            else {
                contadorCoche++;
            }

        }

        if (contadorCoche > contadorCamioneta) return "Coches";
        else return "Camionetas";
    }

    public static void main(String[] args) {

    }
}
