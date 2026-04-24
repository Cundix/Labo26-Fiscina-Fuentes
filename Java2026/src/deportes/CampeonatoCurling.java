package deportes;
import fechas.Fecha;
import java.util.ArrayList;

public class CampeonatoCurling {
    private String nombre;
    private float premioEnUSD;
    private ArrayList<Partido> partidos;
    private ArrayList<Equipo> equipos;

    public CampeonatoCurling(String nombre, float premioEnUSD) {
        this.nombre = nombre;
        this.premioEnUSD = premioEnUSD;
        this.partidos = new ArrayList<>();
        this.equipos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPremioEnUSD() {
        return premioEnUSD;
    }

    public void setPremioEnUSD(float premioEnUSD) {
        this.premioEnUSD = premioEnUSD;
    }

    public ArrayList<Partido> getPartidos() {
        return partidos;
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public void agregarEquipo(Equipo equipo) {
        if (isTeamValid(equipo)) {
            this.equipos.add(equipo);
        }
    }

    public boolean isTeamValid(Equipo equipo) {
        return equipo.getCantidadJugadores() == 11 &&
                equipo.tieneUnSoloCapitan() &&
                equipo.checkCamisetas() &&
                !equipo.getTurnos().isEmpty();
    }

    public void generarFixture() {
        int contadorDia = 1;
        for (int i = 0; i < equipos.size(); i++) {
            for (int j = i + 1; j < equipos.size(); j++) {
                Equipo e1 = equipos.get(i);
                Equipo e2 = equipos.get(j);
                String turno = obtenerTurnoComun(e1, e2);

                if (turno != null) {
                    Fecha fechaPartido = new Fecha(contadorDia, 1, 2024);
                    this.partidos.add(new Partido(e1, e2, turno, fechaPartido));
                    contadorDia++;
                } else {
                    System.out.println("No se pudo programar: " + e1.getNombre() + " vs " + e2.getNombre());
                }
            }
        }
    }

    private String obtenerTurnoComun(Equipo e1, Equipo e2) {
        String[] prioridades = {"mañana", "tarde", "noche"};
        for (String p : prioridades) {
            for (String t1 : e1.getTurnos()) {
                if (t1.equalsIgnoreCase(p)) {
                    for (String t2 : e2.getTurnos()) {
                        if (t2.equalsIgnoreCase(p)) {
                            return p;
                        }
                    }
                }
            }
        }
        return null;
    }
}