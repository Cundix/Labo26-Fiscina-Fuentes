package alarmas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemaDeAlarmas {
    private ArrayList<Dispositivo> sensores;

    public SistemaDeAlarmas() {
        this.sensores = new ArrayList<>();
    }

    public ArrayList<Dispositivo> getSensores() {
        return sensores;
    }

    public void setSensores(ArrayList<Dispositivo> sensores) {
        this.sensores = sensores;
    }

    public void agregarSensor(Dispositivo d) {
        sensores.add(d);
    }

    public void evaluarTodosLosSensores() {
        System.out.println("--- Evaluando sistema de alarmas ---");
        for (Dispositivo sensor : sensores) {
            if (sensor.getEstado() == Estado.ACTIVADO) {
                sensor.evaluarAlarma();
            }
        }
    }

    public void consultarInformacionDispositivo()
    {
        if (sensores == null || sensores.isEmpty()) {
            System.out.println("No hay dispositivos registrados en el edificio.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        int opcion = -1;
        boolean entradaValida = false;
        int cantidadSensores = sensores.size() - 1;

        System.out.println("\n--- CONSULTA DE DISPOSITIVOS ---");
        System.out.println("Cantidad de dispositivos registrados: " + cantidadSensores);

        do {
            try {
                System.out.print("Ingrese un número entre 0 y " + cantidadSensores + ": ");
                opcion = scanner.nextInt();
                //todo Este if se maneja con exceptions
                if (opcion >= 0 && opcion <= cantidadSensores) {
                    entradaValida = true;
                }
                else
                {
                    System.out.println("Error: El número ingresado está fuera de rango. Intente nuevamente.\n");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un número entero válido (no se admiten letras o decimales).\n");
                scanner.nextLine(); // Limpiamos el buffer del scanner para evitar un bucle infinito
            }
        } while (!entradaValida);

        // Una vez validado, mostramos el dispositivo correspondiente
        Dispositivo seleccionado = sensores.get(opcion);
        System.out.println("\n--- INFORMACIÓN DEL DISPOSITIVO SELECCIONADO ---");
        System.out.println("Índice: " + opcion);
        System.out.println(seleccionado);
        System.out.println("Medida actual: " + seleccionado.proporcionarMedida());
    }


    public static void main(String[] args) {

        LocalDate fechaCompra = LocalDate.of(2023, 5, 11);

        DetectorDeHumo humo = new DetectorDeHumo(Estado.ACTIVADO, 50.0, fechaCompra);
        DetectorDeTemperatura temp = new DetectorDeTemperatura(Estado.ACTIVADO, 35.0, fechaCompra);
        DetectorDePresion presion = new DetectorDePresion(Estado.ACTIVADO, 100.0, fechaCompra);

        DetectorDeTemperatura tempApagada = new DetectorDeTemperatura(Estado.DESACTIVADO, 30.0, fechaCompra);

        humo.setMedidaActual(65.0);       //Dispara alarma
        temp.setMedidaActual(40.0);       //Dispara alarma
        presion.setMedidaActual(80.0);    //No dispara
        tempApagada.setMedidaActual(50.0);//No dispara

        DispositivoComplejo grupoPiso1 = new DispositivoComplejo(Estado.ACTIVADO, 25.0, fechaCompra);

        // Sensores que integran el grupo
        DetectorDeTemperatura tempGrupo1 = new DetectorDeTemperatura(Estado.ACTIVADO, 40.0, fechaCompra);
        DetectorDeTemperatura tempGrupo2 = new DetectorDeTemperatura(Estado.ACTIVADO, 40.0, fechaCompra);

        tempGrupo1.setMedidaActual(20.0);
        tempGrupo2.setMedidaActual(40.0);

        grupoPiso1.agregarDispositivo(tempGrupo1);
        grupoPiso1.agregarDispositivo(tempGrupo2);

        SistemaDeAlarmas sistema = new SistemaDeAlarmas();
        sistema.agregarSensor(humo);
        sistema.agregarSensor(temp);
        sistema.agregarSensor(presion);
        sistema.agregarSensor(tempApagada);
        sistema.agregarSensor(grupoPiso1);

        sistema.evaluarTodosLosSensores();

        sistema.consultarInformacionDispositivo();
    }
}