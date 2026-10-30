package repasoClaudeExVeterinaria;

public class NoHaySuficientesTurnosException extends RuntimeException {
    public NoHaySuficientesTurnosException(String message) {
        super(message);
    }

    public NoHaySuficientesTurnosException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
