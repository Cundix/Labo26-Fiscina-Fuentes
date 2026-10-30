package gestionPartidosPoliticos;

import java.util.ArrayList;

public class PartidoPolitico {
    private String nombre;
    private String direccionSede;
    private int cantidadMiembros;
    private ArrayList<Comunicador> comunicadorPartidarios;

    public PartidoPolitico(String nombre, String direccionSede, int cantidadMiembros, ArrayList<Comunicador> comunicadorPartidarios) {
        this.nombre = nombre;
        this.direccionSede = direccionSede;
        this.cantidadMiembros = cantidadMiembros;
        this.comunicadorPartidarios = comunicadorPartidarios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccionSede() {
        return direccionSede;
    }

    public void setDireccionSede(String direccionSede) {
        this.direccionSede = direccionSede;
    }

    public int getCantidadMiembros() {
        return cantidadMiembros;
    }

    public void setCantidadMiembros(int cantidadMiembros) {
        this.cantidadMiembros = cantidadMiembros;
    }

    public ArrayList<Comunicador> getComunicadoresPartidarios() {
        return comunicadorPartidarios;
    }

    public void setComunicadoresPartidarios(ArrayList<Comunicador> comunicadorPartidarios) {
        this.comunicadorPartidarios = comunicadorPartidarios;
    }

    public void addComunicador(Comunicador comunicador)
    {
        this.comunicadorPartidarios.add(comunicador);
    }

    public PartidoPolitico(String nombre)
    {
        this.nombre = nombre;
        this.comunicadorPartidarios = new ArrayList<Comunicador>();
    }

    public void hacerCampania()
    {
        try {
            for (Comunicador comunicador : comunicadorPartidarios) {
                if (comunicador instanceof Telefono || comunicador instanceof Trabajador) {
                    comunicador.enviarMensaje();
                    System.out.printf("Vote por el partido " + this.getNombre() + " para un mejor futuro");
                } else {
                    System.out.printf("Vote por el partido " + this.getNombre() + " para un mejor futuro");
                    comunicador.enviarMensaje();
                }

            }
        } catch (ProblemaComunicacion p) {
            System.out.println(p.getMessage());
        }
    }

    public static void main(String[] args) {
        PartidoPolitico p1 = new PartidoPolitico("1");


    }
}
