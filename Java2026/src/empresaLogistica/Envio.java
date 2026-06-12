package empresaLogistica;



/* Envíos: Se registran entre un repartidor y un cliente. Al finalizar el envío, se debe ingresar la
distancia recorrida en kilómetros y el peso del paquete en kg. El sistema determina automáticamente
el tipo de envío según las zonas involucradas:
*/

import modificadores.Estado;

public class Envio {
    private float distanciaEnKm;
    private float pesoDelPaqueteEnKg;
    private Provincia origen;
    private Provincia destino;
    private float precioBase;
    private Estado estado;
    private Repartidor repartidor;
    private int id;

    public int getId() {
        return id;
    }

    public float getDistanciaEnKm() {
        return distanciaEnKm;
    }

    public void setDistanciaEnKm(float distanciaEnKm) {
        this.distanciaEnKm = distanciaEnKm;
    }

    public float getPesoDelPaqueteEnKg() {
        return pesoDelPaqueteEnKg;
    }

    public void setPesoDelPaqueteEnKg(float pesoDelPaqueteEnKg) {
        this.pesoDelPaqueteEnKg = pesoDelPaqueteEnKg;
    }

    public Provincia getOrigen() {
        return origen;
    }

    public void setOrigen(Provincia origen) {
        this.origen = origen;
    }

    public Estado getEstado() {
        return estado;
    }

    public Repartidor getRepartidor() {
        return repartidor;
    }

    public Provincia getDestino() {
        return destino;
    }

    public void setDestino(Provincia destino) {
        this.destino = destino;
    }

    public float getPrecioBase() {
        return precioBase;
    }

    public Envio(float distanciaEnKm, float pesoDelPaqueteEnKg, Provincia origen, Provincia destino) {
        this.distanciaEnKm = distanciaEnKm;
        this.pesoDelPaqueteEnKg = pesoDelPaqueteEnKg;
        this.origen = origen;
        this.destino = destino;
    }

    public Envio() {
        this.distanciaEnKm = 10;
        this.pesoDelPaqueteEnKg = 10;
    }

    public float calcularCosto()
    {
        return this.precioBase;
    }
}
