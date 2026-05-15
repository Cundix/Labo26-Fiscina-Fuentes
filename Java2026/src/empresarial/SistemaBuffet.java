package empresarial;

import objetos.Pedido;
import objetos.Plato;
import fechas.Fecha;
import fechas.Hora;
import personas.Persona;
import java.util.ArrayList;
import java.util.Scanner;

public class SistemaBuffet {
    private ArrayList<Plato> menu = new ArrayList<>();
    private ArrayList<Pedido> listaPedidos = new ArrayList<>();
    // Quitamos el atributo 'aCocinar' de acá arriba para que no acumule duplicados entre consultas

    // CORRECCIÓN: Cambiamos el tipo de retorno a 'void' si solo vas a imprimir,
    // o agregamos el 'return' al final. Optamos por retornar la lista.
    public ArrayList<Pedido> listaCocina(Fecha fecha) {
        ArrayList<Pedido> aCocinar = new ArrayList<>(); // Lista local para que empiece limpia cada vez

        for (Pedido pedido : listaPedidos) {
            // CORRECCIÓN: Para comparar objetos en Java (como Fecha), usá .equals() o compará sus atributos.
            // Si tu clase Fecha tiene getters, lo ideal sería: pedido.getFechaCreacion().equals(fecha)
            // Dejamos un comentario por si necesitas adaptarlo a tu clase Fecha específica.
            if (!pedido.getEntregado() && pedido.getFechaCreacion().equals(fecha)) {

                // NOTA: Asegurate de que tu clase Pedido tenga el método setPrecioFinal()
                double precioFinal = pedido.getPlato().getPrecio() + (pedido.getPlato().getPrecio() * pedido.getPersona().getPorcentajeDto());
                pedido.setPrecioFinal(precioFinal);

                aCocinar.add(pedido);
            }
        }

        // Imprimimos la lista filtrada
        if (aCocinar.isEmpty()) {
            System.out.println("No hay pedidos pendientes para cocinar en esa fecha.");
        } else {
            for (Pedido p : aCocinar) {
                p.mostrarPedido();
            }
        }

        return aCocinar; // Agregamos el return indispensable para compilar
    }

    public ArrayList<Plato> getMenu() { return menu; }
    public void setMenu(ArrayList<Plato> menu) { this.menu = menu; }
    public ArrayList<Pedido> getListaPedidos() { return listaPedidos; }
    public void setListaPedidos(ArrayList<Pedido> listaPedidos) { this.listaPedidos = listaPedidos; }

    public SistemaBuffet(ArrayList<Plato> menu, ArrayList<Pedido> listaPedidos) {
        this.menu = menu;
        this.listaPedidos = listaPedidos;
    }

