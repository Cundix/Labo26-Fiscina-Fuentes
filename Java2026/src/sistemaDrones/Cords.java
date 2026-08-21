package sistemaDrones;
public class Cords
{
    static double latitudOrigen = 34.573195;
    static double longitudOrigen = -58.504111;

    static double calcularKM(double latitudDestino, double longitudDestino)
    {
    // Las funciones trigonométricas de Java (como Math.sin o Math.cos) trabajan en radianes,
    // no en grados. Por eso transformamos las coordenadas geográficas (grados) a radianes.
        double lat1Rad = Math.toRadians(latitudOrigen);
        double lon1Rad = Math.toRadians(longitudOrigen);
        double lat2Rad = Math.toRadians(latitudDestino);
        double lon2Rad = Math.toRadians(longitudDestino);

    // 2. FÓRMULA DE HAVERSINE
    // Calculamos las diferencias angulares en latitud y longitud entre ambos puntos.
        double dLat = lat2Rad - lat1Rad;
        double dLon = lon2Rad - lon1Rad;

    // 'a' representa el cuadrado de la mitad de la distancia en línea recta sobre la esfera (la "haversina").
    // Combina los cambios de latitud y longitud, ajustando la longitud según qué tan lejos estás del ecuador.
        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) +
        Math.cos(lat1Rad) * Math.cos(lat2Rad) * Math.sin(dLon / 2) * Math.sin(dLon / 2);

    // 'c' es la distancia angular en radianes (el ángulo central que separa ambos puntos en el centro de la Tierra).
    // Usamos Math.atan2 para evitar errores numéricos en distancias muy cortas o cercanas a polos.
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        // 3. RESULTADO EN KILÓMETROS
        // Definimos el radio promedio de la Tierra en kilómetros.
        double radioTierraKm = 6371;

        // Multiplicamos el radio por la distancia angular para obtener la distancia real sobre la superficie curva de la Tierra.
        return radioTierraKm * c;
    }
}
