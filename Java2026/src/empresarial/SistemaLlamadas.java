package empresarial;

import fechas.Fecha;
import objetos.Llamada;
import objetos.LlamadaInternacional;
import objetos.LlamadaLocal;
import personas.Empleado;

import java.util.ArrayList;

public class SistemaLlamadas
{
    ArrayList<Llamada> registroLlamadas;

    public void registrarLlamada(Empleado empleadoOrigen, Empleado empleadoDestino, int minutos, Fecha fecha)
    {
        if(empleadoOrigen.getPais().equals(empleadoDestino.getPais()))
        {
            //llamada internacional
            LlamadaInternacional llamadaNueva = new LlamadaInternacional(empleadoOrigen, empleadoDestino, minutos, fecha, empleadoDestino.getCodigoPais(), 2);
            this.registroLlamadas.add(llamadaNueva);
        }
        else
        {
            //llamada local
            LlamadaLocal llamadaNueva = new LlamadaLocal(empleadoOrigen, empleadoDestino, minutos, fecha, empleadoOrigen.getProvincia(), empleadoDestino.getProvincia());
            this.registroLlamadas.add(llamadaNueva);
        }
    }

    public void mostrarLlamadasxEmpleado(Empleado empleado)
    {
        int i = 0;
        for(Llamada llamada : this.getLlamadasXempleado(empleado))
        {
            i++;
            llamada.mostrarInfo(i);
        }
    }

    public ArrayList<Llamada> getLlamadasXempleado(Empleado empleado)
    {
        ArrayList<Llamada> lista = new ArrayList<>();
        for(Llamada llamada : this.registroLlamadas)
        {
            if(llamada.getEmpleadoOrigen().getDni() == empleado.getDni() || llamada.getEmpleadoDestino().getDni() == empleado.getDni())
            {
                lista.add(llamada);
            }
        }
        return lista;
    }

    public ArrayList<Llamada> getRegistroLlamadas()
    {
        return this.registroLlamadas;
    }
}
