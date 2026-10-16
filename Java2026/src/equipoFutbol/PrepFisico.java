package equipoFutbol;

public class PrepFisico extends CuerpoTecnico{
    private String especialidad;
    private boolean matriculaHabilidante;

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public boolean isMatriculaHabilidante() {
        return matriculaHabilidante;
    }

    public void setMatriculaHabilidante(boolean matriculaHabilidante) {
        this.matriculaHabilidante = matriculaHabilidante;
    }

    @Override
    public boolean contratable() {
        if(this.isMatriculaHabilidante()) return true;
        else System.out.println("El preparador físico " + this.getNombre() + " no tiene matrícula habilitante");
    }
}
