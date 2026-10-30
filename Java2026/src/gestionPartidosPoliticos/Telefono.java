package gestionPartidosPoliticos;

public class Telefono implements Comunicador {
    private CompTelefonicas compTelefonica;
    private String nroCelular;
    private float saldoRestante;

    public Telefono(CompTelefonicas compTelefonica, String nroCelular, float saldoRestante) {
        this.compTelefonica = compTelefonica;
        this.nroCelular = nroCelular;
        this.saldoRestante = saldoRestante;
    }

    public Telefono() {
    }

    @Override
    public void enviarMensaje()
    {
        if(this.saldoRestante > 0) System.out.println("Conectando a la antena mas cercana");
        else throw new ProblemaComunicacion("El telefono no tiene saldo");
    }
}
