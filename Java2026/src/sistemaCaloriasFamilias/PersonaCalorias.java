package sistemaCaloriasFamilias;

import fechas.Fecha;
import personas.Persona;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class PersonaCalorias extends Persona {

    HashMap<PlatoComida, Integer> platosComidos;

    public PersonaCalorias(String nombre, String apellido, LocalDate fechaNacimiento, HashMap<PlatoComida, Integer> platosComidos) {
        super(nombre, apellido, fechaNacimiento);
        this.platosComidos = platosComidos;
    }

    public HashMap<PlatoComida, Integer> getPlatosComidos() {
        return platosComidos;
    }

    public void setPlatosComidos(HashMap<PlatoComida, Integer> platosComidos) {
        this.platosComidos = platosComidos;
    }

    public float getCaloriasTotales() {
        float caloriasTotales = 0;
        for (Map.Entry<PlatoComida, Integer> entry : this.platosComidos.entrySet()) {
            caloriasTotales += entry.getKey().getCalorias()*entry.getValue();
        }
        return caloriasTotales;
    }

    public void agregarPlato(PlatoComida plato, int cantidad)
    {
        if (platosComidos.containsKey(plato)) {
            // Si ya existe, obtiene la cantidad actual, le suma la nueva y actualiza
            platosComidos.put(plato, platosComidos.get(plato) + cantidad);
        } else {
            // Si es la primera vez que se agrega, la inserta
            platosComidos.put(plato, cantidad);
        }
    }


}
