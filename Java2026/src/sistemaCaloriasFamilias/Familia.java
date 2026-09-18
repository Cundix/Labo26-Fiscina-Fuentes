package sistemaCaloriasFamilias;

import java.util.HashSet;

public class Familia {
    HashSet<PersonaCalorias> personasEnFamilia;

    public Familia(HashSet<PersonaCalorias> personasEnFamilia) {
        this.personasEnFamilia = personasEnFamilia;
    }

    public Familia(){
        this.personasEnFamilia = new HashSet<>();
    }

    public HashSet<PersonaCalorias> getPersonasEnFamilia() {
        return personasEnFamilia;
    }

    public void setPersonasEnFamilia(HashSet<PersonaCalorias> personasEnFamilia) {
        this.personasEnFamilia = personasEnFamilia;
    }

    public boolean estaEnFamilia(PersonaCalorias persona)
    {
        return personasEnFamilia.contains(persona);
    }

    public void agregarMiembro(PersonaCalorias persona){
        this.personasEnFamilia.add(persona);
    }

    public void removerMiembro(PersonaCalorias persona){
        this.personasEnFamilia.remove(persona);
    }

}
