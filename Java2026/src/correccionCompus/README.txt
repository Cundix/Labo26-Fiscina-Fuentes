Solución del ejercicio: compra de computadoras personalizadas

Restricciones respetadas:
- Solo se usa ArrayList como colección.
- No se usa instanceof.
- No se usa getClass(), getCanonicalName() ni comparación de nombres de clases.
- No se usan clases abstractas ni interfaces.
- Se usa herencia con extends y polimorfismo.

Idea principal:
- Computadora no pregunta si un periférico es entradas.Entrada o salidas.Salida.
- Cada periférico responde cuánto aporta como entrada y cuánto aporta como salida.

Ejemplo:
componentes.Periferico:
    cantidadEntrada() devuelve 0
    cantidadSalida() devuelve 0

entradas.Entrada:
    cantidadEntrada() devuelve 1

salidas.Salida:
    cantidadSalida() devuelve 1

Entonces Computadora puede contar así:
    contador = contador + periferico.cantidadEntrada();
    contador = contador + periferico.cantidadSalida();

Esto evita instanceof y deja la responsabilidad en cada clase hija.

Para ejecutar:
1. Abrir una terminal dentro de la carpeta src.
2. Compilar:
   javac *.java
3. Ejecutar:
   java Main
