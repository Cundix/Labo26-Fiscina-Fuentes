package sistemaAsistenciaEmpleados;

import fechas.Fecha;
import personas.Persona;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.YearMonth;
import java.util.*;

public class Empleado extends Persona
{
    private String numeroTelefono;
    private HashSet<DayOfWeek> diasAsignados;
    private HashSet<LocalDateTime> ingresos;


    public Empleado(String nombre, String apellido, LocalDate fechaNacimiento, String numeroTelefono, HashSet<LocalDateTime> ingresos) {
        super(nombre, apellido, fechaNacimiento);
        this.numeroTelefono = numeroTelefono;
        this.ingresos = ingresos;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public HashSet<DayOfWeek> getDiasAsignados() {
        return diasAsignados;
    }

    public void setDiasAsignados(HashSet<DayOfWeek> diasAsignados) {
        this.diasAsignados = diasAsignados;
    }

    public HashSet<LocalDateTime> getIngresos()
    {
        return ingresos;
    }

    public void setIngresos(HashSet<LocalDateTime> ingresos)
    {
        this.ingresos = ingresos;
    }

    public double checkAsistencia(int anio, int mes)
    {
        int contAsistencia = 0;
        int diasTotales = 0;

        if (diasAsignados == null || ingresos == null)
        {
            return 0;
        }

        HashSet<LocalDate> fechasIngresadas = new HashSet<>();
        for (LocalDateTime ingreso : ingresos)
        {
            fechasIngresadas.add(ingreso.toLocalDate());
        }

        for (LocalDate fecha = LocalDate.of(anio, mes, 1); fecha.getMonthValue() == mes && fecha.getYear() == anio; fecha = fecha.plusDays(1)) {
            if (diasAsignados.contains(fecha.getDayOfWeek()))
            {
                if (fechasIngresadas.contains(fecha))
                {
                    contAsistencia++;
                }
                diasTotales++;
            }
        }

        if (diasTotales == 0) return 0;

        return ((double) contAsistencia * 100) / diasTotales;
    }
}
