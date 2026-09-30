package alarmas;

import modificadores.Estado;
import java.util.ArrayList;

public class SistemaDeAlarmas {
    private ArrayList<Dispositivo> sensores;

    public SistemaDeAlarmas() {
        this.sensores = new ArrayList<>();
    }

    public void agregarSensor(Dispositivo d) {
        sensores.add(d);
    }

    public void evaluarTodosLosSensores() {
        System.out.println("--- Evaluando sistema de alarmas ---");
        for (Dispositivo sensor : sensores) {
            // Solo evalúa si está conectado/activado
            if (sensor.getEstado() == Estado.ACTIVADO) {
                sensor.evaluarAlarma();
            }
        }
    }

    public static void main(String[] args) {

        // 1. Crear fechas de adquisición ficticias
        Fecha fechaCompra = new Fecha(10, 5, 2023);

        // 2. Crear detectores individuales
        DetectorDeHumo humo = new DetectorDeHumo(Estado.ACTIVADO, 50.0, fechaCompra);
        DetectorDeTemperatura temp = new DetectorDeTemperatura(Estado.ACTIVADO, 35.0, fechaCompra);
        DetectorDePresion presion = new DetectorDePresion(Estado.ACTIVADO, 100.0, fechaCompra);

        // Dispositivo apagado / desconectado
        DetectorDeTemperatura tempApagada = new DetectorDeTemperatura(Estado.DESACTIVADO, 30.0, fechaCompra);

        // 3. Setear mediciones en los detectores
        humo.setMedidaActual(65.0);       // Supera umbral (50.0) -> Dispara alarma
        temp.setMedidaActual(40.0);       // Supera umbral (35.0) -> Dispara alarma
        presion.setMedidaActual(80.0);    // No supera umbral (100.0) -> No dispara
        tempApagada.setMedidaActual(50.0);// Supera umbral pero está DESACTIVADO -> No dispara

        // 4. Crear un DispositivoComplejo (Grupo de sensores)
        // Umbral del grupo = 25.0
        DispositivoComplejo grupoPiso1 = new DispositivoComplejo(Estado.ACTIVADO, 25.0, fechaCompra);

        // Sensores que integran el grupo
        DetectorDeTemperatura tempGrupo1 = new DetectorDeTemperatura(Estado.ACTIVADO, 40.0, fechaCompra);
        DetectorDeTemperatura tempGrupo2 = new DetectorDeTemperatura(Estado.ACTIVADO, 40.0, fechaCompra);

        tempGrupo1.setMedidaActual(20.0);
        tempGrupo2.setMedidaActual(40.0);
        // Promedio del grupo = (20 + 40) / 2 = 30.0 -> Supera el umbral de 25.0 -> Dispara alarma

        grupoPiso1.agregarDispositivo(tempGrupo1);
        grupoPiso1.agregarDispositivo(tempGrupo2);

        // 5. Cargar todos los sensores al Sistema de Alarmas del edificio
        SistemaDeAlarmas sistema = new SistemaDeAlarmas();
        sistema.agregarSensor(humo);
        sistema.agregarSensor(temp);
        sistema.agregarSensor(presion);
        sistema.agregarSensor(tempApagada);
        sistema.agregarSensor(grupoPiso1);

        // 6. Evaluar todo el sistema
        sistema.evaluarTodosLosSensores();
    }
}