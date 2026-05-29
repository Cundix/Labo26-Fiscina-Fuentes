package alarmas;

import java.util.ArrayList;

public class DispositivoComplejo extends Dispositivo{
    private ArrayList<Dispositivo> dispositivos;

    public int calcularUmbral()
    {
        this.setUmbral(this.getUmbral()+1);

        for(Dispositivo dispositivo : dispositivos)
        {
            //Hacer esto
        }

        return 0;
    }
}
