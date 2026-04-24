package Deportes;

import java.util.ArrayList;
import java.util.Queue;

public class campeonatoCurling {
    private String nombre;
    private float premioEnUSD;
    private ArrayList<Partido> partidos;
    private ArrayList<Equipo> equipos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPremioEnUSD() {
        return premioEnUSD;
    }

    public void setPremioEnUSD(float premioEnUSD) {
        this.premioEnUSD = premioEnUSD;
    }

    public ArrayList<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(ArrayList<Partido> partidos) {
        this.partidos = partidos;
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }

    public campeonatoCurling(String nombre, float premioEnUSD, ArrayList<Partido> partidos, ArrayList<Equipo> equipos) {
        this.nombre = nombre;
        this.premioEnUSD = premioEnUSD;
        this.partidos = partidos;
        this.equipos = equipos;
    }

    public void agrregarEquipo(Equipo equipo)
    {
        if(isTeamValid(equipo))
        {
            this.equipos.add(equipo);
        }

    }

    public boolean isTeamValid(Equipo equipo)
    {
        if((equipo.getCantidadJugadores() == 11) && equipo.checkCamisetas() && !equipo.getTurnos().isEmpty())
        {
            return true;
        }
    }

    public void emparejar()
    {
        int cant = 0;
        while(this.equipos.size()>0)
        {

            Partido partido = new Partido();
            if(this.equipos.get())
        }
    }
    public Partido nuevoPartido(Equipo equipo1, Equipo equipo2)
    {

    }

    public int checkHorarios(Equipo equipo1, Equipo equipo2)
    {
        if(equipo1.getTurnos().size() > equipo2.getTurnos().size())
        {
            for (int i = 0; i < equipo1.getTurnos().size(); i++)
            {
                if (equipo2.getTurnos().contains(equipo1.getTurnos().get(i)))
            }
        }
        else
        {
            for (int i = 0; i < equipo2.getTurnos().size(); i++)
            {
                if (equipo1.getTurnos().contains(equipo2.getTurnos().get(i)))
            }
        }
    }

}
