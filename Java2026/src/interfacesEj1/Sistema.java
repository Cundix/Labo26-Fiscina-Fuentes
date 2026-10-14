package interfacesEj1;

import java.util.HashSet;

public class Sistema
{
    private int cantidadPrestables;
    private int cantidadPrestados;
    private HashSet<ObjetoPrestar> objeto;

    public void actualizarStats()
    {
        int total = objeto.size();
        int cantidadPrestables = total;
        for (ObjetoPrestar objetoPrestar : objeto)
        {
            if(objetoPrestar.isPrestado())
            {
                cantidadPrestables --;
            }
        }

        this.cantidadPrestables = cantidadPrestables;
        int cantidadPrestados = total - cantidadPrestables;

        System.out.println("Cantidad Prestados: " + this.cantidadPrestados);
        System.out.println("Cantidad Prestables: " + cantidadPrestables);


    }

}
