package mascotas;

public class Perro extends Mascota {

    @Override
    public void saludar(String persona) {
        if(persona == this.getNombreOwner()) {
            for (int i = 0; i < this.getAlegria(); i++) {
                System.out.println("guau ");
            }
        }

        else
        {
            for (int i = 0; i < this.getAlegria(); i++) {
                System.out.println("GUAU! ");
            }
        }
        return;

    }

    @Override
    public void alimentar() {
        this.alegria++;
    }

    @Override
    public String conocerEspecie() {
        return this.getClass().getSimpleName();
    }
}
