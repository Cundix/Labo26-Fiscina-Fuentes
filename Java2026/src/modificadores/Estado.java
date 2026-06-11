package modificadores;

public enum Estado {
    ACTIVADO("ACTIVADO"), DEACTIVADO("DEACTIVADO"), EN_PAUSA("EN PAUSA"), LIBRES("LIBRE"), OCUPADO("OCUPADO");

    private String estado;

    private Estado(String estado) {
        this.estado = estado;
    }
}


