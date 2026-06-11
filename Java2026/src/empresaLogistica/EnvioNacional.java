package empresaLogistica;

/*Envío Nacional: Si la zona de origen y destino son diferentes. Guarda la provincia de destino
y el tipo de transporte (Aéreo o Terrestre). Si es aéreo, tiene un recargo del 20% sobre el costo final.
El costo base se calcula como: precio_base + (peso * 120).
*/

public class EnvioNacional extends Envio {
    private Transporte transporte;

    @Override
    public float calcularCosto() {

        if(this.transporte.equals(Transporte.AEREO)) return (float) 1.2 * (this.getPrecioBase() + (this.getPesoDelPaqueteEnKg() * 120));
        else return this.getPrecioBase() + (this.getPesoDelPaqueteEnKg() * 120);
    }
}
