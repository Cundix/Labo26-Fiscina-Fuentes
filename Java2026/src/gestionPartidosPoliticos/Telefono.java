package gestionPartidosPoliticos;

public class Telefono implements Comunicador {
    private CompTelefonicas compTelefonica;
    private String nroCelular;
    private float saldoRestante;

    @Override
    public void enviarMensaje()
    {
        if(this.saldoRestante > 0) System.out.println("Conectando a la antena mas cercana");
        else throw new ProblemaComunicacion("El telefono no tiene saldo");
    }
}
