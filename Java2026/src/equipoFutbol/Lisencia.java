package equipoFutbol;

import java.time.LocalDate;

public class Lisencia {
    private String nroLisencia;
    private LocalDate fechaVencimiento;

    public Lisencia()
    {
        this.nroLisencia = "L34598";
        this.fechaVencimiento = LocalDate.of(2030, 4, 3);
    }

    public String getNroLisencia() {
        return nroLisencia;
    }

    public void setNroLisencia(String nroLisencia) {
        this.nroLisencia = nroLisencia;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }


    public boolean vigente()
    {
        if (LocalDate.now().isBefore(this.getFechaVencimiento())) return true;
        else return false;
    }
}
