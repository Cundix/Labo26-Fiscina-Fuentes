package sistemaAsistenciaEmpleados;

import fechas.Fecha;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import static java.time.LocalDate.of;

public class Empresa
{
    private HashMap<Integer/*nro legajo */, Empleado> empleadosLegajo;

    public Empresa(HashMap<Integer, Empleado> empleadosLegajo) {
        this.empleadosLegajo = empleadosLegajo;
    }

    public Empresa()
    {
        this.empleadosLegajo = new HashMap<>();
    }

    public HashMap<Integer/*nro legajo */, Empleado> getEmpleadosLegajo() {
        return empleadosLegajo;
    }

    public void setEmpleadosLegajo(HashMap<Integer/*nro legajo */, Empleado> empleadosLegajo) {
        this.empleadosLegajo = empleadosLegajo;
    }

    public Empleado buscarEmpleado(int nroLegajo)
    {
        if(empleadosLegajo.containsKey(nroLegajo))
        {
            return empleadosLegajo.get(nroLegajo);
        }
        else return null;
    }

    public void registrarIngresoEmpleado(int nroLegajo)
    {

        Empleado empleado = buscarEmpleado(nroLegajo);

        if(empleado != null)
        {
            empleado.getIngresos().add(LocalDateTime.now());
        }
        else System.out.println("numero de legajo no encontrado");
    }

    public double porcentajeAsistencia(int nroLegajo, int anio, int mes)
    {
        Empleado empleado = buscarEmpleado(nroLegajo);

        if(empleado != null)
        {
            return empleado.checkAsistencia(anio, mes);
        }

        else return -1;
    }

    private HashSet<Empleado> empleadosAsistencia(int anio, int mes)
    {
        HashSet<Empleado> empleadosAsistencia = new HashSet<>();

        for(Map.Entry<Integer, Empleado> entry : empleadosLegajo.entrySet())
        {
            if(porcentajeAsistencia(entry.getKey(), anio, mes) > 80)
            {
                empleadosAsistencia.add(entry.getValue());
            }
        }
        return empleadosAsistencia;
    }

    public static void main(String[] args) {

        // 1. Instanciar la Empresa
        Empresa miEmpresa = new Empresa();

        // 2. Definir días asignados para un empleado (ej: Lunes a Viernes)
        HashSet<DayOfWeek> diasLaborales = new HashSet<>();
        diasLaborales.add(DayOfWeek.MONDAY);
        diasLaborales.add(DayOfWeek.TUESDAY);
        diasLaborales.add(DayOfWeek.WEDNESDAY);
        diasLaborales.add(DayOfWeek.THURSDAY);
        diasLaborales.add(DayOfWeek.FRIDAY);

        // 3. Crear el set de ingresos ficticios
        HashSet<LocalDateTime> ingresosCarlos = new HashSet<>();

        // Simulamos algunos ingresos en Septiembre 2026
        ingresosCarlos.add(LocalDateTime.of(2026, 9, 1, 8, 0)); // Martes
        ingresosCarlos.add(LocalDateTime.of(2026, 9, 2, 8, 15)); // Miércoles
        ingresosCarlos.add(LocalDateTime.of(2026, 9, 3, 7, 55)); // Jueves
        ingresosCarlos.add(LocalDateTime.of(2026, 9, 4, 8, 05)); // Viernes

        // 4. Crear Empleado y setear sus días asignados
        LocalDate fechaNac = LocalDate.of(1995, 5, 5); // Ajustar según los atributos de tu clase Persona/Fecha
        Empleado emp1 = new Empleado("Carlos", "Gómez", fechaNac, "1122334455", ingresosCarlos);
        emp1.setDiasAsignados(diasLaborales);

        // 5. Agregar el empleado a la empresa (Legajo 1001)
        miEmpresa.getEmpleadosLegajo().put(1001, emp1);

        // 6. Registrar un ingreso en el momento actual para el legajo 1001
        System.out.println("--- Registrando ingreso actual ---");
        miEmpresa.registrarIngresoEmpleado(1001);

        // 7. Probar búsqueda de empleado
        System.out.println("\n--- Búsqueda de Empleado ---");
        Empleado buscado = miEmpresa.buscarEmpleado(1001);
        if (buscado != null) {
            System.out.println("Empleado encontrado: " + buscado.getNombre() + " " + buscado.getApellido());
            System.out.println("Total marcas de ingreso: " + buscado.getIngresos().size());
        }

        // 8. Calcular porcentaje de asistencia del mes de Septiembre 2026
        System.out.println("\n--- Cálculo de Asistencia ---");
        double porcentaje = miEmpresa.porcentajeAsistencia(1001, 2026, 9);
        System.out.println("Porcentaje de asistencia (Legajo 1001): " + porcentaje + "%");

        // 9. Intentar consultar legajo inexistente
        System.out.println("\n--- Prueba con Legajo Inexistente ---");
        miEmpresa.registrarIngresoEmpleado(9999);
    }

}
