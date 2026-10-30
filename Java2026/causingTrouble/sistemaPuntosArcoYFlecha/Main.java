package sistemaPuntosArcoYFlecha;

import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== PRUEBA DEL SISTEMA DE PUNTOS ARCO Y FLECHA ===\n");

        // 1. Creación de Dianas y asignación de puntajes por color
        Circulares dianaCircular = new Circulares("Diana Diana Circular 1", 3);
        HashMap<Integer, ColorDiana> puntajesCircular = new HashMap<>();
        puntajesCircular.put(10, ColorDiana.NEGRO);
        puntajesCircular.put(50, ColorDiana.ROJO);
        puntajesCircular.put(100, ColorDiana.VERDE);
        dianaCircular.setPuntajesDiana(puntajesCircular);

        Cuadradas dianaCuadrada = new Cuadradas("Diana Cuadrada 1", 5, 20.0f);
        HashMap<Integer, ColorDiana> puntajesCuadrada = new HashMap<>();
        puntajesCuadrada.put(20, ColorDiana.BLANCO);
        puntajesCuadrada.put(80, ColorDiana.NEGRO);
        dianaCuadrada.setPuntajesDiana(puntajesCuadrada);

        Rectangulares dianaRectangular = new Rectangulares("Diana Rectangular 1", 2, 10, 15);

        // 2. Probar cálculo de áreas y cantidad de puntajes
        System.out.println("--- Dianas y Áreas ---");
        System.out.println(dianaCircular.getNombre() + " | Área: " + dianaCircular.calcularArea() + " cm² | Puntajes configurados: " + dianaCircular.cantidadPuntajes());
        System.out.println(dianaCuadrada.getNombre() + " | Área: " + dianaCuadrada.calcularArea() + " cm² | Puntajes configurados: " + dianaCuadrada.cantidadPuntajes());
        System.out.println(dianaRectangular.getNombre() + " | Área: " + dianaRectangular.calcularArea() + " cm² | Puntajes configurados: " + dianaRectangular.cantidadPuntajes());
        System.out.println();

        // 3. Creación de Beneficios
        HashSet<String> comidasList = new HashSet<>();
        comidasList.add("Hamburguesa");
        comidasList.add("Papas Fritas");
        BeneficioComidas beneComida = new BeneficioComidas("Combo Combo", "admin1", comidasList);

        HashSet<String> gaseosasList = new HashSet<>();
        gaseosasList.add("Coca Cola");
        gaseosasList.add("Sprite");
        BeneficioGaseosa beneGaseosa = new BeneficioGaseosa("Promo Gaseosas", "admin2", gaseosasList);

        System.out.println("--- Descuentos Extra (Acumulables) ---");
        System.out.println("Descuento extra de " + beneComida.getNombre() + ": $" + beneComida.calcularDescuentoExtra());
        System.out.println("Descuento extra de " + beneGaseosa.getNombre() + ": $" + beneGaseosa.calcularDescuentoExtra());
        System.out.println();

        // 4. Instanciación del Bar y prueba de sus métodos
        HashSet<Diana> dianasBar = new HashSet<>();
        dianasBar.add(dianaCircular);
        dianasBar.add(dianaCuadrada);
        dianasBar.add(dianaRectangular);

        HashSet<Beneficio> listaBeneficios = new HashSet<>();
        listaBeneficios.add(beneComida);
        listaBeneficios.add(beneGaseosa);

        HashSet<Beneficio> listaAcumulables = new HashSet<>();
        listaAcumulables.add(beneComida);
        listaAcumulables.add(beneGaseosa);

        Bar miBar = new Bar(dianasBar, 25, 150000.0, listaBeneficios, listaAcumulables);

        System.out.println("--- Información del Bar ---");
        System.out.println("Cantidad de clientes: " + miBar.getCantidadClientes());
        System.out.println("Recaudación actual: $" + miBar.getRecaudacion());

        // Probar dianaConMasValores()
        Diana masValores = miBar.dianaConMasValores();
        if (masValores != null) {
            System.out.println("Diana con más valores de puntaje: " + masValores.getNombre() + " (" + masValores.cantidadPuntajes() + " puntajes)");
        }

        // Probar cantidadBeneTragos()
        miBar.cantidadBeneTragos();
        System.out.println("Verificación de beneficios en el Bar completada.");
    }
}