    public SistemaBuffet() {
        this.menu = new ArrayList<>();
        this.listaPedidos = new ArrayList<>();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SistemaBuffet sistemaBuffet = new SistemaBuffet();

        sistemaBuffet.menu.add(new Plato("Milanesa con Papas", 4500));
        sistemaBuffet.menu.add(new Plato("Ravioles con Tuco", 3800));

        // Datos de prueba mockeados (eliminame o adaptame si usás un creador de pedidos dinámico)
        // sistemaBuffet.listaPedidos.add(new Pedido(new Fecha(15, 5, 2026), sistemaBuffet.menu.get(0), new Persona("Facundo", -0.10), new Hora(12, 0, 0), false));

        int opcion;
        do {
            System.out.println("\n========== GESTIÓN DE RESTAURANTE ==========");
            System.out.println("1. Agregar Plato al Menú");
            System.out.println("2. Modificar Plato");
            System.out.println("3. Eliminar Plato");
            System.out.println("4. Ver Menú");
            System.out.println("5. Ver Lista de Pedidos Globales");
            System.out.println("6. Ver Pedidos a Cocinar por Fecha"); // NUEVA OPCIÓN
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del nuevo plato: ");
                    String nombre = sc.nextLine();
                    System.out.print("Precio: ");
                    double precio = sc.nextDouble();
                    sistemaBuffet.menu.add(new Plato(nombre, precio));
                    System.out.println("Plato agregado con éxito.");
                    break;

                case 2:
                    verMenu(sistemaBuffet.menu);
                    System.out.print("Índice del plato a modificar: ");
                    int idxMod = sc.nextInt();
                    sc.nextLine();
                    if (idxMod >= 0 && idxMod < sistemaBuffet.menu.size()) {
                        System.out.print("Nuevo nombre: ");
                        sistemaBuffet.menu.get(idxMod).setNombre(sc.nextLine());
                        System.out.print("Nuevo precio: ");
                        sistemaBuffet.menu.get(idxMod).setPrecio(sc.nextDouble());
                        System.out.println("Plato actualizado.");
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;

                case 3:
                    verMenu(sistemaBuffet.menu);
                    System.out.print("Índice del plato a eliminar: ");
                    int idxDel = sc.nextInt();
                    if (idxDel >= 0 && idxDel < sistemaBuffet.menu.size()) {
                        sistemaBuffet.menu.remove(idxDel);
                        System.out.println("Plato eliminado.");
                    }
                    break;

                case 4:
                    verMenu(sistemaBuffet.menu);
                    break;

                case 5:
                    System.out.println("\n--- LISTA DE PEDIDOS ---");
                    if (sistemaBuffet.listaPedidos.isEmpty()) {
                        System.out.println("No hay pedidos registrados.");
                    } else {
                        for (Pedido ped : sistemaBuffet.listaPedidos) {
                            System.out.println(ped);
                        }
                    }
                    break;

                case 6: // LÓGICA DE LA NUEVA OPCIÓN
                    System.out.println("\n--- BUSCAR PEDIDOS A COCINAR ---");
                    System.out.print("Ingrese el día (DD): ");
                    int dia = sc.nextInt();
                    System.out.print("Ingrese el mes (MM): ");
                    int mes = sc.nextInt();
                    System.out.print("Ingrese el año (AAAA): ");
                    int anio = sc.nextInt();
                    sc.nextLine(); // Limpiar buffer

                    // Instanciamos la fecha buscada
                    Fecha fechaBusqueda = new Fecha(dia, mes, anio);

                    System.out.println("\n--- PEDIDOS PENDIENTES PARA EL " + dia + "/" + mes + "/" + anio + " ---");
                    // Llamamos al método pasándole el objeto fecha creado
                    sistemaBuffet.listaCocina(fechaBusqueda);
                    break;
            }
        } while (opcion != 0);
    }

    public static void verMenu(ArrayList<Plato> menu) {
        System.out.println("\n--- MENÚ DEL DÍA ---");
        for (int i = 0; i < menu.size(); i++) {
            System.out.println(i + ". " + menu.get(i).getNombre() + " - $" + menu.get(i).getPrecio());
        }
    }

    public void registrarPedido(Pedido nuevoPedido) {
        if (nuevoPedido != null) {
            listaPedidos.add(nuevoPedido);

            nuevoPedido.getPlato().incrementarContador();

            System.out.println("SISTEMA: Pedido registrado y contabilizado.");
        }
    }
    public void mostrarTop3() {
        ArrayList<Plato> copiaMenu = new ArrayList<>(menu);

        copiaMenu.sort((p1, p2) -> Integer.compare(p2.getCantidadPedidos(), p1.getCantidadPedidos()));

        System.out.println("\n--- TOP 3 PLATOS MÁS VENDIDOS ---");
        for (int i = 0; i < Math.min(3, copiaMenu.size()); i++) {
            Plato p = copiaMenu.get(i);
            System.out.println((i + 1) + "º " + p.getNombre() + " - Pedidos: " + p.getCantidadPedidos());
        }
    }
}