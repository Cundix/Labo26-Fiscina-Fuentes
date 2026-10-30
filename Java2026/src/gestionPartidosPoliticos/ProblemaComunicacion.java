package gestionPartidosPoliticos;

public class ProblemaComunicacion extends RuntimeException {
    public ProblemaComunicacion(String message) {
        super(message);
    }

    public ProblemaComunicacion(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
