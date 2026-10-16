package equipoFutbol;

import personas.Persona;

import java.util.HashSet;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public abstract class Integrante extends Persona {

    private HashSet<Club> historialClubes;

    public Integrante() {
        this.historialClubes = new HashSet<Club>();
    }

    public boolean trabajoEnClub(Club club)
    {
        if (this.historialClubes.contains(club)) return true;
        else return false;
    }

    public abstract boolean contratable();
}
