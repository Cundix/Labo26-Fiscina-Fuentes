package empresarial;
import objetos.Pedido;
import objetos.Plato;
import fechas.Fecha;
import fechas.Hora;
import personas.Persona;
import java.util.ArrayList;
import java.util.Scanner;

public class SistemaBuffet {
    ArrayList<Plato> menu = new ArrayList<>();
    ArrayList<Pedido> listaPedidos = new ArrayList<>();

    public ArrayList<Plato> getMenu() {
        return menu;
    }

    public void setMenu(ArrayList<Plato> menu) {
        this.menu = menu;
    }

    public ArrayList<Pedido> getListaPedidos() {
        return listaPedidos;
    }

    public void setListaPedidos(ArrayList<Pedido> listaPedidos) {
        this.listaPedidos = listaPedidos;
    }

    public SistemaBuffet(ArrayList<Plato> menu, ArrayList<Pedido> listaPedidos) {
        this.menu = menu;
        this.listaPedidos = listaPedidos;
    }

    public SistemaBuffet()
    {
        this.menu = new ArrayList<>();
        this.listaPedidos = new ArrayList<>();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SistemaBuffet sistemaBuffet = new SistemaBuffet();


        sistemaBuffet.menu.add(new Plato("Milanesa con Papas", 4500));
        sistemaBuffet.menu.add(new Plato("Ravioles con Tuco", 3800));

        int opcion;
        do {
            System.out.println("\n========== GESTIÓN DE RESTAURANTE ==========");
            System.out.println("1. Agregar Plato al Menú");
            System.out.println("2. Modificar Plato");
            System.out.println("3. Eliminar Plato");
            System.out.println("4. Ver Menú");
            System.out.println("5. Ver Lista de Pedidos");
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
            }
        } while (opcion != 0);
    }

    public static void verMenu(ArrayList<Plato> menu) {
        System.out.println("\n--- MENÚ DEL DÍA ---");
        for (int i = 0; i < menu.size(); i++) {
            System.out.println(i + ". " + menu.get(i).getNombre() + " - $" + menu.get(i).getPrecio());
        }
    }
}