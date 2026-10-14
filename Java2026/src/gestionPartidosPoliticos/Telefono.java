package gestionPartidosPoliticos;

public class Telefono implements Comunicador {
    private CompTelefonicas compTelefonica;
    private String nroCelular;

    @Override
    public void enviarMensaje()  // si se deberían hacer chequeos pero son si el celu tiene batería o si tiene senial, y claramente no mandaría el msg si no tiene aunque el programa le diga q lo haga igual JAJAJAJAJA
    {
        System.out.println("Conectando a la antena mas cercana");
    }
}
