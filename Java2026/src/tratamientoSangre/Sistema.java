package tratamientoSangre;

import equipoFutbol.Integrante;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Sistema {
    private HashSet<Paciente> pacientes;
    private HashMap<Tratable, Integer> tratables;


    public void registrarPaciente(Paciente paciente)
    {
        if(paciente.chequearAdmision())
        {
            pacientes.add(paciente);
            System.out.println("Se registró el paciente");
            if(paciente.chequearTratabilidad())
            {
                tratables.put((Tratable) paciente, 0);
                System.out.println("Se agregó al paciente a la lista de tratables");
                return;
            }
            return;
        }
        System.out.println("Hay un problema con los datos del paciente");
    }

    public void aumentarDia()
    {
        for(Map.Entry<Tratable, Integer> entry : tratables.entrySet())
        {
            entry.setValue(entry.getValue()+1);
        }
    }


    public int pacientesNoTratables()
    {
        return pacientes.size() - tratables.size();
    }

    public static void main(String[] args) {

    }

}
