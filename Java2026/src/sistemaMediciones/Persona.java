package sistemaMediciones;

import java.time.LocalDate;
import java.time.Year;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;

public class Persona
{
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private HashMap<LocalDate, Medicion> mediciones;


    public Persona(String nombre, String apellido, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        mediciones = new HashMap<>();
    }

    public Persona(String nombre) {
        this.nombre = nombre;
        mediciones = new HashMap<>();
    }

    public HashMap<LocalDate, Medicion> getMediciones() {
        return mediciones;
    }

    public void setMediciones(HashMap<LocalDate, Medicion> mediciones) {
        this.mediciones = mediciones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    //Consignas

    public Medicion conocerMedicionFecha(LocalDate fecha)
    {
        if(mediciones.containsKey(fecha))
        {
            return mediciones.get(fecha);
        }

        return null;

    }

    public double promedioPesoAnio(int anio)
    {
        double pesoSuma = 0;
        int cant = 0;
        Medicion medicion = new Medicion(0, 0);

        for(LocalDate fecha : mediciones.keySet())
        {
            if(fecha.getYear() == anio)
            {
                medicion = mediciones.get(fecha);
                pesoSuma += medicion.getPesoKg();
                cant ++;
            }
        }
        if(cant == 0)
        {
            return -1;
        }

        return pesoSuma / cant;
    }

    public double promedioAlturaAnio(int anio)
    {
        double alturaSuma = 0;
        int cant = 0;
        Medicion medicion;

        for(LocalDate fecha : mediciones.keySet()) //es mas recomendable usar un Entryset para evitar un Doble Recorrido
        {
            if(fecha.getYear() == anio)
            {
                medicion = mediciones.get(fecha);
                alturaSuma += medicion.getAlturaCm();
                cant ++;
            }
        }
        if(cant == 0)
        {
            return -1;
        }

        return alturaSuma / cant;
    }

    public double porcentajeVariacionPeso (LocalDate fecha1, LocalDate fecha2)
    {
        if(mediciones.containsKey(fecha1) && mediciones.containsKey(fecha2))
        {
            return (mediciones.get(fecha2).getPesoKg() - mediciones.get(fecha1).getPesoKg()) * 100 / mediciones.get(fecha1).getPesoKg();
        }
        else
        {
            return -1;
        }
    }

    public double porcentajeCrecimiento (LocalDate fecha1, LocalDate fecha2)
    {
        if(mediciones.containsKey(fecha1) && mediciones.containsKey(fecha2))
        {
            return (mediciones.get(fecha2).getAlturaCm() - mediciones.get(fecha1).getAlturaCm()) * 100 / mediciones.get(fecha1).getAlturaCm();
        }
        else
        {
            return -100;
        }
    }

    public LocalDate menorPeso() {
        double peso = 9999999;
        LocalDate fechaRet = null;
        for (LocalDate fecha : mediciones.keySet()) {
            if (peso > mediciones.get(fecha).getPesoKg()) {
                peso = mediciones.get(fecha).getPesoKg();
                fechaRet = fecha;
            }

        }
        return fechaRet;
    }

    public LocalDate mayorPeso()
    {
        double peso = 0;
        LocalDate fechaRet = null;
        for(LocalDate fecha : mediciones.keySet())
        {
            if(peso < mediciones.get(fecha).getPesoKg())
            {
                peso = mediciones.get(fecha).getPesoKg();
                fechaRet = fecha;
            }

        }
        return fechaRet;
    }

    public boolean agregarMedicion(Medicion medicion, LocalDate fecha)
    {
        if(!mediciones.containsKey(fecha))
        {
            mediciones.put(fecha, medicion);
            return true;
        }
        return false;
    }

    @Override
    public String toString()
    {
        return (nombre + " " + apellido);
    }



}
